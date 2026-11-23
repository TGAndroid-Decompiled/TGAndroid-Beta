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
public class LocationSharingService extends Service implements gs {
    public static final int d = 0;
    public e0.q f22678a;
    public Handler f22679b;
    public sd f22680c;

    public LocationSharingService() {
        ls.e().b(this, ls.G4);
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 4; i7++) {
            ArrayList arrayList2 = rd.f(i7).J;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static void b() {
        qd qdVar;
        boolean z10 = false;
        boolean z11 = false;
        long j3 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            ArrayList arrayList = rd.f(i7).J;
            int i10 = 0;
            while (i10 < arrayList.size()) {
                int i11 = ((qd) arrayList.get(i10)).f26400c;
                if (i11 == Integer.MAX_VALUE) {
                    z11 = true;
                } else {
                    j3 = Math.max(j3, (i11 - ConnectionsManager.getInstance(qdVar.f26401e).getCurrentTime()) * 1000);
                }
                i10++;
                z10 = true;
            }
        }
        if (z10) {
            if (z11 || j3 > 0) {
                try {
                    Context context = t0.f26895b;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.setAction("org.tmessages.openlocations");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772160);
                    Intent intent2 = new Intent(context, StopLiveLocationReceiver.class);
                    String N0 = hd.N0(2131748646, null);
                    ys.i();
                    e0.q qVar = new e0.q(context, ys.f28132k0);
                    qVar.F.icon = 2131231633;
                    qVar.g(hd.N0(2131748645, null));
                    qVar.f(N0);
                    e0.l lVar = new e0.l(false);
                    lVar.f10233f = e0.q.d(N0);
                    qVar.n(lVar);
                    qVar.f10245g = activity;
                    qVar.h(16, true);
                    qVar.a(0, PendingIntent.getBroadcast(context, 2, intent2, 167772160), hd.N0(2131744597, null));
                    if (!z11) {
                        qVar.B = j3;
                    }
                    new e0.i0(context).e("live_location_paused", 6, qVar.b());
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public final void c(boolean z10) {
        String G;
        String N0;
        if (this.f22678a != null) {
            ArrayList a10 = a();
            if (a10.size() == 1) {
                qd qdVar = (qd) a10.get(0);
                long B0 = gj.B0(qdVar.h.f24177k);
                int i7 = qdVar.h.K1;
                if (n5.E(B0)) {
                    G = p10.k(np.u1(i7).c2(Long.valueOf(B0)), true);
                    N0 = hd.N0(2131753962, null);
                } else {
                    TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-B0));
                    if (O0 != null) {
                        G = O0.title;
                    } else {
                        G = "";
                    }
                    N0 = hd.N0(2131753961, null);
                }
            } else {
                G = hd.G(a10.size(), "Chats", new Object[0]);
                N0 = hd.N0(2131753960, null);
            }
            String format = String.format(N0, hd.N0(2131753963, null), G);
            this.f22678a.p(format);
            this.f22678a.f(format);
            if (z10) {
                new e0.i0(t0.f26895b).e(null, 6, this.f22678a.b());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Handler handler;
        if (i7 == ls.G4 && (handler = this.f22679b) != null) {
            handler.post(new sd(this, 1));
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
        this.f22679b = handler;
        sd sdVar = new sd(this, 0);
        this.f22680c = sdVar;
        handler.postDelayed(sdVar, 1000L);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.f22679b;
        if (handler != null) {
            handler.removeCallbacks(this.f22680c);
        }
        stopForeground(true);
        new e0.i0(t0.f26895b).b(6, null);
        ls.e().n(this, ls.G4);
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (a().isEmpty()) {
            stopSelf();
            return 2;
        }
        try {
            if (this.f22678a == null) {
                Intent intent2 = new Intent(t0.f26895b, LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(t0.f26895b, 0, intent2, 167772160);
                e0.q qVar = new e0.q(t0.f26895b, null);
                this.f22678a = qVar;
                qVar.F.when = System.currentTimeMillis();
                e0.q qVar2 = this.f22678a;
                qVar2.F.icon = 2131231633;
                qVar2.f10245g = activity;
                ys.i();
                e0.q qVar3 = this.f22678a;
                qVar3.f10261y = ys.f28132k0;
                qVar3.g(hd.N0(2131689472, null));
                Intent intent3 = new Intent(t0.f26895b, StopLiveLocationReceiver.class);
                this.f22678a.a(0, PendingIntent.getBroadcast(t0.f26895b, 2, intent3, 167772160), hd.N0(2131744597, null));
            }
            c(false);
            Notification b10 = this.f22678a.b();
            if (Build.VERSION.SDK_INT < 29) {
                startForeground(6, b10);
            } else {
                startForeground(6, b10, 8);
            }
            new e0.i0(t0.f26895b).b(6, "live_location_paused");
            return 2;
        } catch (Throwable th2) {
            a8.g(th2, true);
            return 2;
        }
    }
}
