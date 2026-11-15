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
public final class uz {
    public static volatile uz f26900p;
    public final Context f26901a;
    public final android.support.v4.media.session.a0 f26902b;
    public int f26903c;
    public long d;
    public boolean f26904e;
    public boolean f26905f;
    public Paint f26911m;
    public RectF f26912n;
    public final ArrayList f26906g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26907i = new a0.h();
    public final a0.h f26908j = new a0.h();
    public final a0.h f26909k = new a0.h();
    public final a0.h f26910l = new a0.h();
    public final ArrayList f26913o = new ArrayList();

    public uz(Context context) {
        this.f26901a = context;
        int i7 = m10.f24940t0;
        this.f26903c = i7;
        this.d = g0.b1(np.s1(i7).f25273e7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26902b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1713b;
        uVar.f1743a.setFlags(3);
        a0Var.r(new tz(this), null);
        uVar.f1743a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f1743a.setExtras(bundle);
        a0Var.q(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (gjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.t(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.w(gz.N0 ? 1 : 0);
        ns.e().b(new h5(this, 1), ns.f25480c4);
    }

    public static uz a(MusicBrowserService musicBrowserService) {
        if (f26900p == null) {
            synchronized (uz.class) {
                try {
                    if (f26900p == null) {
                        f26900p = new uz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26900p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (gz.f23981s.length() > 0) {
            if (!gz.f23995x) {
                if ((gz.f23998y != 0 && (i7 = gz.B) != 0 && i7 + gz.f23998y <= elapsedRealtime) || elapsedRealtime + 5 < gz.B) {
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
        if (!this.f26904e) {
            this.f26913o.add(new rz(str, j1Var));
            if (this.f26905f) {
                return;
            }
            this.f26905f = true;
            int i7 = this.f26903c;
            vr a02 = vr.a0(i7);
            a02.f27219a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26908j.f(j3) == null) {
                e(new kg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) j1Var.f24505b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.f24505b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26910l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26903c;
        vr a02 = vr.a0(i7);
        a02.f27219a.c(new fk(i7, 11, j3, this, a02));
    }

    public final void f() {
        int i7 = gz.S0;
        int i10 = 2;
        if (i7 != 1) {
            if (i7 != 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f26902b.v(i10);
    }
}
