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
public final class iib {
    public static volatile iib p;
    public final Context a;
    public final mx6 b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public Paint m;
    public RectF n;
    public final ArrayList g = new ArrayList();
    public final vh6 h = new vh6();
    public final vh6 i = new vh6();
    public final vh6 j = new vh6();
    public final vh6 k = new vh6();
    public final vh6 l = new vh6();
    public final ArrayList o = new ArrayList();

    public iib(Context context) {
        this.a = context;
        int i = z8c.t0;
        this.c = i;
        this.d = gm.a1(oc7.r1(i).W3, "auto_lastSelectedDialog", 0L);
        mx6 mx6Var = new mx6(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.b = mx6Var;
        zw6 zw6Var = (zw6) mx6Var.b;
        zw6Var.a.setFlags(3);
        mx6Var.o0(new hib(this), null);
        zw6Var.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        zw6Var.a.setExtras(bundle);
        mx6Var.l0(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null) {
            r3 = MediaController.w().C() ? 2477828L : 2477830L;
            if (k47Var.I3()) {
                r3 |= 48;
            }
        }
        mx6Var.r0(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        mx6Var.u0(gda.J0 ? 1 : 0);
        nm7.e().a(new dw2(this, (byte) 4), nm7.g4);
    }

    public static iib a(MusicBrowserService musicBrowserService) {
        if (p == null) {
            synchronized (iib.class) {
                if (p == null) {
                    p = new iib(musicBrowserService.getApplicationContext());
                }
            }
        }
        return p;
    }

    public static boolean b() {
        int i;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (gda.r.length() > 0) {
            if (!gda.w) {
                if ((gda.x != 0 && (i = gda.A) != 0 && i + gda.x <= elapsedRealtime) || elapsedRealtime + 5 < gda.A) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void c(String str, cj6 cj6Var) {
        long j;
        if (!this.e) {
            this.o.add(new gib(str, cj6Var));
            if (this.f) {
                return;
            }
            this.f = true;
            int i = this.c;
            cf7 Y = cf7.Y(i);
            Y.a.c(new v99(this, Y, i, (byte) 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j = Long.parseLong(str.substring(7));
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (j == 0 && this.j.f(j) == null) {
                e(new j2b(this, cj6Var, str, (byte) 12), j);
                return;
            }
            ((MediaBrowserService.Result) cj6Var.b).sendResult(d(str));
        }
        j = 0;
        if (j == 0) {
        }
        ((MediaBrowserService.Result) cj6Var.b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iib.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j) {
        vh6 vh6Var = this.l;
        ArrayList arrayList = (ArrayList) vh6Var.f(j);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        vh6Var.k(arrayList2, j);
        int i = this.c;
        cf7 Y = cf7.Y(i);
        Y.a.c(new o77(this, Y, j, i, (byte) 19));
    }

    public final void f() {
        int i = gda.O0;
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        this.b.t0(i2);
    }
}
