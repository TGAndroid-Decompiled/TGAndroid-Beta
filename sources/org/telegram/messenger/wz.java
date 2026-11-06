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
    public static volatile wz f26399p;
    public final Context f26400a;
    public final android.support.v4.media.session.a0 f26401b;
    public int f26402c;
    public long d;
    public boolean f26403e;
    public boolean f26404f;
    public Paint f26410m;
    public RectF f26411n;
    public final ArrayList f26405g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26406i = new a0.h();
    public final a0.h f26407j = new a0.h();
    public final a0.h f26408k = new a0.h();
    public final a0.h f26409l = new a0.h();
    public final ArrayList f26412o = new ArrayList();

    public wz(Context context) {
        this.f26400a = context;
        int i7 = p10.f24467s0;
        this.f26402c = i7;
        this.d = g0.b1(qp.s1(i7).f24757d7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26401b = a0Var;
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
        ij ijVar = MediaController.B().f21292u0;
        if (ijVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (ijVar.J3()) {
                r3 |= 48;
            }
        }
        a0Var.u(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.x(iz.N0 ? 1 : 0);
        qs.e().b(new h5(this, 1), qs.f24974c4);
    }

    public static wz a(MusicBrowserService musicBrowserService) {
        if (f26399p == null) {
            synchronized (wz.class) {
                try {
                    if (f26399p == null) {
                        f26399p = new wz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26399p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (iz.f23413s.length() > 0) {
            if (!iz.f23427x) {
                if ((iz.f23430y != 0 && (i7 = iz.B) != 0 && i7 + iz.f23430y <= elapsedRealtime) || elapsedRealtime + 5 < iz.B) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void c(String str, p1 p1Var) {
        long j3;
        if (!this.f26403e) {
            this.f26412o.add(new tz(str, p1Var));
            if (this.f26404f) {
                return;
            }
            this.f26404f = true;
            int i7 = this.f26402c;
            yr a02 = yr.a0(i7);
            a02.f26696a.c(new k7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26407j.f(j3) == null) {
                e(new lg((Object) this, (Object) p1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) p1Var.f24466b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) p1Var.f24466b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26409l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26402c;
        yr a02 = yr.a0(i7);
        a02.f26696a.c(new ik(i7, 11, j3, this, a02));
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
        this.f26401b.w(i10);
    }
}
