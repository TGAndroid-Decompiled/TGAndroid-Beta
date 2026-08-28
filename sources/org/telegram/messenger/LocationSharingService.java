package org.telegram.messenger;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import java.util.ArrayList;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class LocationSharingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private e0.t builder;
    private Handler handler;
    private Runnable runnable;

    public LocationSharingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
    }

    private ArrayList<LocationController.SharingLocationInfo> getInfos() {
        ArrayList<LocationController.SharingLocationInfo> arrayList = new ArrayList<>();
        for (int i9 = 0; i9 < 4; i9++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList2 = LocationController.getInstance(i9).sharingLocationsUI;
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
        for (int i9 = 0; i9 < 4; i9++) {
            LocationController.getInstance(i9).update();
        }
    }

    public void lambda$onCreate$1() {
        this.handler.postDelayed(this.runnable, 1000L);
        Utilities.stageQueue.postRunnable(new w1(13));
    }

    private void updateNotification(boolean z10) {
        String formatPluralString;
        String string;
        if (this.builder != null) {
            ArrayList<LocationController.SharingLocationInfo> infos = getInfos();
            if (infos.size() == 1) {
                LocationController.SharingLocationInfo sharingLocationInfo = infos.get(0);
                long dialogId = sharingLocationInfo.messageObject.getDialogId();
                int i9 = sharingLocationInfo.messageObject.currentAccount;
                if (DialogObject.isUserDialog(dialogId)) {
                    formatPluralString = UserObject.getFirstName(MessagesController.getInstance(i9).getUser(Long.valueOf(dialogId)));
                    string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-dialogId));
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
                new e0.n0(ApplicationLoader.applicationContext).d(6, this.builder.b());
            }
        }
    }

    @Override
    public void didReceivedNotification(int i9, int i10, Object... objArr) {
        Handler handler;
        if (i9 == NotificationCenter.liveLocationsChanged && (handler = this.handler) != null) {
            handler.post(new t5(this, 1));
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
        t5 t5Var = new t5(this, 0);
        this.runnable = t5Var;
        handler.postDelayed(t5Var, 1000L);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.runnable);
        }
        stopForeground(true);
        new e0.n0(ApplicationLoader.applicationContext).b(6);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override
    public int onStartCommand(Intent intent, int i9, int i10) {
        if (getInfos().isEmpty()) {
            stopSelf();
        }
        try {
            if (this.builder == null) {
                Intent intent2 = new Intent(ApplicationLoader.applicationContext, LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160);
                e0.t tVar = new e0.t(ApplicationLoader.applicationContext, null);
                this.builder = tVar;
                tVar.E.when = System.currentTimeMillis();
                e0.t tVar2 = this.builder;
                tVar2.E.icon = R.drawable.live_loc;
                tVar2.f4766g = activity;
                NotificationsController.checkOtherNotificationsChannel();
                e0.t tVar3 = this.builder;
                tVar3.f4782y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
                tVar3.g(LocaleController.getString(R.string.AppName));
                this.builder.a(0, LocaleController.getString(R.string.StopLiveLocation), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, new Intent(ApplicationLoader.applicationContext, StopLiveLocationReceiver.class), 167772160));
            }
            updateNotification(false);
            startForeground(6, this.builder.b());
            return 2;
        } catch (Throwable th) {
            FileLog.e(th);
            return 2;
        }
    }
}
