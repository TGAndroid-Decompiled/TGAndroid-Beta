package org.telegram.messenger;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import java.util.ArrayList;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class LocationSharingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private static final String PAUSED_NOTIFICATION_TAG = "live_location_paused";
    private e0.q builder;
    private Handler handler;
    private Runnable runnable;

    public LocationSharingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
    }

    private ArrayList<LocationController.SharingLocationInfo> getInfos() {
        ArrayList<LocationController.SharingLocationInfo> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList2 = LocationController.getInstance(i10).sharingLocationsUI;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static void hidePausedNotification() {
        new e0.j0(ApplicationLoader.applicationContext).b(6, "live_location_paused");
    }

    public void lambda$didReceivedNotification$2() {
        if (getInfos().isEmpty()) {
            stopSelf();
        } else {
            updateNotification(true);
        }
    }

    public static void lambda$onCreate$0() {
        for (int i10 = 0; i10 < 4; i10++) {
            LocationController.getInstance(i10).update();
        }
    }

    public void lambda$onCreate$1() {
        this.handler.postDelayed(this.runnable, 1000L);
        Utilities.stageQueue.postRunnable(new a2(16));
    }

    public static void showPausedNotification() {
        LocationController.SharingLocationInfo sharingLocationInfo;
        boolean z10 = false;
        boolean z11 = false;
        long j10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i10).sharingLocationsUI;
            int i11 = 0;
            while (i11 < arrayList.size()) {
                int i12 = arrayList.get(i11).stopTime;
                if (i12 == Integer.MAX_VALUE) {
                    z11 = true;
                } else {
                    j10 = Math.max(j10, (i12 - ConnectionsManager.getInstance(sharingLocationInfo.account).getCurrentTime()) * 1000);
                }
                i11++;
                z10 = true;
            }
        }
        if (z10) {
            if (z11 || j10 > 0) {
                try {
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.setAction("org.tmessages.openlocations");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772160);
                    Intent intent2 = new Intent(context, StopLiveLocationReceiver.class);
                    String string = LocaleController.getString(R.string.LiveLocationPausedText);
                    NotificationsController.checkOtherNotificationsChannel();
                    e0.q qVar = new e0.q(context, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
                    qVar.F.icon = R.drawable.live_loc;
                    qVar.g(LocaleController.getString(R.string.LiveLocationPausedTitle));
                    qVar.f(string);
                    e0.l lVar = new e0.l(false);
                    lVar.f9564f = e0.q.d(string);
                    qVar.n(lVar);
                    qVar.f9580g = activity;
                    qVar.h(16, true);
                    qVar.a(0, LocaleController.getString(R.string.StopLiveLocation), PendingIntent.getBroadcast(context, 2, intent2, 167772160));
                    if (!z11) {
                        qVar.B = j10;
                    }
                    new e0.j0(context).e("live_location_paused", 6, qVar.b());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        }
    }

    private boolean startForegroundCompat(Notification notification) {
        if (Build.VERSION.SDK_INT < 29) {
            startForeground(6, notification);
            return true;
        }
        try {
            startForeground(6, notification, 8);
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    private void updateNotification(boolean z10) {
        String formatPluralString;
        String string;
        if (this.builder != null) {
            ArrayList<LocationController.SharingLocationInfo> infos = getInfos();
            if (infos.size() == 1) {
                LocationController.SharingLocationInfo sharingLocationInfo = infos.get(0);
                long dialogId = sharingLocationInfo.messageObject.getDialogId();
                int i10 = sharingLocationInfo.messageObject.currentAccount;
                if (DialogObject.isUserDialog(dialogId)) {
                    formatPluralString = UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(dialogId)));
                    string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialogId));
                    if (chat != null) {
                        formatPluralString = chat.title;
                    } else {
                        formatPluralString = "";
                    }
                    string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
                }
            } else {
                formatPluralString = LocaleController.formatPluralString("Chats", infos.size(), new Object[0]);
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
            }
            String format = String.format(string, LocaleController.getString(R.string.AttachLiveLocation), formatPluralString);
            this.builder.p(format);
            this.builder.f(format);
            if (z10) {
                new e0.j0(ApplicationLoader.applicationContext).e(null, 6, this.builder.b());
            }
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        Handler handler;
        if (i10 == NotificationCenter.liveLocationsChanged && (handler = this.handler) != null) {
            handler.post(new b6(this, 1));
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Handler handler = new Handler();
        this.handler = handler;
        b6 b6Var = new b6(this, 0);
        this.runnable = b6Var;
        handler.postDelayed(b6Var, 1000L);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.runnable);
        }
        stopForeground(true);
        new e0.j0(ApplicationLoader.applicationContext).b(6, null);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (getInfos().isEmpty()) {
            stopSelf();
            return 2;
        }
        try {
            if (this.builder == null) {
                Intent intent2 = new Intent(ApplicationLoader.applicationContext, LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160);
                e0.q qVar = new e0.q(ApplicationLoader.applicationContext, null);
                this.builder = qVar;
                qVar.F.when = System.currentTimeMillis();
                e0.q qVar2 = this.builder;
                qVar2.F.icon = R.drawable.live_loc;
                qVar2.f9580g = activity;
                NotificationsController.checkOtherNotificationsChannel();
                e0.q qVar3 = this.builder;
                qVar3.f9596y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
                qVar3.g(LocaleController.getString(R.string.AppName));
                this.builder.a(0, LocaleController.getString(R.string.StopLiveLocation), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, new Intent(ApplicationLoader.applicationContext, StopLiveLocationReceiver.class), 167772160));
            }
            updateNotification(false);
            if (!startForegroundCompat(this.builder.b())) {
                showPausedNotification();
                stopSelf();
                return 2;
            }
            hidePausedNotification();
            return 2;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return 2;
        }
    }
}
