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
public final class uz {
    public static volatile uz f26899p;
    public final Context f26900a;
    public final android.support.v4.media.session.a0 f26901b;
    public int f26902c;
    public long d;
    public boolean f26903e;
    public boolean f26904f;
    public Paint f26910m;
    public RectF f26911n;
    public final ArrayList f26905g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f26906i = new a0.h();
    public final a0.h f26907j = new a0.h();
    public final a0.h f26908k = new a0.h();
    public final a0.h f26909l = new a0.h();
    public final ArrayList f26912o = new ArrayList();

    public uz(Context context) {
        this.f26900a = context;
        int i7 = m10.f24934t0;
        this.f26902c = i7;
        this.d = g0.b1(np.s1(i7).f25270e7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.f26901b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1706b;
        uVar.f1736a.setFlags(3);
        a0Var.r(new tz(this), null);
        uVar.f1736a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.f1736a.setExtras(bundle);
        a0Var.q(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (gjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.t(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.w(gz.N0 ? 1 : 0);
        ns.e().b(new h5(this, 1), ns.f25479c4);
    }

    public static uz a(MusicBrowserService musicBrowserService) {
        if (f26899p == null) {
            synchronized (uz.class) {
                try {
                    if (f26899p == null) {
                        f26899p = new uz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f26899p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (gz.f23978s.length() > 0) {
            if (!gz.f23992x) {
                if ((gz.f23995y != 0 && (i7 = gz.B) != 0 && i7 + gz.f23995y <= elapsedRealtime) || elapsedRealtime + 5 < gz.B) {
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
        if (!this.f26903e) {
            this.f26912o.add(new rz(str, j1Var));
            if (this.f26904f) {
                return;
            }
            this.f26904f = true;
            int i7 = this.f26902c;
            vr a02 = vr.a0(i7);
            a02.f27220a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.f26907j.f(j3) == null) {
                e(new kg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            }
            ((MediaBrowserService.Result) j1Var.f24500b).sendResult(d(str));
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.f24500b).sendResult(d(str));
    }

    public final java.util.ArrayList d(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uz.d(java.lang.String):java.util.ArrayList");
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.f26909l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.f26902c;
        vr a02 = vr.a0(i7);
        a02.f27220a.c(new fk(i7, 11, j3, this, a02));
    }

    public final void f() {
        int i7 = gz.S0;
        int i10 = 2;
        if (i7 != 1) {
            if (i7 != 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f26901b.v(i10);
    }
}
