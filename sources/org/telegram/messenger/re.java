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
import org.telegram.ui.lo0;
public final class re implements mf, m9.t, p4.u {
    public long f25282a;
    public Object f25283b;
    public Object f25284c;
    public Object d;
    public final Object f25285e;

    public re(android.content.Context r23, org.telegram.ui.Components.we0 r24, final org.telegram.ui.Components.f8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.g6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.re.<init>(android.content.Context, org.telegram.ui.Components.we0, org.telegram.ui.Components.f8, boolean, int, org.telegram.ui.ActionBar.g6):void");
    }

    @Override
    public void b(int i7, p4.l1 l1Var, boolean z9, boolean z10, int i10) {
        p4.m0 m0Var = (p4.m0) this.f25285e;
        m0Var.p0(m0Var.h.f53230t);
    }

    @Override
    public void e(int i7, e2.y0 y0Var) {
        int i10;
        p4.m0 m0Var = (p4.m0) this.f25285e;
        p4.g1 g1Var = m0Var.h.f53230t;
        if (g1Var.p0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (m0Var.f53388t != i10) {
            m0Var.f53388t = i10;
            ((q4.l) m0Var.f53382n.f53816b).f53798a.setFlags(i10 | 3);
        }
        m0Var.p0(g1Var);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((p4.m0) ((re) this.f25285e).f25285e).f53387s) {
            return;
        }
        h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override
    public void j(int i7, p4.i1 i1Var) {
        Bundle bundle = i1Var.f53322c;
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
        q4.q qVar = ((p4.m0) this.f25285e).f53382n;
        String str = i1Var.f53321b;
        qVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((q4.l) qVar.f53816b).f53798a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public boolean k() {
        return ((j20) this.f25283b).W;
    }

    public void l(long j3, float f10) {
        File file = (File) this.f25284c;
        j20 j20Var = (j20) this.f25283b;
        if (!j20Var.W) {
            if (j3 < 0) {
                j3 = file.length();
            }
            long j10 = j3;
            if (!j20Var.Y && this.f25282a == j10) {
                return;
            }
            this.f25282a = j10;
            MediaController mediaController = (MediaController) this.f25285e;
            lf lfVar = (lf) this.d;
            String[] strArr = MediaController.V1;
            j20 j20Var2 = lfVar.f23888b;
            boolean z9 = j20Var2.X;
            if (z9) {
                j20Var2.X = false;
            }
            g0.h3(new ae(mediaController, false, false, lfVar, file, f10, 0L, z9, j10));
        }
    }

    public void m() {
        ((org.telegram.ui.Components.f8) this.d).dismiss();
        this.f25282a = System.currentTimeMillis();
    }

    public void n() {
        e2.e eVar;
        p4.m0 m0Var = (p4.m0) this.f25285e;
        p4.g1 g1Var = m0Var.h.f53230t;
        g1Var.K().getClass();
        q4.q qVar = m0Var.f53382n;
        if (g1Var.p0(21)) {
            eVar = g1Var.H();
        } else {
            eVar = e2.e.f10215i;
        }
        ((q4.l) qVar.f53816b).f53798a.setPlaybackToLocal(eVar.b());
    }

    public void o(e2.l0 l0Var) {
        p4.m0 m0Var = (p4.m0) this.f25285e;
        q4.q qVar = m0Var.f53382n;
        v();
        if (l0Var == null) {
            ((q4.l) qVar.f53816b).f53798a.setRatingType(0);
        } else {
            ((q4.l) qVar.f53816b).f53798a.setRatingType(p4.n.e(l0Var.d.f10433i));
        }
        m0Var.p0(m0Var.h.f53230t);
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p4.m0 m0Var = (p4.m0) ((re) this.f25285e).f25285e;
        if (this != m0Var.f53387s) {
            return;
        }
        p4.m0.f0(m0Var.f53382n, p4.n.b((e2.o0) this.f25283b, (String) this.f25284c, (Uri) this.d, this.f25282a, bitmap));
        p4.d0 d0Var = m0Var.h;
        h2.m0.W(d0Var.f53225o, new p4.y(d0Var, 1));
    }

    public void p(int i7, p4.g1 g1Var) {
        e2.o0 o0Var;
        int i10;
        p4.m0 m0Var = (p4.m0) this.f25285e;
        t(g1Var.T0());
        if (g1Var.p0(18)) {
            o0Var = g1Var.k0();
        } else {
            o0Var = e2.o0.L;
        }
        q(o0Var);
        g1Var.U0();
        v();
        s(g1Var.D0());
        r(g1Var.m());
        g1Var.K();
        n();
        if (g1Var.p0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (m0Var.f53388t != i10) {
            m0Var.f53388t = i10;
            ((q4.l) m0Var.f53382n.f53816b).f53798a.setFlags(i10 | 3);
        }
        o(g1Var.S0());
    }

    public void q(e2.o0 o0Var) {
        p4.m0 m0Var = (p4.m0) this.f25285e;
        q4.q qVar = m0Var.f53382n;
        if (!TextUtils.equals(((q4.f) ((q4.u) qVar.f53817c).f53824a).f53781a.getQueueTitle(), o0Var.f10427a)) {
            ((q4.l) qVar.f53816b).f53798a.setQueueTitle((m0Var.f53392y.a(17) && m0Var.h.f53230t.t().a(17)) ? null : null);
        }
    }

    public void r(int i7) {
        q4.q qVar = ((p4.m0) this.f25285e).f53382n;
        int i10 = p4.n.f53399a;
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
        q4.l lVar = (q4.l) qVar.f53816b;
        if (lVar.f53805j != i11) {
            lVar.f53805j = i11;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f53802f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f53802f.getBroadcastItem(beginBroadcast)).e(i11);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                lVar.f53802f.finishBroadcast();
            }
        }
    }

    public void s(boolean z9) {
        q4.q qVar = ((p4.m0) this.f25285e).f53382n;
        int i7 = p4.n.f53399a;
        q4.l lVar = (q4.l) qVar.f53816b;
        if (lVar.f53806k != z9) {
            lVar.f53806k = z9 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f53802f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f53802f.getBroadcastItem(beginBroadcast)).j(z9 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f53802f.finishBroadcast();
            }
        }
    }

    public void t(e2.l1 l1Var) {
        w(l1Var);
        v();
    }

    public void u(int i7) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f25284c;
        if (System.currentTimeMillis() - this.f25282a < 200) {
            g0.h3(new org.telegram.ui.Components.r2(this, i7, 1));
        } else if (i7 == 0) {
            z0Var.setVisibility(8);
        } else {
            z0Var.setVisibility(0);
        }
    }

    public void v() {
        String str;
        Uri uri;
        long j3;
        Uri uri2;
        e2.o0 o0Var;
        Uri uri3;
        p4.m0 m0Var = (p4.m0) this.f25285e;
        p4.d0 d0Var = m0Var.h;
        p4.g1 g1Var = d0Var.f53230t;
        e2.l0 S0 = g1Var.S0();
        e2.o0 U0 = g1Var.U0();
        long j10 = -9223372036854775807L;
        if ((!g1Var.p0(16) || !g1Var.P0()) && g1Var.p0(16)) {
            j10 = g1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f10349a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f10353f.f10272a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((e2.o0) this.f25283b, U0) && Objects.equals((String) this.f25284c, str2) && Objects.equals((Uri) this.d, uri) && this.f25282a == j10) {
            return;
        }
        this.f25284c = str2;
        this.d = uri;
        this.f25283b = U0;
        this.f25282a = j10;
        m9.y A = d0Var.f53223m.A(U0);
        if (A != null) {
            m0Var.f53387s = null;
            if (A.isDone()) {
                try {
                    bitmap = (Bitmap) c8.s9.a(A);
                } catch (CancellationException | ExecutionException e10) {
                    h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
                }
            } else {
                j3 = j10;
                uri2 = uri;
                o0Var = U0;
                re reVar = new re(this, o0Var, str2, uri2, j3);
                str2 = str2;
                m0Var.f53387s = reVar;
                Handler handler = d0Var.f53222l;
                Objects.requireNonNull(handler);
                A.b(new m9.u(0, A, reVar), new l2.g0(handler, 1));
                p4.m0.f0(m0Var.f53382n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
            }
        }
        j3 = j10;
        uri2 = uri;
        o0Var = U0;
        p4.m0.f0(m0Var.f53382n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
    }

    public void w(e2.l1 l1Var) {
        p4.m0 m0Var = (p4.m0) this.f25285e;
        p4.d0 d0Var = m0Var.h;
        p4.g1 g1Var = d0Var.f53230t;
        if (m0Var.f53392y.a(17) && g1Var.t().a(17) && !l1Var.p()) {
            int i7 = p4.n.f53399a;
            ArrayList arrayList = new ArrayList();
            e2.k1 k1Var = new e2.k1();
            for (int i10 = 0; i10 < l1Var.o(); i10++) {
                arrayList.add(l1Var.m(i10, k1Var, 0L).f10326c);
            }
            ArrayList arrayList2 = new ArrayList();
            lo0 lo0Var = new lo0(this, new AtomicInteger(0), arrayList, arrayList2, 22);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                byte[] bArr = ((e2.l0) arrayList.get(i11)).d.f10435k;
                if (bArr == null) {
                    arrayList2.add(null);
                    lo0Var.run();
                } else {
                    m9.y W = d0Var.f53223m.W(bArr);
                    arrayList2.add(W);
                    Handler handler = d0Var.f53222l;
                    Objects.requireNonNull(handler);
                    W.b(lo0Var, new l2.g0(handler, 1));
                }
            }
            return;
        }
        p4.m0.e0(m0Var.f53382n, null);
    }

    @Override
    public void g() {
    }

    @Override
    public void c(int i7) {
    }

    @Override
    public void f(int i7, p4.m1 m1Var) {
    }

    @Override
    public void i(int i7, p4.o oVar) {
    }

    public re(p4.m0 m0Var) {
        this.f25285e = m0Var;
        this.f25283b = e2.o0.L;
        this.f25284c = "";
        this.f25282a = -9223372036854775807L;
    }

    public re(re reVar, e2.o0 o0Var, String str, Uri uri, long j3) {
        this.f25285e = reVar;
        this.f25283b = o0Var;
        this.f25284c = str;
        this.d = uri;
        this.f25282a = j3;
    }

    public re(MediaController mediaController, j20 j20Var, File file, lf lfVar) {
        this.f25285e = mediaController;
        this.f25283b = j20Var;
        this.f25284c = file;
        this.d = lfVar;
        this.f25282a = 0L;
    }

    @Override
    public void d(int i7, int i10, int i11) {
    }

    @Override
    public void a(int i7, p4.e1 e1Var, e2.y0 y0Var, boolean z9, boolean z10) {
    }
}
