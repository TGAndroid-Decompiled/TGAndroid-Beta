package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.g2;
public final class VoIPPendingCall {
    private AccountInstance accountInstance;
    private final Activity activity;
    private Handler handler;
    private NotificationCenter notificationCenter;
    private final NotificationCenter.NotificationCenterDelegate observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j10, boolean z4, long j11, AccountInstance accountInstance) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                VoIPPendingCall.this.lambda$new$0(i10, i11, objArr);
            }
        };
        this.observer = notificationCenterDelegate;
        s0 s0Var = new s0(this, 2);
        this.releaseRunnable = s0Var;
        this.activity = activity;
        this.userId = j10;
        this.video = z4;
        this.accountInstance = accountInstance;
        if (!onConnectionStateUpdated(false)) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
            this.notificationCenter = notificationCenter;
            notificationCenter.addObserver(notificationCenterDelegate, NotificationCenter.didUpdateConnectionState);
            Handler handler = new Handler(Looper.myLooper());
            this.handler = handler;
            handler.postDelayed(s0Var, j11);
        }
    }

    private boolean isAirplaneMode() {
        if (Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    private boolean isConnected(AccountInstance accountInstance) {
        if (accountInstance.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            onConnectionStateUpdated(false);
        }
    }

    public void lambda$new$1() {
        onConnectionStateUpdated(true);
    }

    private boolean onConnectionStateUpdated(boolean z4) {
        boolean z10;
        if (this.released || (!z4 && !isConnected(this.accountInstance) && !isAirplaneMode())) {
            return false;
        }
        MessagesController messagesController = this.accountInstance.getMessagesController();
        TLRPC.User user = messagesController.getUser(Long.valueOf(this.userId));
        if (user != null) {
            TLRPC.UserFull userFull = messagesController.getUserFull(user.f20992id);
            boolean z11 = this.video;
            if (userFull != null && userFull.video_calls_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            g2.m(user, z11, z10, this.activity, userFull, this.accountInstance);
        } else if (isAirplaneMode()) {
            g2.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j10, boolean z4, AccountInstance accountInstance) {
        return new VoIPPendingCall(activity, j10, z4, 1000L, accountInstance);
    }

    public void release() {
        if (!this.released) {
            NotificationCenter notificationCenter = this.notificationCenter;
            if (notificationCenter != null) {
                notificationCenter.removeObserver(this.observer, NotificationCenter.didUpdateConnectionState);
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.releaseRunnable);
            }
            this.released = true;
        }
    }
}
