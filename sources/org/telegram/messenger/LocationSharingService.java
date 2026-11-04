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
public class LocationSharingService extends Service implements cs {
    public static final int d = 0;
    public e0.q f21291a;
    public Handler f21292b;
    public md f21293c;

    public LocationSharingService() {
        hs.e().b(this, hs.D4);
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 4; i3++) {
            ArrayList arrayList2 = ld.f(i3).J;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static void b() {
        kd kdVar;
        boolean z10 = false;
        boolean z11 = false;
        long j10 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            ArrayList arrayList = ld.f(i3).J;
            int i10 = 0;
            while (i10 < arrayList.size()) {
                int i11 = ((kd) arrayList.get(i10)).f23812c;
                if (i11 == Integer.MAX_VALUE) {
                    z11 = true;
                } else {
                    j10 = Math.max(j10, (i11 - ConnectionsManager.getInstance(kdVar.f23813e).getCurrentTime()) * 1000);
                }
                i10++;
                z10 = true;
            }
        }
        if (z10) {
            if (z11 || j10 > 0) {
                try {
                    Context context = t0.f25457b;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.setAction("org.tmessages.openlocations");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772160);
                    Intent intent2 = new Intent(context, StopLiveLocationReceiver.class);
                    String M0 = bd.M0(2131748847, null);
                    us.i();
                    e0.q qVar = new e0.q(context, us.f25747k0);
                    qVar.F.icon = 2131231632;
                    qVar.g(bd.M0(2131748846, null));
                    qVar.f(M0);
                    e0.l lVar = new e0.l(false);
                    lVar.f9270f = e0.q.d(M0);
                    qVar.n(lVar);
                    qVar.f9283g = activity;
                    qVar.h(16, true);
                    qVar.a(0, PendingIntent.getBroadcast(context, 2, intent2, 167772160), bd.M0(2131744848, null));
                    if (!z11) {
                        qVar.B = j10;
                    }
                    new e0.j0(context).e("live_location_paused", 6, qVar.b());
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public final void c(boolean z10) {
        String G;
        String M0;
        if (this.f21291a != null) {
            ArrayList a10 = a();
            if (a10.size() == 1) {
                kd kdVar = (kd) a10.get(0);
                long B0 = zi.B0(kdVar.h.f26868k);
                int i3 = kdVar.h.I1;
                if (m5.E(B0)) {
                    G = l10.j(hp.s1(i3).a2(Long.valueOf(B0)), true);
                    M0 = bd.M0(2131753965, null);
                } else {
                    TLRPC.Chat M02 = hp.s1(i3).M0(Long.valueOf(-B0));
                    if (M02 != null) {
                        G = M02.title;
                    } else {
                        G = "";
                    }
                    M0 = bd.M0(2131753964, null);
                }
            } else {
                G = bd.G(a10.size(), "Chats", new Object[0]);
                M0 = bd.M0(2131753963, null);
            }
            String format = String.format(M0, bd.M0(2131753966, null), G);
            this.f21291a.p(format);
            this.f21291a.f(format);
            if (z10) {
                new e0.j0(t0.f25457b).e(null, 6, this.f21291a.b());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Handler handler;
        if (i3 == hs.D4 && (handler = this.f21292b) != null) {
            handler.post(new md(this, 1));
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
        this.f21292b = handler;
        md mdVar = new md(this, 0);
        this.f21293c = mdVar;
        handler.postDelayed(mdVar, 1000L);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.f21292b;
        if (handler != null) {
            handler.removeCallbacks(this.f21293c);
        }
        stopForeground(true);
        new e0.j0(t0.f25457b).b(6, null);
        hs.e().n(this, hs.D4);
    }

    @Override
    public final int onStartCommand(Intent intent, int i3, int i10) {
        if (a().isEmpty()) {
            stopSelf();
            return 2;
        }
        try {
            if (this.f21291a == null) {
                Intent intent2 = new Intent(t0.f25457b, LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(t0.f25457b, 0, intent2, 167772160);
                e0.q qVar = new e0.q(t0.f25457b, null);
                this.f21291a = qVar;
                qVar.F.when = System.currentTimeMillis();
                e0.q qVar2 = this.f21291a;
                qVar2.F.icon = 2131231632;
                qVar2.f9283g = activity;
                us.i();
                e0.q qVar3 = this.f21291a;
                qVar3.f9299y = us.f25747k0;
                qVar3.g(bd.M0(2131689472, null));
                Intent intent3 = new Intent(t0.f25457b, StopLiveLocationReceiver.class);
                this.f21291a.a(0, PendingIntent.getBroadcast(t0.f25457b, 2, intent3, 167772160), bd.M0(2131744848, null));
            }
            c(false);
            Notification b10 = this.f21291a.b();
            if (Build.VERSION.SDK_INT < 29) {
                startForeground(6, b10);
            } else {
                startForeground(6, b10, 8);
            }
            new e0.j0(t0.f25457b).b(6, "live_location_paused");
            return 2;
        } catch (Throwable th2) {
            a8.g(th2, true);
            return 2;
        }
    }
}
