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
public final class h00 {
    public static volatile h00 f15799p;
    public final Context f15800a;
    public final android.support.v4.media.session.a0 f15801b;
    public int f15802c;
    public long d;
    public boolean e;
    public boolean f15803f;
    public Paint f15809m;
    public RectF f15810n;
    public final ArrayList f15804g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f15805i = new a0.h();
    public final a0.h f15806j = new a0.h();
    public final a0.h f15807k = new a0.h();
    public final a0.h f15808l = new a0.h();
    public final ArrayList f15811o = new ArrayList();

    public h00(Context context) {
        this.f15800a = context;
        int i10 = d20.f15147s0;
        this.f15802c = i10;
        this.d = i0.b1(vp.r1(i10).e7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f15801b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f875b;
        uVar.f902a.setFlags(3);
        a0Var.z(new g00(this), null);
        uVar.f902a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f902a.setExtras(bundle);
        a0Var.x(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        jj jjVar = MediaController.B().f14482u0;
        if (jjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (jjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.C(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.F(tz.N0 ? 1 : 0);
        zs.e().b(new j5(this, 1), zs.f19594c4);
    }

    public static h00 a(MusicBrowserService musicBrowserService) {
        if (f15799p == null) {
            synchronized (h00.class) {
                try {
                    if (f15799p == null) {
                        f15799p = new h00(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f15799p;
    }

    public static boolean b() {
        int i10;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (tz.f18180s.length() > 0) {
            if (!tz.f18194x) {
                if ((tz.f18197y != 0 && (i10 = tz.B) != 0 && i10 + tz.f18197y <= elapsedRealtime) || elapsedRealtime + 5 < tz.B) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void c(String str, s1 s1Var) {
        long j10;
        if (!this.e) {
            this.f15811o.add(new f00(str, s1Var));
            if (this.f15803f) {
                return;
            }
            this.f15803f = true;
            int i10 = this.f15802c;
            hs a02 = hs.a0(i10);
            a02.f15938a.c(new o7(this, a02, i10, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j10 = Long.parseLong(str.substring(7));
            } catch (Exception e) {
                f8.g(e, true);
            }
            if (j10 == 0 && this.f15806j.f(j10) == null) {
                e(new e00(this, s1Var, str, 0), j10);
                return;
            }
            ((MediaBrowserService.Result) s1Var.f17863b).sendResult(d(str));
        }
        j10 = 0;
        if (j10 == 0) {
        }
        ((MediaBrowserService.Result) s1Var.f17863b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.h00.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j10) {
        a0.h hVar = this.f15808l;
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j10);
        int i10 = this.f15802c;
        hs a02 = hs.a0(i10);
        a02.f15938a.c(new rk(i10, 11, j10, this, a02));
    }

    public final void f() {
        int i10 = tz.S0;
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
        }
        this.f15801b.E(i11);
    }
}
