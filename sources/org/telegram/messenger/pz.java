package org.telegram.messenger;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class pz {
    public static volatile pz f26417p;
    public final Context f26418a;
    public final android.support.v4.media.session.a0 f26419b;
    public int f26420c;
    public long d;
    public boolean f26421e;
    public boolean f26422f;
    public Paint f26428m;
    public RectF f26429n;
    public final ArrayList f26423g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26424i = new a0.h();
    public final a0.h f26425j = new a0.h();
    public final a0.h f26426k = new a0.h();
    public final a0.h f26427l = new a0.h();
    public final ArrayList f26430o = new ArrayList();

    public pz(Context context) {
        this.f26418a = context;
        int i7 = i10.f24637t0;
        this.f26420c = i7;
        this.d = g0.b1(mp.u1(i7).f25753g7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26419b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1676b;
        uVar.f1706a.setFlags(3);
        a0Var.r(new oz(this), null);
        uVar.f1706a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f1706a.setExtras(bundle);
        a0Var.q(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fj fjVar = MediaController.B().f22838v0;
        if (fjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (fjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.u(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.x(bz.N0 ? 1 : 0);
        ks.e().b(new j5(this, 1), ks.f25213f4);
    }

    public static pz a(MusicBrowserService musicBrowserService) {
        if (f26417p == null) {
            synchronized (pz.class) {
                try {
                    if (f26417p == null) {
                        f26417p = new pz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26417p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (bz.f23319s.length() > 0) {
            if (!bz.f23333x) {
                if ((bz.f23336y != 0 && (i7 = bz.B) != 0 && i7 + bz.f23336y <= elapsedRealtime) || elapsedRealtime + 5 < bz.B) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void c(String str, j1 j1Var) {
        long j3;
        if (!this.f26421e) {
            this.f26430o.add(new mz(str, j1Var));
            if (this.f26422f) {
                return;
            }
            this.f26422f = true;
            int i7 = this.f26420c;
            tr a02 = tr.a0(i7);
            a02.f27149a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26425j.f(j3) == null) {
                e(new kg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) j1Var.f24906b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.f24906b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26427l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26420c;
        tr a02 = tr.a0(i7);
        a02.f27149a.c(new ek(i7, 11, j3, this, a02));
    }

    public final void f() {
        int i7 = bz.S0;
        int i10 = 2;
        if (i7 != 1) {
            if (i7 != 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f26419b.w(i10);
    }
}
