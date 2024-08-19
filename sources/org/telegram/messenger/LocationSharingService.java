package org.telegram.messenger;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayList;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.ui.LaunchActivity;

public class LocationSharingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private NotificationCompat.Builder builder;
    private Handler handler;
    private Runnable runnable;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public LocationSharingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                LocationSharingService.this.lambda$onCreate$1();
            }
        };
        this.runnable = runnable;
        this.handler.postDelayed(runnable, 1000L);
    }

    public void lambda$onCreate$1() {
        this.handler.postDelayed(this.runnable, 1000L);
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationSharingService.lambda$onCreate$0();
            }
        });
    }

    public static void lambda$onCreate$0() {
        for (int i = 0; i < 4; i++) {
            LocationController.getInstance(i).update();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.runnable);
        }
        stopForeground(true);
        NotificationManagerCompat.from(ApplicationLoader.applicationContext).cancel(6);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Handler handler;
        if (i != NotificationCenter.liveLocationsChanged || (handler = this.handler) == null) {
            return;
        }
        handler.post(new Runnable() {
            @Override
            public final void run() {
                LocationSharingService.this.lambda$didReceivedNotification$2();
            }
        });
    }

    public void lambda$didReceivedNotification$2() {
        if (getInfos().isEmpty()) {
            stopSelf();
        } else {
            updateNotification(true);
        }
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

    private void updateNotification(boolean z) {
        String formatPluralString;
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
                formatPluralString = UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(dialogId)));
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
            } else {
                TLRPC$Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-dialogId));
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
        this.builder.setTicker(format);
        this.builder.setContentText(format);
        if (z) {
            NotificationManagerCompat.from(ApplicationLoader.applicationContext).notify(6, this.builder.build());
        }
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
                NotificationCompat.Builder builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                this.builder = builder;
                builder.setWhen(System.currentTimeMillis());
                this.builder.setSmallIcon(R.drawable.live_loc);
                this.builder.setContentIntent(activity);
                NotificationsController.checkOtherNotificationsChannel();
                this.builder.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
                this.builder.setContentTitle(LocaleController.getString(R.string.AppName));
                this.builder.addAction(0, LocaleController.getString(R.string.StopLiveLocation), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, new Intent(ApplicationLoader.applicationContext, (Class<?>) StopLiveLocationReceiver.class), 167772160));
            }
            updateNotification(false);
            startForeground(6, this.builder.build());
        } catch (Throwable th) {
            FileLog.e(th);
        }
        return 2;
    }
}
