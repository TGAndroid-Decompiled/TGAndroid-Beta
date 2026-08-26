package org.telegram.messenger;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

public class LocationSharingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private NotificationCompat$Builder builder;
    private Handler handler;
    private Runnable runnable;

    public LocationSharingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
    }

    private ArrayList<LocationController.SharingLocationInfo> getInfos() {
        ArrayList<LocationController.SharingLocationInfo> arrayList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList2 = LocationController.getInstance(i).sharingLocationsUI;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public void lambda$didReceivedNotification$2() {
        if (getInfos().isEmpty()) {
            stopSelf();
        } else {
            updateNotification(true);
        }
    }

    public static void lambda$onCreate$0() {
        for (int i = 0; i < 4; i++) {
            LocationController.getInstance(i).update();
        }
    }

    public void lambda$onCreate$1() {
        this.handler.postDelayed(this.runnable, 1000L);
        Utilities.stageQueue.postRunnable(new Emoji$$ExternalSyntheticLambda1(13));
    }

    private void updateNotification(boolean z) {
        String pluralString;
        String string;
        if (this.builder == null) {
            return;
        }
        ArrayList<LocationController.SharingLocationInfo> infos = getInfos();
        if (infos.size() == 1) {
            LocationController.SharingLocationInfo sharingLocationInfo = infos.get(0);
            long dialogId = sharingLocationInfo.messageObject.getDialogId();
            int i = sharingLocationInfo.messageObject.currentAccount;
            if (DialogObject.isUserDialog(dialogId)) {
                pluralString = UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(dialogId)));
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-dialogId));
                pluralString = chat != null ? chat.title : "";
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
            }
        } else {
            pluralString = LocaleController.formatPluralString("Chats", infos.size(), new Object[0]);
            string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
        }
        String str = String.format(string, LocaleController.getString(R.string.AttachLiveLocation), pluralString);
        this.builder.setTicker(str);
        this.builder.setContentText(str);
        if (z) {
            new NotificationManagerCompat(ApplicationLoader.applicationContext).notify(6, this.builder.build());
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Handler handler;
        if (i != NotificationCenter.liveLocationsChanged || (handler = this.handler) == null) {
            return;
        }
        handler.post(new LocationSharingService$$ExternalSyntheticLambda1(this, 1));
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
        LocationSharingService$$ExternalSyntheticLambda1 locationSharingService$$ExternalSyntheticLambda1 = new LocationSharingService$$ExternalSyntheticLambda1(this, 0);
        this.runnable = locationSharingService$$ExternalSyntheticLambda1;
        handler.postDelayed(locationSharingService$$ExternalSyntheticLambda1, 1000L);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.runnable);
        }
        stopForeground(true);
        new NotificationManagerCompat(ApplicationLoader.applicationContext).cancel(6);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        if (getInfos().isEmpty()) {
            stopSelf();
        }
        try {
            if (this.builder == null) {
                Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160);
                NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(ApplicationLoader.applicationContext, null);
                this.builder = notificationCompat$Builder;
                notificationCompat$Builder.mNotification.when = System.currentTimeMillis();
                NotificationCompat$Builder notificationCompat$Builder2 = this.builder;
                notificationCompat$Builder2.mNotification.icon = R.drawable.live_loc;
                notificationCompat$Builder2.mContentIntent = activity;
                NotificationsController.checkOtherNotificationsChannel();
                NotificationCompat$Builder notificationCompat$Builder3 = this.builder;
                notificationCompat$Builder3.mChannelId = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
                notificationCompat$Builder3.setContentTitle(LocaleController.getString(R.string.AppName));
                this.builder.addAction(0, LocaleController.getString(R.string.StopLiveLocation), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, new Intent(ApplicationLoader.applicationContext, (Class<?>) StopLiveLocationReceiver.class), 167772160));
            }
            updateNotification(false);
            startForeground(6, this.builder.build());
            return 2;
        } catch (Throwable th) {
            FileLog.e(th);
            return 2;
        }
    }
}
