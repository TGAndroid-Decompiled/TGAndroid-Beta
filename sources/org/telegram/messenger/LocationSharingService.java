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
public class LocationSharingService extends Service implements is {
    public static final int d = 0;
    public e0.q f22320a;
    public Handler f22321b;
    public sd f22322c;

    public LocationSharingService() {
        ns.e().b(this, ns.D4);
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
                int i11 = ((qd) arrayList.get(i10)).f26080c;
                if (i11 == Integer.MAX_VALUE) {
                    z11 = true;
                } else {
                    j3 = Math.max(j3, (i11 - ConnectionsManager.getInstance(qdVar.f26081e).getCurrentTime()) * 1000);
                }
                i10++;
                z10 = true;
            }
        }
        if (z10) {
            if (z11 || j3 > 0) {
                try {
                    Context context = t0.f26609b;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.setAction("org.tmessages.openlocations");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772160);
                    Intent intent2 = new Intent(context, StopLiveLocationReceiver.class);
                    String M0 = hd.M0(2131748839, null);
                    at.i();
                    e0.q qVar = new e0.q(context, at.f22557k0);
                    qVar.F.icon = 2131231632;
                    qVar.g(hd.M0(2131748838, null));
                    qVar.f(M0);
                    e0.l lVar = new e0.l(false);
                    lVar.f9923f = e0.q.d(M0);
                    qVar.n(lVar);
                    qVar.f9935g = activity;
                    qVar.h(16, true);
                    qVar.a(0, PendingIntent.getBroadcast(context, 2, intent2, 167772160), hd.M0(2131744838, null));
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
        String M0;
        if (this.f22320a != null) {
            ArrayList a10 = a();
            if (a10.size() == 1) {
                qd qdVar = (qd) a10.get(0);
                long B0 = gj.B0(qdVar.h.f23819k);
                int i7 = qdVar.h.K1;
                if (m5.E(B0)) {
                    G = q10.j(np.s1(i7).a2(Long.valueOf(B0)), true);
                    M0 = hd.M0(2131753965, null);
                } else {
                    TLRPC.Chat M02 = np.s1(i7).M0(Long.valueOf(-B0));
                    if (M02 != null) {
                        G = M02.title;
                    } else {
                        G = "";
                    }
                    M0 = hd.M0(2131753964, null);
                }
            } else {
                G = hd.G(a10.size(), "Chats", new Object[0]);
                M0 = hd.M0(2131753963, null);
            }
            String format = String.format(M0, hd.M0(2131753966, null), G);
            this.f22320a.p(format);
            this.f22320a.f(format);
            if (z10) {
                new e0.i0(t0.f26609b).e(null, 6, this.f22320a.b());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Handler handler;
        if (i7 == ns.D4 && (handler = this.f22321b) != null) {
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
        this.f22321b = handler;
        sd sdVar = new sd(this, 0);
        this.f22322c = sdVar;
        handler.postDelayed(sdVar, 1000L);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.f22321b;
        if (handler != null) {
            handler.removeCallbacks(this.f22322c);
        }
        stopForeground(true);
        new e0.i0(t0.f26609b).b(6, null);
        ns.e().n(this, ns.D4);
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (a().isEmpty()) {
            stopSelf();
            return 2;
        }
        try {
            if (this.f22320a == null) {
                Intent intent2 = new Intent(t0.f26609b, LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(t0.f26609b, 0, intent2, 167772160);
                e0.q qVar = new e0.q(t0.f26609b, null);
                this.f22320a = qVar;
                qVar.F.when = System.currentTimeMillis();
                e0.q qVar2 = this.f22320a;
                qVar2.F.icon = 2131231632;
                qVar2.f9935g = activity;
                at.i();
                e0.q qVar3 = this.f22320a;
                qVar3.f9951y = at.f22557k0;
                qVar3.g(hd.M0(2131689472, null));
                Intent intent3 = new Intent(t0.f26609b, StopLiveLocationReceiver.class);
                this.f22320a.a(0, PendingIntent.getBroadcast(t0.f26609b, 2, intent3, 167772160), hd.M0(2131744838, null));
            }
            c(false);
            Notification b10 = this.f22320a.b();
            if (Build.VERSION.SDK_INT < 29) {
                startForeground(6, b10);
            } else {
                startForeground(6, b10, 8);
            }
            new e0.i0(t0.f26609b).b(6, "live_location_paused");
            return 2;
        } catch (Throwable th2) {
            a8.g(th2, true);
            return 2;
        }
    }
}
