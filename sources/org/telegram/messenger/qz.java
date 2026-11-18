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
    public static volatile qz f26498p;
    public final Context f26499a;
    public final android.support.v4.media.session.a0 f26500b;
    public int f26501c;
    public long d;
    public boolean f26502e;
    public boolean f26503f;
    public Paint f26509m;
    public RectF f26510n;
    public final ArrayList f26504g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26505i = new a0.h();
    public final a0.h f26506j = new a0.h();
    public final a0.h f26507k = new a0.h();
    public final a0.h f26508l = new a0.h();
    public final ArrayList f26511o = new ArrayList();

    public qz(Context context) {
        this.f26499a = context;
        int i7 = j10.f24770t0;
        this.f26501c = i7;
        this.d = g0.b1(mp.u1(i7).f25658g7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26500b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1705b;
        uVar.f1735a.setFlags(3);
        a0Var.s(new pz(this), null);
        uVar.f1735a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f1735a.setExtras(bundle);
        a0Var.r(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fj fjVar = MediaController.B().f22740v0;
        if (fjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (fjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.u(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.x(bz.N0 ? 1 : 0);
        ks.e().b(new j5(this, 1), ks.f25114f4);
    }

    public static qz a(MusicBrowserService musicBrowserService) {
        if (f26498p == null) {
            synchronized (qz.class) {
                try {
                    if (f26498p == null) {
                        f26498p = new qz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26498p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (bz.f23194s.length() > 0) {
            if (!bz.f23208x) {
                if ((bz.f23211y != 0 && (i7 = bz.B) != 0 && i7 + bz.f23211y <= elapsedRealtime) || elapsedRealtime + 5 < bz.B) {
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
        if (!this.f26502e) {
            this.f26511o.add(new nz(str, j1Var));
            if (this.f26503f) {
                return;
            }
            this.f26503f = true;
            int i7 = this.f26501c;
            tr a02 = tr.a0(i7);
            a02.f27052a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26506j.f(j3) == null) {
                e(new kg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) j1Var.f24769b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.f24769b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26508l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26501c;
        tr a02 = tr.a0(i7);
        a02.f27052a.c(new ek(i7, 11, j3, this, a02));
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
        this.f26500b.w(i10);
    }
}
