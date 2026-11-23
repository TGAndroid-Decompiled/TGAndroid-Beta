package org.telegram.messenger;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
public final class pe implements kf, m9.t, p4.u {
    public long f26325a;
    public Object f26326b;
    public Object f26327c;
    public Object d;
    public final Object f26328e;

    public pe(android.content.Context r23, org.telegram.ui.Components.jf0 r24, final org.telegram.ui.Components.i8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.i6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pe.<init>(android.content.Context, org.telegram.ui.Components.jf0, org.telegram.ui.Components.i8, boolean, int, org.telegram.ui.ActionBar.i6):void");
    }

    @Override
    public void b(int i7, p4.m1 m1Var, boolean z10, boolean z11, int i10) {
        p4.n0 n0Var = (p4.n0) this.f26328e;
        n0Var.p0(n0Var.h.f55324t);
    }

    @Override
    public void e(int i7, e2.y0 y0Var) {
        int i10;
        p4.n0 n0Var = (p4.n0) this.f26328e;
        p4.h1 h1Var = n0Var.h.f55324t;
        if (h1Var.q0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (n0Var.f55493t != i10) {
            n0Var.f55493t = i10;
            ((q4.l) n0Var.f55487n.f55949b).f55931a.setFlags(i10 | 3);
        }
        n0Var.p0(h1Var);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((p4.n0) ((pe) this.f26328e).f26328e).f55492s) {
            return;
        }
        h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override
    public void j(int i7, p4.j1 j1Var) {
        Bundle bundle = j1Var.f55446c;
        Bundle bundle2 = Bundle.EMPTY;
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        q4.q qVar = ((p4.n0) this.f26328e).f55487n;
        String str = j1Var.f55445b;
        qVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((q4.l) qVar.f55949b).f55931a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public boolean k() {
        return ((d20) this.f26326b).W;
    }

    public void l(long j3, float f10) {
        File file = (File) this.f26327c;
        d20 d20Var = (d20) this.f26326b;
        if (!d20Var.W) {
            if (j3 < 0) {
                j3 = file.length();
            }
            long j10 = j3;
            if (!d20Var.Y && this.f26325a == j10) {
                return;
            }
            this.f26325a = j10;
            MediaController mediaController = (MediaController) this.f26328e;
            jf jfVar = (jf) this.d;
            String[] strArr = MediaController.W1;
            d20 d20Var2 = jfVar.f24958b;
            boolean z10 = d20Var2.X;
            if (z10) {
                d20Var2.X = false;
            }
            g0.g3(new yd(mediaController, false, false, jfVar, file, f10, 0L, z10, j10));
        }
    }

    public void m() {
        ((org.telegram.ui.Components.i8) this.d).dismiss();
        this.f26325a = System.currentTimeMillis();
    }

    public void n() {
        e2.e eVar;
        p4.n0 n0Var = (p4.n0) this.f26328e;
        p4.h1 h1Var = n0Var.h.f55324t;
        h1Var.L().getClass();
        q4.q qVar = n0Var.f55487n;
        if (h1Var.q0(21)) {
            eVar = h1Var.I();
        } else {
            eVar = e2.e.f10359i;
        }
        ((q4.l) qVar.f55949b).f55931a.setPlaybackToLocal(eVar.b());
    }

    public void o(e2.l0 l0Var) {
        p4.n0 n0Var = (p4.n0) this.f26328e;
        q4.q qVar = n0Var.f55487n;
        v();
        if (l0Var == null) {
            ((q4.l) qVar.f55949b).f55931a.setRatingType(0);
        } else {
            ((q4.l) qVar.f55949b).f55931a.setRatingType(p4.n.e(l0Var.d.f10577i));
        }
        n0Var.p0(n0Var.h.f55324t);
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p4.n0 n0Var = (p4.n0) ((pe) this.f26328e).f26328e;
        if (this != n0Var.f55492s) {
            return;
        }
        p4.n0.f0(n0Var.f55487n, p4.n.b((e2.o0) this.f26326b, (String) this.f26327c, (Uri) this.d, this.f26325a, bitmap));
        p4.d0 d0Var = n0Var.h;
        h2.l0.W(d0Var.f55319o, new p4.y(d0Var, 1));
    }

    public void p(int i7, p4.h1 h1Var) {
        e2.o0 o0Var;
        int i10;
        p4.n0 n0Var = (p4.n0) this.f26328e;
        t(h1Var.T0());
        if (h1Var.q0(18)) {
            o0Var = h1Var.l0();
        } else {
            o0Var = e2.o0.L;
        }
        q(o0Var);
        h1Var.U0();
        v();
        s(h1Var.E0());
        r(h1Var.m());
        h1Var.L();
        n();
        if (h1Var.q0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (n0Var.f55493t != i10) {
            n0Var.f55493t = i10;
            ((q4.l) n0Var.f55487n.f55949b).f55931a.setFlags(i10 | 3);
        }
        o(h1Var.S0());
    }

    public void q(e2.o0 o0Var) {
        p4.n0 n0Var = (p4.n0) this.f26328e;
        q4.q qVar = n0Var.f55487n;
        if (!TextUtils.equals(((q4.f) ((q4.u) qVar.f55950c).f55957a).f55914a.getQueueTitle(), o0Var.f10571a)) {
            ((q4.l) qVar.f55949b).f55931a.setQueueTitle((n0Var.f55497y.a(17) && n0Var.h.f55324t.u().a(17)) ? null : null);
        }
    }

    public void r(int i7) {
        q4.q qVar = ((p4.n0) this.f26328e).f55487n;
        int i10 = p4.n.f55479a;
        int i11 = 0;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    h2.a.l("LegacyConversions", "Unrecognized RepeatMode: " + i7 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 1;
            }
        }
        q4.l lVar = (q4.l) qVar.f55949b;
        if (lVar.f55938j != i11) {
            lVar.f55938j = i11;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f55935f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f55935f.getBroadcastItem(beginBroadcast)).e(i11);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                lVar.f55935f.finishBroadcast();
            }
        }
    }

    public void s(boolean z10) {
        q4.q qVar = ((p4.n0) this.f26328e).f55487n;
        int i7 = p4.n.f55479a;
        q4.l lVar = (q4.l) qVar.f55949b;
        if (lVar.f55939k != z10) {
            lVar.f55939k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f55935f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f55935f.getBroadcastItem(beginBroadcast)).j(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f55935f.finishBroadcast();
            }
        }
    }

    public void t(e2.l1 l1Var) {
        w(l1Var);
        v();
    }

    public void u(int i7) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f26327c;
        if (System.currentTimeMillis() - this.f26325a < 200) {
            g0.g3(new org.telegram.ui.ii(this, i7, 7));
        } else if (i7 == 0) {
            y0Var.setVisibility(8);
        } else {
            y0Var.setVisibility(0);
        }
    }

    public void v() {
        String str;
        Uri uri;
        long j3;
        Uri uri2;
        e2.o0 o0Var;
        Uri uri3;
        p4.n0 n0Var = (p4.n0) this.f26328e;
        p4.d0 d0Var = n0Var.h;
        p4.h1 h1Var = d0Var.f55324t;
        e2.l0 S0 = h1Var.S0();
        e2.o0 U0 = h1Var.U0();
        long j10 = -9223372036854775807L;
        if ((!h1Var.q0(16) || !h1Var.Q0()) && h1Var.q0(16)) {
            j10 = h1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f10493a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f10497f.f10416a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((e2.o0) this.f26326b, U0) && Objects.equals((String) this.f26327c, str2) && Objects.equals((Uri) this.d, uri) && this.f26325a == j10) {
            return;
        }
        this.f26327c = str2;
        this.d = uri;
        this.f26326b = U0;
        this.f26325a = j10;
        m9.y I = d0Var.f55317m.I(U0);
        if (I != null) {
            n0Var.f55492s = null;
            if (I.isDone()) {
                try {
                    bitmap = (Bitmap) c8.u9.a(I);
                } catch (CancellationException | ExecutionException e10) {
                    h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
                }
            } else {
                j3 = j10;
                uri2 = uri;
                o0Var = U0;
                pe peVar = new pe(this, o0Var, str2, uri2, j3);
                str2 = str2;
                n0Var.f55492s = peVar;
                Handler handler = d0Var.f55316l;
                Objects.requireNonNull(handler);
                I.b(new m9.u(0, I, peVar), new l2.e0(handler, 1));
                p4.n0.f0(n0Var.f55487n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
            }
        }
        j3 = j10;
        uri2 = uri;
        o0Var = U0;
        p4.n0.f0(n0Var.f55487n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
    }

    public void w(e2.l1 l1Var) {
        p4.n0 n0Var = (p4.n0) this.f26328e;
        p4.d0 d0Var = n0Var.h;
        p4.h1 h1Var = d0Var.f55324t;
        if (n0Var.f55497y.a(17) && h1Var.u().a(17) && !l1Var.p()) {
            int i7 = p4.n.f55479a;
            ArrayList arrayList = new ArrayList();
            e2.k1 k1Var = new e2.k1();
            for (int i10 = 0; i10 < l1Var.o(); i10++) {
                arrayList.add(l1Var.m(i10, k1Var, 0L).f10470c);
            }
            ArrayList arrayList2 = new ArrayList();
            p4.l0 l0Var = new p4.l0(this, new AtomicInteger(0), arrayList, arrayList2, 0);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                byte[] bArr = ((e2.l0) arrayList.get(i11)).d.f10579k;
                if (bArr == null) {
                    arrayList2.add(null);
                    l0Var.run();
                } else {
                    m9.y V = d0Var.f55317m.V(bArr);
                    arrayList2.add(V);
                    Handler handler = d0Var.f55316l;
                    Objects.requireNonNull(handler);
                    V.b(l0Var, new l2.e0(handler, 1));
                }
            }
            return;
        }
        p4.n0.e0(n0Var.f55487n, null);
    }

    @Override
    public void g() {
    }

    @Override
    public void c(int i7) {
    }

    @Override
    public void f(int i7, p4.n1 n1Var) {
    }

    @Override
    public void i(int i7, p4.o oVar) {
    }

    public pe(p4.n0 n0Var) {
        this.f26328e = n0Var;
        this.f26326b = e2.o0.L;
        this.f26327c = "";
        this.f26325a = -9223372036854775807L;
    }

    public pe(pe peVar, e2.o0 o0Var, String str, Uri uri, long j3) {
        this.f26328e = peVar;
        this.f26326b = o0Var;
        this.f26327c = str;
        this.d = uri;
        this.f26325a = j3;
    }

    public pe(MediaController mediaController, d20 d20Var, File file, jf jfVar) {
        this.f26328e = mediaController;
        this.f26326b = d20Var;
        this.f26327c = file;
        this.d = jfVar;
        this.f26325a = 0L;
    }

    @Override
    public void d(int i7, int i10, int i11) {
    }

    @Override
    public void a(int i7, p4.f1 f1Var, e2.y0 y0Var, boolean z10, boolean z11) {
    }
}
