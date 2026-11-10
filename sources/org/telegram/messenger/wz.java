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
    public static volatile wz f26412p;
    public final Context f26413a;
    public final android.support.v4.media.session.a0 f26414b;
    public int f26415c;
    public long d;
    public boolean f26416e;
    public boolean f26417f;
    public Paint f26423m;
    public RectF f26424n;
    public final ArrayList f26418g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26419i = new a0.h();
    public final a0.h f26420j = new a0.h();
    public final a0.h f26421k = new a0.h();
    public final a0.h f26422l = new a0.h();
    public final ArrayList f26425o = new ArrayList();

    public wz(Context context) {
        this.f26413a = context;
        int i7 = p10.f24474s0;
        this.f26415c = i7;
        this.d = g0.b1(qp.s1(i7).f24768d7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26414b = a0Var;
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
        ij ijVar = MediaController.B().f21300u0;
        if (ijVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (ijVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.u(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.x(iz.N0 ? 1 : 0);
        qs.e().b(new h5(this, 1), qs.f24987c4);
    }

    public static wz a(MusicBrowserService musicBrowserService) {
        if (f26412p == null) {
            synchronized (wz.class) {
                try {
                    if (f26412p == null) {
                        f26412p = new wz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26412p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (iz.f23438s.length() > 0) {
            if (!iz.f23452x) {
                if ((iz.f23455y != 0 && (i7 = iz.B) != 0 && i7 + iz.f23455y <= elapsedRealtime) || elapsedRealtime + 5 < iz.B) {
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
        if (!this.f26416e) {
            this.f26425o.add(new tz(str, j1Var));
            if (this.f26417f) {
                return;
            }
            this.f26417f = true;
            int i7 = this.f26415c;
            yr a02 = yr.a0(i7);
            a02.f26723a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26420j.f(j3) == null) {
                e(new lg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) j1Var.f23469b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.f23469b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26422l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26415c;
        yr a02 = yr.a0(i7);
        a02.f26723a.c(new hk(i7, 11, j3, this, a02));
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
        this.f26414b.w(i10);
    }
}
