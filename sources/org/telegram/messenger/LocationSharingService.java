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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class LocationSharingService extends Service implements jm7 {
    public static final int d = 0;
    public an7 a;
    public Handler b;
    public md6 c;

    public LocationSharingService() {
        nm7.e().a(this, nm7.H4);
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            ArrayList arrayList2 = dd6.f(i).J;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static void b() {
        cd6 cd6Var;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        for (int i = 0; i < 4; i++) {
            ArrayList arrayList = dd6.f(i).J;
            int i2 = 0;
            while (i2 < arrayList.size()) {
                int i3 = ((cd6) arrayList.get(i2)).c;
                if (i3 == Integer.MAX_VALUE) {
                    z2 = true;
                } else {
                    j = Math.max(j, (i3 - ConnectionsManager.getInstance(cd6Var.e).getCurrentTime()) * 1000);
                }
                i2++;
                z = true;
            }
        }
        if (z) {
            if (z2 || j > 0) {
                try {
                    Context context = a.b;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.setAction("org.tmessages.openlocations");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772160);
                    Intent intent2 = new Intent(context, StopLiveLocationReceiver.class);
                    String M0 = jb6.M0(2131748596, null);
                    lo7.c();
                    an7 an7Var = new an7(context, lo7.k0);
                    an7Var.F.icon = 2131231637;
                    an7Var.e(jb6.M0(2131748595, null));
                    an7Var.d(M0);
                    vm7 vm7Var = new vm7((byte) 0);
                    vm7Var.f = an7.c(M0);
                    an7Var.i(vm7Var);
                    an7Var.g = activity;
                    an7Var.f(16, true);
                    an7Var.a(0, PendingIntent.getBroadcast(context, 2, intent2, 167772160), jb6.M0(2131744527, null));
                    if (!z2) {
                        an7Var.B = j;
                    }
                    new sn7(context).e("live_location_paused", 6, an7Var.b());
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
        }
    }

    public final void c(boolean z) {
        String G;
        String M0;
        if (this.a != null) {
            ArrayList a = a();
            if (a.size() == 1) {
                cd6 cd6Var = (cd6) a.get(0);
                long B0 = k47.B0(cd6Var.h.k);
                int i = cd6Var.h.K1;
                if (pg3.D(B0)) {
                    G = m9c.k(oc7.r1(i).W1(Long.valueOf(B0)), true);
                    M0 = jb6.M0(2131753930, null);
                } else {
                    TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-B0));
                    if (L0 != null) {
                        G = L0.title;
                    } else {
                        G = "";
                    }
                    M0 = jb6.M0(2131753929, null);
                }
            } else {
                G = jb6.G(a.size(), "Chats", new Object[0]);
                M0 = jb6.M0(2131753928, null);
            }
            String format = String.format(M0, jb6.M0(2131753931, null), G);
            this.a.k(format);
            this.a.d(format);
            if (z) {
                new sn7(a.b).e(null, 6, this.a.b());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Handler handler;
        if (i == nm7.H4 && (handler = this.b) != null) {
            handler.post(new md6(this, (byte) 1));
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        Handler handler = new Handler();
        this.b = handler;
        md6 md6Var = new md6(this, (byte) 0);
        this.c = md6Var;
        handler.postDelayed(md6Var, 1000L);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacks(this.c);
        }
        stopForeground(true);
        new sn7(a.b).b(6, null);
        nm7.e().n(this, nm7.H4);
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (a().isEmpty()) {
            stopSelf();
            return 2;
        }
        try {
            if (this.a == null) {
                Intent intent2 = new Intent(a.b, LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(a.b, 0, intent2, 167772160);
                an7 an7Var = new an7(a.b, null);
                this.a = an7Var;
                an7Var.F.when = System.currentTimeMillis();
                an7 an7Var2 = this.a;
                an7Var2.F.icon = 2131231637;
                an7Var2.g = activity;
                lo7.c();
                an7 an7Var3 = this.a;
                an7Var3.y = lo7.k0;
                an7Var3.e(jb6.M0(2131689472, null));
                Intent intent3 = new Intent(a.b, StopLiveLocationReceiver.class);
                this.a.a(0, PendingIntent.getBroadcast(a.b, 2, intent3, 167772160), jb6.M0(2131744527, null));
            }
            c(false);
            Notification b = this.a.b();
            if (Build.VERSION.SDK_INT < 29) {
                startForeground(6, b);
            } else {
                startForeground(6, b, 8);
            }
            new sn7(a.b).b(6, "live_location_paused");
            return 2;
        } catch (Throwable th) {
            fc4.g(th, true);
            return 2;
        }
    }
}
