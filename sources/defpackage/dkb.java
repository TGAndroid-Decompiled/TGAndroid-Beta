package defpackage;

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicBrowserService;
import org.telegram.ui.LaunchActivity;
public final class dkb {
    public static volatile dkb p;
    public final Context a;
    public final rx6 b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public Paint m;
    public RectF n;
    public final ArrayList g = new ArrayList();
    public final zh6 h = new zh6();
    public final zh6 i = new zh6();
    public final zh6 j = new zh6();
    public final zh6 k = new zh6();
    public final zh6 l = new zh6();
    public final ArrayList o = new ArrayList();

    public dkb(Context context) {
        this.a = context;
        int i = yac.t0;
        this.c = i;
        this.d = hl.a1(uc7.s1(i).X3, "auto_lastSelectedDialog", 0L);
        rx6 rx6Var = new rx6(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.b = rx6Var;
        ex6 ex6Var = (ex6) rx6Var.b;
        ex6Var.a.setFlags(3);
        rx6Var.p0(new ckb(this), null);
        ex6Var.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        ex6Var.a.setExtras(bundle);
        rx6Var.n0(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            r3 = MediaController.z().G() ? 2477828L : 2477830L;
            if (r47Var.I3()) {
                r3 |= 48;
            }
        }
        rx6Var.s0(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        rx6Var.v0(xea.J0 ? 1 : 0);
        jn7.e().a(new nv2(this, (byte) 4), jn7.f4);
    }

    public static dkb a(MusicBrowserService musicBrowserService) {
        if (p == null) {
            synchronized (dkb.class) {
                if (p == null) {
                    p = new dkb(musicBrowserService.getApplicationContext());
                }
            }
        }
        return p;
    }

    public static boolean b() {
        int i;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (xea.r.length() > 0) {
            if (!xea.w) {
                if ((xea.x != 0 && (i = xea.A) != 0 && i + xea.x <= elapsedRealtime) || elapsedRealtime + 5 < xea.A) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void c(String str, bm6 bm6Var) {
        long j;
        if (!this.e) {
            this.o.add(new bkb(str, bm6Var));
            if (this.f) {
                return;
            }
            this.f = true;
            int i = this.c;
            kf7 a0 = kf7.a0(i);
            a0.a.c(new a39(this, a0, i, (byte) 23));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j = Long.parseLong(str.substring(7));
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (j == 0 && this.j.f(j) == null) {
                e(new pwa(this, bm6Var, str, (byte) 18), j);
                return;
            }
            ((MediaBrowserService.Result) bm6Var.b).sendResult(d(str));
        }
        j = 0;
        if (j == 0) {
        }
        ((MediaBrowserService.Result) bm6Var.b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkb.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j) {
        zh6 zh6Var = this.l;
        ArrayList arrayList = (ArrayList) zh6Var.f(j);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        zh6Var.k(j, arrayList2);
        int i = this.c;
        kf7 a0 = kf7.a0(i);
        a0.a.c(new r77(this, a0, j, i, (byte) 19));
    }

    public final void f() {
        int i = xea.O0;
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        this.b.u0(i2);
    }
}
