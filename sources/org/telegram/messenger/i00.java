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
public final class i00 {
    public static volatile i00 f16181p;
    public final Context f16182a;
    public final android.support.v4.media.session.a0 f16183b;
    public int f16184c;
    public long d;
    public boolean e;
    public boolean f16185f;
    public Paint f16191m;
    public RectF f16192n;
    public final ArrayList f16186g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f16187i = new a0.h();
    public final a0.h f16188j = new a0.h();
    public final a0.h f16189k = new a0.h();
    public final a0.h f16190l = new a0.h();
    public final ArrayList f16193o = new ArrayList();

    public i00(Context context) {
        this.f16182a = context;
        int i10 = e20.f15506s0;
        this.f16184c = i10;
        this.d = i0.b1(wp.r1(i10).e7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f16183b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f875b;
        uVar.f902a.setFlags(3);
        a0Var.z(new h00(this), null);
        uVar.f902a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f902a.setExtras(bundle);
        a0Var.x(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kj kjVar = MediaController.B().f14483u0;
        if (kjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (kjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.C(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.F(uz.N0 ? 1 : 0);
        at.e().b(new j5(this, 1), at.f14690c4);
    }

    public static i00 a(MusicBrowserService musicBrowserService) {
        if (f16181p == null) {
            synchronized (i00.class) {
                try {
                    if (f16181p == null) {
                        f16181p = new i00(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f16181p;
    }

    public static boolean b() {
        int i10;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (uz.f18549s.length() > 0) {
            if (!uz.f18563x) {
                if ((uz.f18566y != 0 && (i10 = uz.B) != 0 && i10 + uz.f18566y <= elapsedRealtime) || elapsedRealtime + 5 < uz.B) {
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
            this.f16193o.add(new g00(str, s1Var));
            if (this.f16185f) {
                return;
            }
            this.f16185f = true;
            int i10 = this.f16184c;
            is a02 = is.a0(i10);
            a02.f16331a.c(new o7(this, a02, i10, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j10 = Long.parseLong(str.substring(7));
            } catch (Exception e) {
                f8.g(e, true);
            }
            if (j10 == 0 && this.f16188j.f(j10) == null) {
                e(new f00(this, s1Var, str, 0), j10);
                return;
            }
            ((MediaBrowserService.Result) s1Var.f18056b).sendResult(d(str));
        }
        j10 = 0;
        if (j10 == 0) {
        }
        ((MediaBrowserService.Result) s1Var.f18056b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i00.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j10) {
        a0.h hVar = this.f16190l;
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j10);
        int i10 = this.f16184c;
        is a02 = is.a0(i10);
        a02.f16331a.c(new sk(i10, 11, j10, this, a02));
    }

    public final void f() {
        int i10 = uz.S0;
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
        }
        this.f16183b.E(i11);
    }
}
