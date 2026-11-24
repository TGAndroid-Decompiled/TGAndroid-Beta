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
public final class hgb {
    public static volatile hgb p;
    public final Context a;
    public final mv6 b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public Paint m;
    public RectF n;
    public final ArrayList g = new ArrayList();
    public final vf6 h = new vf6();
    public final vf6 i = new vf6();
    public final vf6 j = new vf6();
    public final vf6 k = new vf6();
    public final vf6 l = new vf6();
    public final ArrayList o = new ArrayList();

    public hgb(Context context) {
        this.a = context;
        int i = y6c.t0;
        this.c = i;
        this.d = gl.a1(na7.q1(i).W3, "auto_lastSelectedDialog", 0L);
        mv6 mv6Var = new mv6(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.b = mv6Var;
        zu6 zu6Var = (zu6) mv6Var.b;
        zu6Var.a.setFlags(3);
        mv6Var.k0(new ggb(this), null);
        zu6Var.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        zu6Var.a.setExtras(bundle);
        mv6Var.i0(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null) {
            r3 = MediaController.w().C() ? 2477828L : 2477830L;
            if (k27Var.I3()) {
                r3 |= 48;
            }
        }
        mv6Var.n0(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        mv6Var.q0(gba.K0 ? 1 : 0);
        kk7.e().a(new su2(this, (byte) 4), kk7.e4);
    }

    public static hgb a(MusicBrowserService musicBrowserService) {
        if (p == null) {
            synchronized (hgb.class) {
                if (p == null) {
                    p = new hgb(musicBrowserService.getApplicationContext());
                }
            }
        }
        return p;
    }

    public static boolean b() {
        int i;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (gba.r.length() > 0) {
            if (!gba.w) {
                if ((gba.x != 0 && (i = gba.A) != 0 && i + gba.x <= elapsedRealtime) || elapsedRealtime + 5 < gba.A) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void c(String str, im6 im6Var) {
        long j;
        if (!this.e) {
            this.o.add(new fgb(str, im6Var));
            if (this.f) {
                return;
            }
            this.f = true;
            int i = this.c;
            ad7 Y = ad7.Y(i);
            Y.a.c(new t79(this, Y, i, (byte) 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j = Long.parseLong(str.substring(7));
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (j == 0 && this.j.f(j) == null) {
                e(new r1b(this, im6Var, str, (byte) 9), j);
                return;
            }
            ((MediaBrowserService.Result) im6Var.b).sendResult(d(str));
        }
        j = 0;
        if (j == 0) {
        }
        ((MediaBrowserService.Result) im6Var.b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgb.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j) {
        vf6 vf6Var = this.l;
        ArrayList arrayList = (ArrayList) vf6Var.f(j);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        vf6Var.k(arrayList2, j);
        int i = this.c;
        ad7 Y = ad7.Y(i);
        Y.a.c(new o57(this, Y, j, i, (byte) 19));
    }

    public final void f() {
        int i = gba.P0;
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        this.b.p0(i2);
    }
}
