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
import org.telegram.ui.jg0;
public final class pe implements kf, m9.t, p4.u {
    public long f26233a;
    public Object f26234b;
    public Object f26235c;
    public Object d;
    public final Object f26236e;

    public pe(android.content.Context r23, org.telegram.ui.Components.if0 r24, final org.telegram.ui.Components.k8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.i6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pe.<init>(android.content.Context, org.telegram.ui.Components.if0, org.telegram.ui.Components.k8, boolean, int, org.telegram.ui.ActionBar.i6):void");
    }

    @Override
    public void b(int i7, p4.n1 n1Var, boolean z10, boolean z11, int i10) {
        p4.m0 m0Var = (p4.m0) this.f26236e;
        m0Var.p0(m0Var.h.f55195t);
    }

    @Override
    public void e(int i7, e2.y0 y0Var) {
        int i10;
        p4.m0 m0Var = (p4.m0) this.f26236e;
        p4.i1 i1Var = m0Var.h.f55195t;
        if (i1Var.p0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (m0Var.f55338t != i10) {
            m0Var.f55338t = i10;
            ((q4.l) m0Var.f55332n.f55826b).f55808a.setFlags(i10 | 3);
        }
        m0Var.p0(i1Var);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((p4.m0) ((pe) this.f26236e).f26236e).f55337s) {
            return;
        }
        h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override
    public void j(int i7, p4.k1 k1Var) {
        Bundle bundle = k1Var.f55322c;
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
        q4.q qVar = ((p4.m0) this.f26236e).f55332n;
        String str = k1Var.f55321b;
        qVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((q4.l) qVar.f55826b).f55808a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public boolean k() {
        return ((e20) this.f26234b).W;
    }

    public void l(long j3, float f10) {
        File file = (File) this.f26235c;
        e20 e20Var = (e20) this.f26234b;
        if (!e20Var.W) {
            if (j3 < 0) {
                j3 = file.length();
            }
            long j10 = j3;
            if (!e20Var.Y && this.f26233a == j10) {
                return;
            }
            this.f26233a = j10;
            MediaController mediaController = (MediaController) this.f26236e;
            jf jfVar = (jf) this.d;
            String[] strArr = MediaController.W1;
            e20 e20Var2 = jfVar.f24851b;
            boolean z10 = e20Var2.X;
            if (z10) {
                e20Var2.X = false;
            }
            g0.g3(new yd(mediaController, false, false, jfVar, file, f10, 0L, z10, j10));
        }
    }

    public void m() {
        ((org.telegram.ui.Components.k8) this.d).dismiss();
        this.f26233a = System.currentTimeMillis();
    }

    public void n() {
        e2.e eVar;
        p4.m0 m0Var = (p4.m0) this.f26236e;
        p4.i1 i1Var = m0Var.h.f55195t;
        i1Var.K().getClass();
        q4.q qVar = m0Var.f55332n;
        if (i1Var.p0(21)) {
            eVar = i1Var.H();
        } else {
            eVar = e2.e.f10369i;
        }
        ((q4.l) qVar.f55826b).f55808a.setPlaybackToLocal(eVar.b());
    }

    public void o(e2.l0 l0Var) {
        p4.m0 m0Var = (p4.m0) this.f26236e;
        q4.q qVar = m0Var.f55332n;
        v();
        if (l0Var == null) {
            ((q4.l) qVar.f55826b).f55808a.setRatingType(0);
        } else {
            ((q4.l) qVar.f55826b).f55808a.setRatingType(p4.n.e(l0Var.d.f10587i));
        }
        m0Var.p0(m0Var.h.f55195t);
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p4.m0 m0Var = (p4.m0) ((pe) this.f26236e).f26236e;
        if (this != m0Var.f55337s) {
            return;
        }
        p4.m0.f0(m0Var.f55332n, p4.n.b((e2.o0) this.f26234b, (String) this.f26235c, (Uri) this.d, this.f26233a, bitmap));
        p4.d0 d0Var = m0Var.h;
        h2.l0.W(d0Var.f55190o, new p4.y(d0Var, 1));
    }

    public void p(int i7, p4.i1 i1Var) {
        e2.o0 o0Var;
        int i10;
        p4.m0 m0Var = (p4.m0) this.f26236e;
        t(i1Var.T0());
        if (i1Var.p0(18)) {
            o0Var = i1Var.k0();
        } else {
            o0Var = e2.o0.L;
        }
        q(o0Var);
        i1Var.U0();
        v();
        s(i1Var.D0());
        r(i1Var.m());
        i1Var.K();
        n();
        if (i1Var.p0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (m0Var.f55338t != i10) {
            m0Var.f55338t = i10;
            ((q4.l) m0Var.f55332n.f55826b).f55808a.setFlags(i10 | 3);
        }
        o(i1Var.S0());
    }

    public void q(e2.o0 o0Var) {
        p4.m0 m0Var = (p4.m0) this.f26236e;
        q4.q qVar = m0Var.f55332n;
        if (!TextUtils.equals(((q4.f) ((q4.u) qVar.f55827c).f55834a).f55791a.getQueueTitle(), o0Var.f10581a)) {
            ((q4.l) qVar.f55826b).f55808a.setQueueTitle((m0Var.f55342y.a(17) && m0Var.h.f55195t.t().a(17)) ? null : null);
        }
    }

    public void r(int i7) {
        q4.q qVar = ((p4.m0) this.f26236e).f55332n;
        int i10 = p4.n.f55348a;
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
        q4.l lVar = (q4.l) qVar.f55826b;
        if (lVar.f55815j != i11) {
            lVar.f55815j = i11;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f55812f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f55812f.getBroadcastItem(beginBroadcast)).e(i11);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                lVar.f55812f.finishBroadcast();
            }
        }
    }

    public void s(boolean z10) {
        q4.q qVar = ((p4.m0) this.f26236e).f55332n;
        int i7 = p4.n.f55348a;
        q4.l lVar = (q4.l) qVar.f55826b;
        if (lVar.f55816k != z10) {
            lVar.f55816k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f55812f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f55812f.getBroadcastItem(beginBroadcast)).j(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f55812f.finishBroadcast();
            }
        }
    }

    public void t(e2.l1 l1Var) {
        w(l1Var);
        v();
    }

    public void u(int i7) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f26235c;
        if (System.currentTimeMillis() - this.f26233a < 200) {
            g0.g3(new org.telegram.ui.ii(this, i7, 5));
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
        p4.m0 m0Var = (p4.m0) this.f26236e;
        p4.d0 d0Var = m0Var.h;
        p4.i1 i1Var = d0Var.f55195t;
        e2.l0 S0 = i1Var.S0();
        e2.o0 U0 = i1Var.U0();
        long j10 = -9223372036854775807L;
        if ((!i1Var.p0(16) || !i1Var.P0()) && i1Var.p0(16)) {
            j10 = i1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f10503a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f10507f.f10426a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((e2.o0) this.f26234b, U0) && Objects.equals((String) this.f26235c, str2) && Objects.equals((Uri) this.d, uri) && this.f26233a == j10) {
            return;
        }
        this.f26235c = str2;
        this.d = uri;
        this.f26234b = U0;
        this.f26233a = j10;
        m9.y O = d0Var.f55188m.O(U0);
        if (O != null) {
            m0Var.f55337s = null;
            if (O.isDone()) {
                try {
                    bitmap = (Bitmap) c8.t9.a(O);
                } catch (CancellationException | ExecutionException e10) {
                    h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
                }
            } else {
                j3 = j10;
                uri2 = uri;
                o0Var = U0;
                pe peVar = new pe(this, o0Var, str2, uri2, j3);
                str2 = str2;
                m0Var.f55337s = peVar;
                Handler handler = d0Var.f55187l;
                Objects.requireNonNull(handler);
                O.b(new m9.u(0, O, peVar), new l2.d0(handler, 1));
                p4.m0.f0(m0Var.f55332n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
            }
        }
        j3 = j10;
        uri2 = uri;
        o0Var = U0;
        p4.m0.f0(m0Var.f55332n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
    }

    public void w(e2.l1 l1Var) {
        p4.m0 m0Var = (p4.m0) this.f26236e;
        p4.d0 d0Var = m0Var.h;
        p4.i1 i1Var = d0Var.f55195t;
        if (m0Var.f55342y.a(17) && i1Var.t().a(17) && !l1Var.p()) {
            int i7 = p4.n.f55348a;
            ArrayList arrayList = new ArrayList();
            e2.k1 k1Var = new e2.k1();
            for (int i10 = 0; i10 < l1Var.o(); i10++) {
                arrayList.add(l1Var.m(i10, k1Var, 0L).f10480c);
            }
            ArrayList arrayList2 = new ArrayList();
            jg0 jg0Var = new jg0(this, new AtomicInteger(0), arrayList, arrayList2, 29);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                byte[] bArr = ((e2.l0) arrayList.get(i11)).d.f10589k;
                if (bArr == null) {
                    arrayList2.add(null);
                    jg0Var.run();
                } else {
                    m9.y t02 = d0Var.f55188m.t0(bArr);
                    arrayList2.add(t02);
                    Handler handler = d0Var.f55187l;
                    Objects.requireNonNull(handler);
                    t02.b(jg0Var, new l2.d0(handler, 1));
                }
            }
            return;
        }
        p4.m0.e0(m0Var.f55332n, null);
    }

    @Override
    public void g() {
    }

    @Override
    public void c(int i7) {
    }

    @Override
    public void f(int i7, p4.o1 o1Var) {
    }

    @Override
    public void i(int i7, p4.o oVar) {
    }

    public pe(p4.m0 m0Var) {
        this.f26236e = m0Var;
        this.f26234b = e2.o0.L;
        this.f26235c = "";
        this.f26233a = -9223372036854775807L;
    }

    public pe(pe peVar, e2.o0 o0Var, String str, Uri uri, long j3) {
        this.f26236e = peVar;
        this.f26234b = o0Var;
        this.f26235c = str;
        this.d = uri;
        this.f26233a = j3;
    }

    public pe(MediaController mediaController, e20 e20Var, File file, jf jfVar) {
        this.f26236e = mediaController;
        this.f26234b = e20Var;
        this.f26235c = file;
        this.d = jfVar;
        this.f26233a = 0L;
    }

    @Override
    public void d(int i7, int i10, int i11) {
    }

    @Override
    public void a(int i7, p4.g1 g1Var, e2.y0 y0Var, boolean z10, boolean z11) {
    }
}
