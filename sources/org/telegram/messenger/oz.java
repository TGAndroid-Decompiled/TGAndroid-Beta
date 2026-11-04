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
public final class oz {
    public static volatile oz f24629p;
    public final Context f24630a;
    public final android.support.v4.media.session.a0 f24631b;
    public int f24632c;
    public long d;
    public boolean f24633e;
    public boolean f24634f;
    public Paint f24640m;
    public RectF f24641n;
    public final ArrayList f24635g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f24636i = new a0.h();
    public final a0.h f24637j = new a0.h();
    public final a0.h f24638k = new a0.h();
    public final a0.h f24639l = new a0.h();
    public final ArrayList f24642o = new ArrayList();

    public oz(Context context) {
        this.f24630a = context;
        int i3 = h10.f22829t0;
        this.f24632c = i3;
        this.d = g0.b1(hp.s1(i3).f22989d7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f24631b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1186b;
        uVar.f1216a.setFlags(3);
        a0Var.r(new nz(this), null);
        uVar.f1216a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f1216a.setExtras(bundle);
        a0Var.q(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (ziVar.J3()) {
                r3 |= 48;
            }
        }
        a0Var.t(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.w(az.N0 ? 1 : 0);
        hs.e().b(new h5(this, 1), hs.f23211c4);
    }

    public static oz a(MusicBrowserService musicBrowserService) {
        if (f24629p == null) {
            synchronized (oz.class) {
                try {
                    if (f24629p == null) {
                        f24629p = new oz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f24629p;
    }

    public static boolean b() {
        int i3;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (az.f21661s.length() > 0) {
            if (!az.f21675x) {
                if ((az.f21678y != 0 && (i3 = az.B) != 0 && i3 + az.f21678y <= elapsedRealtime) || elapsedRealtime + 5 < az.B) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void c(String str, p1 p1Var) {
        long j10;
        if (!this.f24633e) {
            this.f24642o.add(new lz(str, p1Var));
            if (this.f24634f) {
                return;
            }
            this.f24634f = true;
            int i3 = this.f24632c;
            qr a02 = qr.a0(i3);
            a02.f24934a.c(new k7(this, a02, i3, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j10 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j10 == 0 && this.f24637j.f(j10) == null) {
                e(new dg((Object) this, (Object) p1Var, str, 29), j10);
                return;
            }
            ((MediaBrowserService.Result) p1Var.f24685b).sendResult(d(str));
        }
        j10 = 0;
        if (j10 == 0) {
        }
        ((MediaBrowserService.Result) p1Var.f24685b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.oz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j10) {
        a0.h hVar = this.f24639l;
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j10);
        int i3 = this.f24632c;
        qr a02 = qr.a0(i3);
        a02.f24934a.c(new yj(i3, 11, j10, this, a02));
    }

    public final void f() {
        int i3 = az.S0;
        int i10 = 2;
        if (i3 != 1) {
            if (i3 != 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f24631b.v(i10);
    }
}
