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
import org.telegram.ui.hn0;
public final class qe implements lf, m9.t, p4.u {
    public long f26084a;
    public Object f26085b;
    public Object f26086c;
    public Object d;
    public final Object f26087e;

    public qe(android.content.Context r23, org.telegram.ui.Components.ye0 r24, final org.telegram.ui.Components.c8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.e6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qe.<init>(android.content.Context, org.telegram.ui.Components.ye0, org.telegram.ui.Components.c8, boolean, int, org.telegram.ui.ActionBar.e6):void");
    }

    @Override
    public void b(int i7, p4.l1 l1Var, boolean z10, boolean z11, int i10) {
        p4.m0 m0Var = (p4.m0) this.f26087e;
        m0Var.p0(m0Var.h.f54635t);
    }

    @Override
    public void e(int i7, e2.y0 y0Var) {
        int i10;
        p4.m0 m0Var = (p4.m0) this.f26087e;
        p4.g1 g1Var = m0Var.h.f54635t;
        if (g1Var.p0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (m0Var.f54793t != i10) {
            m0Var.f54793t = i10;
            ((q4.l) m0Var.f54787n.f55252b).f55234a.setFlags(i10 | 3);
        }
        m0Var.p0(g1Var);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((p4.m0) ((qe) this.f26087e).f26087e).f54792s) {
            return;
        }
        h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override
    public void j(int i7, p4.i1 i1Var) {
        Bundle bundle = i1Var.f54727c;
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
        q4.q qVar = ((p4.m0) this.f26087e).f54787n;
        String str = i1Var.f54726b;
        qVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((q4.l) qVar.f55252b).f55234a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public boolean k() {
        return ((g20) this.f26085b).W;
    }

    public void l(long j3, float f10) {
        File file = (File) this.f26086c;
        g20 g20Var = (g20) this.f26085b;
        if (!g20Var.W) {
            if (j3 < 0) {
                j3 = file.length();
            }
            long j10 = j3;
            if (!g20Var.Y && this.f26084a == j10) {
                return;
            }
            this.f26084a = j10;
            MediaController mediaController = (MediaController) this.f26087e;
            kf kfVar = (kf) this.d;
            String[] strArr = MediaController.W1;
            g20 g20Var2 = kfVar.f24685b;
            boolean z10 = g20Var2.X;
            if (z10) {
                g20Var2.X = false;
            }
            g0.h3(new zd(mediaController, false, false, kfVar, file, f10, 0L, z10, j10));
        }
    }

    public void m() {
        ((org.telegram.ui.Components.c8) this.d).dismiss();
        this.f26084a = System.currentTimeMillis();
    }

    public void n() {
        e2.e eVar;
        p4.m0 m0Var = (p4.m0) this.f26087e;
        p4.g1 g1Var = m0Var.h.f54635t;
        g1Var.K().getClass();
        q4.q qVar = m0Var.f54787n;
        if (g1Var.p0(21)) {
            eVar = g1Var.H();
        } else {
            eVar = e2.e.f10051i;
        }
        ((q4.l) qVar.f55252b).f55234a.setPlaybackToLocal(eVar.b());
    }

    public void o(e2.l0 l0Var) {
        p4.m0 m0Var = (p4.m0) this.f26087e;
        q4.q qVar = m0Var.f54787n;
        v();
        if (l0Var == null) {
            ((q4.l) qVar.f55252b).f55234a.setRatingType(0);
        } else {
            ((q4.l) qVar.f55252b).f55234a.setRatingType(p4.n.e(l0Var.d.f10269i));
        }
        m0Var.p0(m0Var.h.f54635t);
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p4.m0 m0Var = (p4.m0) ((qe) this.f26087e).f26087e;
        if (this != m0Var.f54792s) {
            return;
        }
        p4.m0.f0(m0Var.f54787n, p4.n.b((e2.o0) this.f26085b, (String) this.f26086c, (Uri) this.d, this.f26084a, bitmap));
        p4.d0 d0Var = m0Var.h;
        h2.l0.W(d0Var.f54630o, new p4.y(d0Var, 1));
    }

    public void p(int i7, p4.g1 g1Var) {
        e2.o0 o0Var;
        int i10;
        p4.m0 m0Var = (p4.m0) this.f26087e;
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
        if (m0Var.f54793t != i10) {
            m0Var.f54793t = i10;
            ((q4.l) m0Var.f54787n.f55252b).f55234a.setFlags(i10 | 3);
        }
        o(g1Var.S0());
    }

    public void q(e2.o0 o0Var) {
        p4.m0 m0Var = (p4.m0) this.f26087e;
        q4.q qVar = m0Var.f54787n;
        if (!TextUtils.equals(((q4.f) ((q4.u) qVar.f55253c).f55260a).f55217a.getQueueTitle(), o0Var.f10263a)) {
            ((q4.l) qVar.f55252b).f55234a.setQueueTitle((m0Var.f54797y.a(17) && m0Var.h.f54635t.t().a(17)) ? null : null);
        }
    }

    public void r(int i7) {
        q4.q qVar = ((p4.m0) this.f26087e).f54787n;
        int i10 = p4.n.f54804a;
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
        q4.l lVar = (q4.l) qVar.f55252b;
        if (lVar.f55241j != i11) {
            lVar.f55241j = i11;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f55238f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f55238f.getBroadcastItem(beginBroadcast)).e(i11);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                lVar.f55238f.finishBroadcast();
            }
        }
    }

    public void s(boolean z10) {
        q4.q qVar = ((p4.m0) this.f26087e).f54787n;
        int i7 = p4.n.f54804a;
        q4.l lVar = (q4.l) qVar.f55252b;
        if (lVar.f55242k != z10) {
            lVar.f55242k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f55238f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f55238f.getBroadcastItem(beginBroadcast)).j(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f55238f.finishBroadcast();
            }
        }
    }

    public void t(e2.l1 l1Var) {
        w(l1Var);
        v();
    }

    public void u(int i7) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f26086c;
        if (System.currentTimeMillis() - this.f26084a < 200) {
            g0.h3(new org.telegram.ui.Components.a2(this, i7, 2));
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
        p4.m0 m0Var = (p4.m0) this.f26087e;
        p4.d0 d0Var = m0Var.h;
        p4.g1 g1Var = d0Var.f54635t;
        e2.l0 S0 = g1Var.S0();
        e2.o0 U0 = g1Var.U0();
        long j10 = -9223372036854775807L;
        if ((!g1Var.p0(16) || !g1Var.P0()) && g1Var.p0(16)) {
            j10 = g1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f10185a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f10189f.f10108a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((e2.o0) this.f26085b, U0) && Objects.equals((String) this.f26086c, str2) && Objects.equals((Uri) this.d, uri) && this.f26084a == j10) {
            return;
        }
        this.f26086c = str2;
        this.d = uri;
        this.f26085b = U0;
        this.f26084a = j10;
        m9.y L = d0Var.f54628m.L(U0);
        if (L != null) {
            m0Var.f54792s = null;
            if (L.isDone()) {
                try {
                    bitmap = (Bitmap) c8.r9.a(L);
                } catch (CancellationException | ExecutionException e10) {
                    h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
                }
            } else {
                j3 = j10;
                uri2 = uri;
                o0Var = U0;
                qe qeVar = new qe(this, o0Var, str2, uri2, j3);
                str2 = str2;
                m0Var.f54792s = qeVar;
                Handler handler = d0Var.f54627l;
                Objects.requireNonNull(handler);
                L.b(new m9.u(0, L, qeVar), new l2.d0(handler, 1));
                p4.m0.f0(m0Var.f54787n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
            }
        }
        j3 = j10;
        uri2 = uri;
        o0Var = U0;
        p4.m0.f0(m0Var.f54787n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
    }

    public void w(e2.l1 l1Var) {
        p4.m0 m0Var = (p4.m0) this.f26087e;
        p4.d0 d0Var = m0Var.h;
        p4.g1 g1Var = d0Var.f54635t;
        if (m0Var.f54797y.a(17) && g1Var.t().a(17) && !l1Var.p()) {
            int i7 = p4.n.f54804a;
            ArrayList arrayList = new ArrayList();
            e2.k1 k1Var = new e2.k1();
            for (int i10 = 0; i10 < l1Var.o(); i10++) {
                arrayList.add(l1Var.m(i10, k1Var, 0L).f10162c);
            }
            ArrayList arrayList2 = new ArrayList();
            hn0 hn0Var = new hn0(this, new AtomicInteger(0), arrayList, arrayList2, 25);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                byte[] bArr = ((e2.l0) arrayList.get(i11)).d.f10271k;
                if (bArr == null) {
                    arrayList2.add(null);
                    hn0Var.run();
                } else {
                    m9.y d02 = d0Var.f54628m.d0(bArr);
                    arrayList2.add(d02);
                    Handler handler = d0Var.f54627l;
                    Objects.requireNonNull(handler);
                    d02.b(hn0Var, new l2.d0(handler, 1));
                }
            }
            return;
        }
        p4.m0.e0(m0Var.f54787n, null);
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

    public qe(p4.m0 m0Var) {
        this.f26087e = m0Var;
        this.f26085b = e2.o0.L;
        this.f26086c = "";
        this.f26084a = -9223372036854775807L;
    }

    public qe(qe qeVar, e2.o0 o0Var, String str, Uri uri, long j3) {
        this.f26087e = qeVar;
        this.f26085b = o0Var;
        this.f26086c = str;
        this.d = uri;
        this.f26084a = j3;
    }

    public qe(MediaController mediaController, g20 g20Var, File file, kf kfVar) {
        this.f26087e = mediaController;
        this.f26085b = g20Var;
        this.f26086c = file;
        this.d = kfVar;
        this.f26084a = 0L;
    }

    @Override
    public void d(int i7, int i10, int i11) {
    }

    @Override
    public void a(int i7, p4.e1 e1Var, e2.y0 y0Var, boolean z10, boolean z11) {
    }
}
