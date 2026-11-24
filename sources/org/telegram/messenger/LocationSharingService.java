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
public class LocationSharingService extends Service implements gk7 {
    public static final int d = 0;
    public xk7 a;
    public Handler b;
    public nb6 c;

    public LocationSharingService() {
        kk7.e().a(this, kk7.F4);
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            ArrayList arrayList2 = eb6.f(i).J;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static void b() {
        db6 db6Var;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        for (int i = 0; i < 4; i++) {
            ArrayList arrayList = eb6.f(i).J;
            int i2 = 0;
            while (i2 < arrayList.size()) {
                int i3 = ((db6) arrayList.get(i2)).c;
                if (i3 == Integer.MAX_VALUE) {
                    z2 = true;
                } else {
                    j = Math.max(j, (i3 - ConnectionsManager.getInstance(db6Var.e).getCurrentTime()) * 1000);
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
                    String M0 = k96.M0(2131748647, null);
                    im7.c();
                    xk7 xk7Var = new xk7(context, im7.k0);
                    xk7Var.F.icon = 2131231636;
                    xk7Var.e(k96.M0(2131748646, null));
                    xk7Var.d(M0);
                    sk7 sk7Var = new sk7((byte) 0);
                    sk7Var.f = xk7.c(M0);
                    xk7Var.i(sk7Var);
                    xk7Var.g = activity;
                    xk7Var.f(16, true);
                    xk7Var.a(0, PendingIntent.getBroadcast(context, 2, intent2, 167772160), k96.M0(2131744601, null));
                    if (!z2) {
                        xk7Var.B = j;
                    }
                    new pl7(context).e("live_location_paused", 6, xk7Var.b());
                } catch (Throwable th) {
                    fa4.g(th, true);
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
                db6 db6Var = (db6) a.get(0);
                long B0 = k27.B0(db6Var.h.k);
                int i = db6Var.h.K1;
                if (cf3.D(B0)) {
                    G = l7c.k(na7.q1(i).V1(Long.valueOf(B0)), true);
                    M0 = k96.M0(2131753962, null);
                } else {
                    TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-B0));
                    if (K0 != null) {
                        G = K0.title;
                    } else {
                        G = "";
                    }
                    M0 = k96.M0(2131753961, null);
                }
            } else {
                G = k96.G(a.size(), "Chats", new Object[0]);
                M0 = k96.M0(2131753960, null);
            }
            String format = String.format(M0, k96.M0(2131753963, null), G);
            this.a.k(format);
            this.a.d(format);
            if (z) {
                new pl7(a.b).e(null, 6, this.a.b());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Handler handler;
        if (i == kk7.F4 && (handler = this.b) != null) {
            handler.post(new nb6(this, (byte) 1));
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
        nb6 nb6Var = new nb6(this, (byte) 0);
        this.c = nb6Var;
        handler.postDelayed(nb6Var, 1000L);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacks(this.c);
        }
        stopForeground(true);
        new pl7(a.b).b(6, null);
        kk7.e().n(this, kk7.F4);
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
                xk7 xk7Var = new xk7(a.b, null);
                this.a = xk7Var;
                xk7Var.F.when = System.currentTimeMillis();
                xk7 xk7Var2 = this.a;
                xk7Var2.F.icon = 2131231636;
                xk7Var2.g = activity;
                im7.c();
                xk7 xk7Var3 = this.a;
                xk7Var3.y = im7.k0;
                xk7Var3.e(k96.M0(2131689472, null));
                Intent intent3 = new Intent(a.b, StopLiveLocationReceiver.class);
                this.a.a(0, PendingIntent.getBroadcast(a.b, 2, intent3, 167772160), k96.M0(2131744601, null));
            }
            c(false);
            Notification b = this.a.b();
            if (Build.VERSION.SDK_INT < 29) {
                startForeground(6, b);
            } else {
                startForeground(6, b, 8);
            }
            new pl7(a.b).b(6, "live_location_paused");
            return 2;
        } catch (Throwable th) {
            fa4.g(th, true);
            return 2;
        }
    }
}
