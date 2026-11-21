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
public final class qz {
    public static volatile qz f26526p;
    public final Context f26527a;
    public final android.support.v4.media.session.a0 f26528b;
    public int f26529c;
    public long d;
    public boolean f26530e;
    public boolean f26531f;
    public Paint f26537m;
    public RectF f26538n;
    public final ArrayList f26532g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26533i = new a0.h();
    public final a0.h f26534j = new a0.h();
    public final a0.h f26535k = new a0.h();
    public final a0.h f26536l = new a0.h();
    public final ArrayList f26539o = new ArrayList();

    public qz(Context context) {
        this.f26527a = context;
        int i7 = j10.f24798t0;
        this.f26529c = i7;
        this.d = g0.b1(mp.u1(i7).f25686g7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26528b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1717b;
        uVar.f1747a.setFlags(3);
        a0Var.s(new pz(this), null);
        uVar.f1747a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f1747a.setExtras(bundle);
        a0Var.r(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fj fjVar = MediaController.B().f22768v0;
        if (fjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (fjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.u(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.x(bz.N0 ? 1 : 0);
        ks.e().b(new j5(this, 1), ks.f25142f4);
    }

    public static qz a(MusicBrowserService musicBrowserService) {
        if (f26526p == null) {
            synchronized (qz.class) {
                try {
                    if (f26526p == null) {
                        f26526p = new qz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26526p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (bz.f23222s.length() > 0) {
            if (!bz.f23236x) {
                if ((bz.f23239y != 0 && (i7 = bz.B) != 0 && i7 + bz.f23239y <= elapsedRealtime) || elapsedRealtime + 5 < bz.B) {
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
        if (!this.f26530e) {
            this.f26539o.add(new nz(str, j1Var));
            if (this.f26531f) {
                return;
            }
            this.f26531f = true;
            int i7 = this.f26529c;
            tr a02 = tr.a0(i7);
            a02.f27080a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26534j.f(j3) == null) {
                e(new kg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) j1Var.f24797b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.f24797b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26536l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26529c;
        tr a02 = tr.a0(i7);
        a02.f27080a.c(new ek(i7, 11, j3, this, a02));
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
        this.f26528b.w(i10);
    }
}
