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
public final class rz {
    public static volatile rz f26709p;
    public final Context f26710a;
    public final android.support.v4.media.session.a0 f26711b;
    public int f26712c;
    public long d;
    public boolean f26713e;
    public boolean f26714f;
    public Paint f26720m;
    public RectF f26721n;
    public final ArrayList f26715g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26716i = new a0.h();
    public final a0.h f26717j = new a0.h();
    public final a0.h f26718k = new a0.h();
    public final a0.h f26719l = new a0.h();
    public final ArrayList f26722o = new ArrayList();

    public rz(Context context) {
        this.f26710a = context;
        int i7 = k10.f24968t0;
        this.f26712c = i7;
        this.d = g0.b1(np.u1(i7).f25857g7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26711b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1724b;
        uVar.f1754a.setFlags(3);
        a0Var.s(new qz(this), null);
        uVar.f1754a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f1754a.setExtras(bundle);
        a0Var.r(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gj gjVar = MediaController.B().f22771v0;
        if (gjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (gjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.u(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.x(cz.N0 ? 1 : 0);
        ls.e().b(new j5(this, 1), ls.f25308f4);
    }

    public static rz a(MusicBrowserService musicBrowserService) {
        if (f26709p == null) {
            synchronized (rz.class) {
                try {
                    if (f26709p == null) {
                        f26709p = new rz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26709p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (cz.f23439s.length() > 0) {
            if (!cz.f23453x) {
                if ((cz.f23456y != 0 && (i7 = cz.B) != 0 && i7 + cz.f23456y <= elapsedRealtime) || elapsedRealtime + 5 < cz.B) {
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
        if (!this.f26713e) {
            this.f26722o.add(new oz(str, j1Var));
            if (this.f26714f) {
                return;
            }
            this.f26714f = true;
            int i7 = this.f26712c;
            ur a02 = ur.a0(i7);
            a02.f27250a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26717j.f(j3) == null) {
                e(new lg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) j1Var.f24817b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.f24817b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26719l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26712c;
        ur a02 = ur.a0(i7);
        a02.f27250a.c(new fk(i7, 11, j3, this, a02));
    }

    public final void f() {
        int i7 = cz.S0;
        int i10 = 2;
        if (i7 != 1) {
            if (i7 != 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f26711b.w(i10);
    }
}
