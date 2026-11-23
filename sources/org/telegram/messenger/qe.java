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
import org.telegram.ui.kg0;
public final class qe implements lf, m9.t, p4.u {
    public long f26404a;
    public Object f26405b;
    public Object f26406c;
    public Object d;
    public final Object f26407e;

    public qe(android.content.Context r23, org.telegram.ui.Components.kf0 r24, final org.telegram.ui.Components.j8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.h6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qe.<init>(android.content.Context, org.telegram.ui.Components.kf0, org.telegram.ui.Components.j8, boolean, int, org.telegram.ui.ActionBar.h6):void");
    }

    @Override
    public void b(int i7, p4.n1 n1Var, boolean z10, boolean z11, int i10) {
        p4.m0 m0Var = (p4.m0) this.f26407e;
        m0Var.p0(m0Var.h.f55205t);
    }

    @Override
    public void e(int i7, e2.y0 y0Var) {
        int i10;
        p4.m0 m0Var = (p4.m0) this.f26407e;
        p4.i1 i1Var = m0Var.h.f55205t;
        if (i1Var.p0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (m0Var.f55348t != i10) {
            m0Var.f55348t = i10;
            ((q4.l) m0Var.f55342n.f55836b).f55818a.setFlags(i10 | 3);
        }
        m0Var.p0(i1Var);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((p4.m0) ((qe) this.f26407e).f26407e).f55347s) {
            return;
        }
        h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override
    public void j(int i7, p4.k1 k1Var) {
        Bundle bundle = k1Var.f55332c;
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
        q4.q qVar = ((p4.m0) this.f26407e).f55342n;
        String str = k1Var.f55331b;
        qVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((q4.l) qVar.f55836b).f55818a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public boolean k() {
        return ((f20) this.f26405b).W;
    }

    public void l(long j3, float f10) {
        File file = (File) this.f26406c;
        f20 f20Var = (f20) this.f26405b;
        if (!f20Var.W) {
            if (j3 < 0) {
                j3 = file.length();
            }
            long j10 = j3;
            if (!f20Var.Y && this.f26404a == j10) {
                return;
            }
            this.f26404a = j10;
            MediaController mediaController = (MediaController) this.f26407e;
            kf kfVar = (kf) this.d;
            String[] strArr = MediaController.W1;
            f20 f20Var2 = kfVar.f25027b;
            boolean z10 = f20Var2.X;
            if (z10) {
                f20Var2.X = false;
            }
            g0.g3(new zd(mediaController, false, false, kfVar, file, f10, 0L, z10, j10));
        }
    }

    public void m() {
        ((org.telegram.ui.Components.j8) this.d).dismiss();
        this.f26404a = System.currentTimeMillis();
    }

    public void n() {
        e2.e eVar;
        p4.m0 m0Var = (p4.m0) this.f26407e;
        p4.i1 i1Var = m0Var.h.f55205t;
        i1Var.K().getClass();
        q4.q qVar = m0Var.f55342n;
        if (i1Var.p0(21)) {
            eVar = i1Var.H();
        } else {
            eVar = e2.e.f10361i;
        }
        ((q4.l) qVar.f55836b).f55818a.setPlaybackToLocal(eVar.b());
    }

    public void o(e2.l0 l0Var) {
        p4.m0 m0Var = (p4.m0) this.f26407e;
        q4.q qVar = m0Var.f55342n;
        v();
        if (l0Var == null) {
            ((q4.l) qVar.f55836b).f55818a.setRatingType(0);
        } else {
            ((q4.l) qVar.f55836b).f55818a.setRatingType(p4.n.e(l0Var.d.f10579i));
        }
        m0Var.p0(m0Var.h.f55205t);
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p4.m0 m0Var = (p4.m0) ((qe) this.f26407e).f26407e;
        if (this != m0Var.f55347s) {
            return;
        }
        p4.m0.f0(m0Var.f55342n, p4.n.b((e2.o0) this.f26405b, (String) this.f26406c, (Uri) this.d, this.f26404a, bitmap));
        p4.d0 d0Var = m0Var.h;
        h2.l0.W(d0Var.f55200o, new p4.y(d0Var, 1));
    }

    public void p(int i7, p4.i1 i1Var) {
        e2.o0 o0Var;
        int i10;
        p4.m0 m0Var = (p4.m0) this.f26407e;
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
        if (m0Var.f55348t != i10) {
            m0Var.f55348t = i10;
            ((q4.l) m0Var.f55342n.f55836b).f55818a.setFlags(i10 | 3);
        }
        o(i1Var.S0());
    }

    public void q(e2.o0 o0Var) {
        p4.m0 m0Var = (p4.m0) this.f26407e;
        q4.q qVar = m0Var.f55342n;
        if (!TextUtils.equals(((q4.f) ((q4.u) qVar.f55837c).f55844a).f55801a.getQueueTitle(), o0Var.f10573a)) {
            ((q4.l) qVar.f55836b).f55818a.setQueueTitle((m0Var.f55352y.a(17) && m0Var.h.f55205t.t().a(17)) ? null : null);
        }
    }

    public void r(int i7) {
        q4.q qVar = ((p4.m0) this.f26407e).f55342n;
        int i10 = p4.n.f55358a;
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
        q4.l lVar = (q4.l) qVar.f55836b;
        if (lVar.f55825j != i11) {
            lVar.f55825j = i11;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f55822f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f55822f.getBroadcastItem(beginBroadcast)).e(i11);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                lVar.f55822f.finishBroadcast();
            }
        }
    }

    public void s(boolean z10) {
        q4.q qVar = ((p4.m0) this.f26407e).f55342n;
        int i7 = p4.n.f55358a;
        q4.l lVar = (q4.l) qVar.f55836b;
        if (lVar.f55826k != z10) {
            lVar.f55826k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f55822f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f55822f.getBroadcastItem(beginBroadcast)).j(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f55822f.finishBroadcast();
            }
        }
    }

    public void t(e2.l1 l1Var) {
        w(l1Var);
        v();
    }

    public void u(int i7) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f26406c;
        if (System.currentTimeMillis() - this.f26404a < 200) {
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
        p4.m0 m0Var = (p4.m0) this.f26407e;
        p4.d0 d0Var = m0Var.h;
        p4.i1 i1Var = d0Var.f55205t;
        e2.l0 S0 = i1Var.S0();
        e2.o0 U0 = i1Var.U0();
        long j10 = -9223372036854775807L;
        if ((!i1Var.p0(16) || !i1Var.P0()) && i1Var.p0(16)) {
            j10 = i1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f10495a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f10499f.f10418a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((e2.o0) this.f26405b, U0) && Objects.equals((String) this.f26406c, str2) && Objects.equals((Uri) this.d, uri) && this.f26404a == j10) {
            return;
        }
        this.f26406c = str2;
        this.d = uri;
        this.f26405b = U0;
        this.f26404a = j10;
        m9.y O = d0Var.f55198m.O(U0);
        if (O != null) {
            m0Var.f55347s = null;
            if (O.isDone()) {
                try {
                    bitmap = (Bitmap) c8.u9.a(O);
                } catch (CancellationException | ExecutionException e10) {
                    h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
                }
            } else {
                j3 = j10;
                uri2 = uri;
                o0Var = U0;
                qe qeVar = new qe(this, o0Var, str2, uri2, j3);
                str2 = str2;
                m0Var.f55347s = qeVar;
                Handler handler = d0Var.f55197l;
                Objects.requireNonNull(handler);
                O.b(new m9.u(0, O, qeVar), new l2.d0(handler, 1));
                p4.m0.f0(m0Var.f55342n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
            }
        }
        j3 = j10;
        uri2 = uri;
        o0Var = U0;
        p4.m0.f0(m0Var.f55342n, p4.n.b(o0Var, str2, uri2, j3, bitmap));
    }

    public void w(e2.l1 l1Var) {
        p4.m0 m0Var = (p4.m0) this.f26407e;
        p4.d0 d0Var = m0Var.h;
        p4.i1 i1Var = d0Var.f55205t;
        if (m0Var.f55352y.a(17) && i1Var.t().a(17) && !l1Var.p()) {
            int i7 = p4.n.f55358a;
            ArrayList arrayList = new ArrayList();
            e2.k1 k1Var = new e2.k1();
            for (int i10 = 0; i10 < l1Var.o(); i10++) {
                arrayList.add(l1Var.m(i10, k1Var, 0L).f10472c);
            }
            ArrayList arrayList2 = new ArrayList();
            kg0 kg0Var = new kg0(this, new AtomicInteger(0), arrayList, arrayList2, 29);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                byte[] bArr = ((e2.l0) arrayList.get(i11)).d.f10581k;
                if (bArr == null) {
                    arrayList2.add(null);
                    kg0Var.run();
                } else {
                    m9.y t02 = d0Var.f55198m.t0(bArr);
                    arrayList2.add(t02);
                    Handler handler = d0Var.f55197l;
                    Objects.requireNonNull(handler);
                    t02.b(kg0Var, new l2.d0(handler, 1));
                }
            }
            return;
        }
        p4.m0.e0(m0Var.f55342n, null);
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

    public qe(p4.m0 m0Var) {
        this.f26407e = m0Var;
        this.f26405b = e2.o0.L;
        this.f26406c = "";
        this.f26404a = -9223372036854775807L;
    }

    public qe(qe qeVar, e2.o0 o0Var, String str, Uri uri, long j3) {
        this.f26407e = qeVar;
        this.f26405b = o0Var;
        this.f26406c = str;
        this.d = uri;
        this.f26404a = j3;
    }

    public qe(MediaController mediaController, f20 f20Var, File file, kf kfVar) {
        this.f26407e = mediaController;
        this.f26405b = f20Var;
        this.f26406c = file;
        this.d = kfVar;
        this.f26404a = 0L;
    }

    @Override
    public void d(int i7, int i10, int i11) {
    }

    @Override
    public void a(int i7, p4.g1 g1Var, e2.y0 y0Var, boolean z10, boolean z11) {
    }
}
