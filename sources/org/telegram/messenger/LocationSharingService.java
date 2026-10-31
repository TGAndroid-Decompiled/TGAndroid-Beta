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
public class LocationSharingService extends Service implements us {
    public static final int d = 0;
    public e0.r f14429a;
    public Handler f14430b;
    public od f14431c;

    public LocationSharingService() {
        zs.e().b(this, zs.D4);
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList2 = nd.f(i10).I;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static void b() {
        md mdVar;
        boolean z10 = false;
        boolean z11 = false;
        long j10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList = nd.f(i10).I;
            int i11 = 0;
            while (i11 < arrayList.size()) {
                int i12 = ((md) arrayList.get(i11)).f16942c;
                if (i12 == Integer.MAX_VALUE) {
                    z11 = true;
                } else {
                    j10 = Math.max(j10, (i12 - ConnectionsManager.getInstance(mdVar.e).getCurrentTime()) * 1000);
                }
                i11++;
                z10 = true;
            }
        }
        if (z10) {
            if (z11 || j10 > 0) {
                try {
                    Context context = w0.f19025b;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.setAction("org.tmessages.openlocations");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772160);
                    Intent intent2 = new Intent(context, StopLiveLocationReceiver.class);
                    String L0 = cd.L0(2131748849, null);
                    ot.i();
                    e0.r rVar = new e0.r(context, ot.f17303j0);
                    rVar.F.icon = 2131231633;
                    rVar.g(cd.L0(2131748848, null));
                    rVar.f(L0);
                    e0.m mVar = new e0.m(false);
                    mVar.f6049f = e0.r.d(L0);
                    rVar.n(mVar);
                    rVar.f6061g = activity;
                    rVar.h(16, true);
                    rVar.a(0, cd.L0(2131744856, null), PendingIntent.getBroadcast(context, 2, intent2, 167772160));
                    if (!z11) {
                        rVar.B = j10;
                    }
                    new e0.k0(context).e("live_location_paused", 6, rVar.b());
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        }
    }

    public final void c(boolean z10) {
        String G;
        String L0;
        if (this.f14429a != null) {
            ArrayList a2 = a();
            if (a2.size() == 1) {
                md mdVar = (md) a2.get(0);
                long B0 = jj.B0(mdVar.h.f16337k);
                int i10 = mdVar.h.I1;
                if (o5.E(B0)) {
                    G = h20.j(vp.r1(i10).Z1(Long.valueOf(B0)), true);
                    L0 = cd.L0(2131753965, null);
                } else {
                    TLRPC.Chat L02 = vp.r1(i10).L0(Long.valueOf(-B0));
                    if (L02 != null) {
                        G = L02.title;
                    } else {
                        G = "";
                    }
                    L0 = cd.L0(2131753964, null);
                }
            } else {
                G = cd.G(a2.size(), "Chats", new Object[0]);
                L0 = cd.L0(2131753963, null);
            }
            String format = String.format(L0, cd.L0(2131753966, null), G);
            this.f14429a.p(format);
            this.f14429a.f(format);
            if (z10) {
                new e0.k0(w0.f19025b).e(null, 6, this.f14429a.b());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Handler handler;
        if (i10 == zs.D4 && (handler = this.f14430b) != null) {
            handler.post(new od(this, 1));
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
        this.f14430b = handler;
        od odVar = new od(this, 0);
        this.f14431c = odVar;
        handler.postDelayed(odVar, 1000L);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.f14430b;
        if (handler != null) {
            handler.removeCallbacks(this.f14431c);
        }
        stopForeground(true);
        new e0.k0(w0.f19025b).b(6, null);
        zs.e().n(this, zs.D4);
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (a().isEmpty()) {
            stopSelf();
            return 2;
        }
        try {
            if (this.f14429a == null) {
                Intent intent2 = new Intent(w0.f19025b, LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(w0.f19025b, 0, intent2, 167772160);
                e0.r rVar = new e0.r(w0.f19025b, null);
                this.f14429a = rVar;
                rVar.F.when = System.currentTimeMillis();
                e0.r rVar2 = this.f14429a;
                rVar2.F.icon = 2131231633;
                rVar2.f6061g = activity;
                ot.i();
                e0.r rVar3 = this.f14429a;
                rVar3.f6077y = ot.f17303j0;
                rVar3.g(cd.L0(2131689472, null));
                this.f14429a.a(0, cd.L0(2131744856, null), PendingIntent.getBroadcast(w0.f19025b, 2, new Intent(w0.f19025b, StopLiveLocationReceiver.class), 167772160));
            }
            c(false);
            Notification b10 = this.f14429a.b();
            if (Build.VERSION.SDK_INT < 29) {
                startForeground(6, b10);
            } else {
                startForeground(6, b10, 8);
            }
            new e0.k0(w0.f19025b).b(6, "live_location_paused");
            return 2;
        } catch (Throwable th2) {
            f8.g(th2, true);
            return 2;
        }
    }
}
