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
public final class wz {
    public static volatile wz f26408p;
    public final Context f26409a;
    public final android.support.v4.media.session.a0 f26410b;
    public int f26411c;
    public long d;
    public boolean f26412e;
    public boolean f26413f;
    public Paint f26419m;
    public RectF f26420n;
    public final ArrayList f26414g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26415i = new a0.h();
    public final a0.h f26416j = new a0.h();
    public final a0.h f26417k = new a0.h();
    public final a0.h f26418l = new a0.h();
    public final ArrayList f26421o = new ArrayList();

    public wz(Context context) {
        this.f26409a = context;
        int i7 = p10.f24470s0;
        this.f26411c = i7;
        this.d = g0.b1(qp.s1(i7).f24764d7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26410b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1763b;
        uVar.f1793a.setFlags(3);
        a0Var.s(new vz(this), null);
        uVar.f1793a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f1793a.setExtras(bundle);
        a0Var.r(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ij ijVar = MediaController.B().f21295u0;
        if (ijVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (ijVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.u(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.x(iz.N0 ? 1 : 0);
        qs.e().b(new h5(this, 1), qs.f24983c4);
    }

    public static wz a(MusicBrowserService musicBrowserService) {
        if (f26408p == null) {
            synchronized (wz.class) {
                try {
                    if (f26408p == null) {
                        f26408p = new wz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26408p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (iz.f23434s.length() > 0) {
            if (!iz.f23448x) {
                if ((iz.f23451y != 0 && (i7 = iz.B) != 0 && i7 + iz.f23451y <= elapsedRealtime) || elapsedRealtime + 5 < iz.B) {
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
        if (!this.f26412e) {
            this.f26421o.add(new tz(str, j1Var));
            if (this.f26413f) {
                return;
            }
            this.f26413f = true;
            int i7 = this.f26411c;
            yr a02 = yr.a0(i7);
            a02.f26719a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26416j.f(j3) == null) {
                e(new lg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) j1Var.f23465b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.f23465b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26418l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26411c;
        yr a02 = yr.a0(i7);
        a02.f26719a.c(new hk(i7, 11, j3, this, a02));
    }

    public final void f() {
        int i7 = iz.S0;
        int i10 = 2;
        if (i7 != 1) {
            if (i7 != 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f26410b.w(i10);
    }
}
