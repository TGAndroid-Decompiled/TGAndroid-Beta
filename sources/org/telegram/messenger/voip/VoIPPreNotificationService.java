package org.telegram.messenger.voip;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Vibrator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$PhoneCall;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPhoneCall;
import org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonBusy;
import org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonDisconnect;
import org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonHangup;
import org.telegram.tgnet.TLRPC$TL_phoneCallDiscardReasonMissed;
import org.telegram.tgnet.TLRPC$TL_phoneCallDiscarded;
import org.telegram.tgnet.TLRPC$TL_phone_discardCall;
import org.telegram.tgnet.TLRPC$TL_phone_receivedCall;
import org.telegram.tgnet.TLRPC$TL_updates;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.VoIPPermissionActivity;

public class VoIPPreNotificationService {
    public static TLRPC$PhoneCall pendingCall;
    public static Intent pendingVoIP;
    private static MediaPlayer ringtonePlayer;
    private static final Object sync = new Object();
    private static Vibrator vibrator;

    private static android.app.Notification makeNotification(android.content.Context r17, int r18, long r19, long r21, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPPreNotificationService.makeNotification(android.content.Context, int, long, long, boolean):android.app.Notification");
    }

    private static void startRinging(android.content.Context r11, int r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPPreNotificationService.startRinging(android.content.Context, int, long):void");
    }

    public static void lambda$startRinging$0(MediaPlayer mediaPlayer) {
        try {
            ringtonePlayer.start();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private static void stopRinging() {
        synchronized (sync) {
            try {
                MediaPlayer mediaPlayer = ringtonePlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    ringtonePlayer.release();
                    ringtonePlayer = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null) {
            vibrator2.cancel();
            vibrator = null;
        }
    }

    public static void show(final Context context, final Intent intent, final TLRPC$PhoneCall tLRPC$PhoneCall) {
        FileLog.d("VoIPPreNotification.show()");
        if (tLRPC$PhoneCall == null || intent == null) {
            dismiss(context);
            FileLog.d("VoIPPreNotification.show(): call or intent is null");
            return;
        }
        TLRPC$PhoneCall tLRPC$PhoneCall2 = pendingCall;
        if (tLRPC$PhoneCall2 == null || tLRPC$PhoneCall2.id != tLRPC$PhoneCall.id) {
            dismiss(context);
            pendingVoIP = intent;
            pendingCall = tLRPC$PhoneCall;
            final int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
            final long longExtra = intent.getLongExtra("user_id", 0L);
            final boolean z = tLRPC$PhoneCall.video;
            acknowledge(context, intExtra, tLRPC$PhoneCall, new Runnable() {
                @Override
                public final void run() {
                    VoIPPreNotificationService.lambda$show$1(intent, tLRPC$PhoneCall, context, intExtra, longExtra, z);
                }
            });
        }
    }

    public static void lambda$show$1(Intent intent, TLRPC$PhoneCall tLRPC$PhoneCall, Context context, int i, long j, boolean z) {
        pendingVoIP = intent;
        pendingCall = tLRPC$PhoneCall;
        ((NotificationManager) context.getSystemService("notification")).notify(203, makeNotification(context, i, j, tLRPC$PhoneCall.id, z));
        startRinging(context, i, j);
    }

    private static void acknowledge(final Context context, int i, TLRPC$PhoneCall tLRPC$PhoneCall, final Runnable runnable) {
        if (tLRPC$PhoneCall instanceof TLRPC$TL_phoneCallDiscarded) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("Call " + tLRPC$PhoneCall.id + " was discarded before the voip pre notification started, stopping");
            }
            pendingVoIP = null;
            pendingCall = null;
            return;
        }
        if (XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020) && ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
            }
            pendingVoIP = null;
            pendingCall = null;
            return;
        }
        TLRPC$TL_phone_receivedCall tLRPC$TL_phone_receivedCall = new TLRPC$TL_phone_receivedCall();
        TLRPC$TL_inputPhoneCall tLRPC$TL_inputPhoneCall = new TLRPC$TL_inputPhoneCall();
        tLRPC$TL_phone_receivedCall.peer = tLRPC$TL_inputPhoneCall;
        tLRPC$TL_inputPhoneCall.id = tLRPC$PhoneCall.id;
        tLRPC$TL_inputPhoneCall.access_hash = tLRPC$PhoneCall.access_hash;
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_phone_receivedCall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                VoIPPreNotificationService.lambda$acknowledge$3(context, runnable, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public static void lambda$acknowledge$3(final Context context, final Runnable runnable, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPPreNotificationService.lambda$acknowledge$2(TLObject.this, tLRPC$TL_error, context, runnable);
            }
        });
    }

    public static void lambda$acknowledge$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, Context context, Runnable runnable) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("(VoIPPreNotification) receivedCall response = " + tLObject);
        }
        if (tLRPC$TL_error == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("error on receivedCall: " + tLRPC$TL_error);
        }
        pendingVoIP = null;
        pendingCall = null;
        dismiss(context);
    }

    public static boolean open(Context context) {
        if (VoIPService.getSharedInstance() != null) {
            return true;
        }
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            return false;
        }
        intent.getIntExtra("account", UserConfig.selectedAccount);
        pendingVoIP.putExtra("openFragment", true);
        pendingVoIP.putExtra("accept", false);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(pendingVoIP);
        } else {
            context.startService(pendingVoIP);
        }
        pendingVoIP = null;
        dismiss(context);
        return true;
    }

    public static boolean isVideo() {
        Intent intent = pendingVoIP;
        return intent != null && intent.getBooleanExtra("video", false);
    }

    public static void answer(Context context) {
        FileLog.d("VoIPPreNotification.answer()");
        Intent intent = pendingVoIP;
        if (intent == null) {
            FileLog.d("VoIPPreNotification.answer(): pending intent is not found");
            return;
        }
        intent.getIntExtra("account", UserConfig.selectedAccount);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().acceptIncomingCall();
        } else {
            pendingVoIP.putExtra("openFragment", true);
            if (!PermissionRequest.hasPermission("android.permission.RECORD_AUDIO") || (isVideo() && !PermissionRequest.hasPermission("android.permission.CAMERA"))) {
                try {
                    PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) VoIPPermissionActivity.class).addFlags(268435456), 1107296256).send();
                    return;
                } catch (Exception e) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("Error starting permission activity", e);
                        return;
                    }
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(pendingVoIP);
            } else {
                context.startService(pendingVoIP);
            }
            pendingVoIP = null;
        }
        dismiss(context);
    }

    public static void decline(Context context, int i) {
        FileLog.d("VoIPPreNotification.decline(" + i + ")");
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            FileLog.d("VoIPPreNotification.decline(" + i + "): pending intent or call is not found");
            return;
        }
        final int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
        TLRPC$TL_phone_discardCall tLRPC$TL_phone_discardCall = new TLRPC$TL_phone_discardCall();
        TLRPC$TL_inputPhoneCall tLRPC$TL_inputPhoneCall = new TLRPC$TL_inputPhoneCall();
        tLRPC$TL_phone_discardCall.peer = tLRPC$TL_inputPhoneCall;
        TLRPC$PhoneCall tLRPC$PhoneCall = pendingCall;
        tLRPC$TL_inputPhoneCall.access_hash = tLRPC$PhoneCall.access_hash;
        tLRPC$TL_inputPhoneCall.id = tLRPC$PhoneCall.id;
        tLRPC$TL_phone_discardCall.duration = 0;
        tLRPC$TL_phone_discardCall.connection_id = 0L;
        if (i == 2) {
            tLRPC$TL_phone_discardCall.reason = new TLRPC$TL_phoneCallDiscardReasonDisconnect();
        } else if (i == 3) {
            tLRPC$TL_phone_discardCall.reason = new TLRPC$TL_phoneCallDiscardReasonMissed();
        } else if (i == 4) {
            tLRPC$TL_phone_discardCall.reason = new TLRPC$TL_phoneCallDiscardReasonBusy();
        } else {
            tLRPC$TL_phone_discardCall.reason = new TLRPC$TL_phoneCallDiscardReasonHangup();
        }
        FileLog.e("discardCall " + tLRPC$TL_phone_discardCall.reason);
        ConnectionsManager.getInstance(intExtra).sendRequest(tLRPC$TL_phone_discardCall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                VoIPPreNotificationService.lambda$decline$4(intExtra, tLObject, tLRPC$TL_error);
            }
        }, 2);
        dismiss(context);
    }

    public static void lambda$decline$4(int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("(VoIPPreNotification) error on phone.discardCall: " + tLRPC$TL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC$TL_updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC$TL_updates) tLObject, false);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("(VoIPPreNotification) phone.discardCall " + tLObject);
        }
    }

    public static void dismiss(Context context) {
        FileLog.d("VoIPPreNotification.dismiss()");
        pendingVoIP = null;
        pendingCall = null;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        stopRinging();
    }
}
