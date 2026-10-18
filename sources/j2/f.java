package j2;

import ah.h0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.a2;
import b2.b1;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.l1;
import b2.n1;
import b2.o0;
import b2.o1;
import b2.r0;
import b2.t0;
import b2.t1;
import b2.v1;
import b2.y0;
import b2.z0;
import e2.g0;
import e2.i0;
import e2.m0;
import e2.o;
import e2.r;
import e9.c2;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.a0;
import i2.m;
import i2.y;
import java.io.IOException;
import java.util.List;
import n2.l;
import u2.b0;
import u2.f0;
import u2.j0;
import u2.t;
import v7.u6;
public final class f implements d1, j0, l {
    public final g0 f13941a;
    public final l1 f13942b;
    public final n1 f13943c;
    public final com.google.firebase.messaging.l d;
    public final SparseArray e;
    public r f13944f;
    public f1 h;
    public i0 f13945n;
    public boolean f13946r;

    public f(g0 g0Var) {
        g0Var.getClass();
        this.f13941a = g0Var;
        String str = m0.f8255a;
        Looper myLooper = Looper.myLooper();
        this.f13944f = new r((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        l1 l1Var = new l1();
        this.f13942b = l1Var;
        this.f13943c = new n1();
        ?? obj = new Object();
        obj.f7648a = l1Var;
        l0 l0Var = n0.f8477b;
        obj.f7649b = x1.e;
        obj.f7650c = c2.h;
        this.d = obj;
        this.e = new SparseArray();
    }

    @Override
    public final void a(int i10, f0 f0Var, int i11) {
        a o10 = o(i10, f0Var);
        q(o10, 1022, new c(o10, i11, 27, (char) 0));
    }

    @Override
    public final void b(int i10, f0 f0Var, Exception exc) {
        a o10 = o(i10, f0Var);
        q(o10, 1024, new c(o10, exc, 28));
    }

    @Override
    public final void c(int i10, f0 f0Var, oa.d dVar) {
        a o10 = o(i10, f0Var);
        q(o10, 1023, new e(o10, dVar, 14));
    }

    @Override
    public final void d(int i10, f0 f0Var, b0 b0Var) {
        a o10 = o(i10, f0Var);
        q(o10, 1005, new e(o10, b0Var, 6));
    }

    @Override
    public final void e(int i10, f0 f0Var, b0 b0Var) {
        a o10 = o(i10, f0Var);
        q(o10, 1004, new h0(20, o10, b0Var));
    }

    @Override
    public final void f(int i10, f0 f0Var, t tVar, b0 b0Var) {
        a o10 = o(i10, f0Var);
        q(o10, 1001, new c(o10, tVar, b0Var, 29, (byte) 0));
    }

    @Override
    public final void g(int i10, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        a o10 = o(i10, f0Var);
        q(o10, 1003, new e1.c(o10, tVar, b0Var, iOException, z10));
    }

    @Override
    public final void h(int i10, f0 f0Var) {
        a o10 = o(i10, f0Var);
        q(o10, 1027, new e(o10, 7));
    }

    @Override
    public final void i(int i10, f0 f0Var, t tVar, b0 b0Var, int i11) {
        a o10 = o(i10, f0Var);
        q(o10, 1000, new c(o10, tVar, b0Var, i11));
    }

    @Override
    public final void j(int i10, f0 f0Var) {
        a o10 = o(i10, f0Var);
        q(o10, 1025, new e(o10, 15));
    }

    @Override
    public final void k(int i10, f0 f0Var, t tVar, b0 b0Var) {
        a o10 = o(i10, f0Var);
        q(o10, 1002, new c(o10, tVar, b0Var, 25, (byte) 0));
    }

    public final a l() {
        return n((f0) this.d.d);
    }

    public final a m(o1 o1Var, int i10, f0 f0Var) {
        f0 f0Var2;
        boolean z10;
        if (o1Var.p()) {
            f0Var2 = null;
        } else {
            f0Var2 = f0Var;
        }
        this.f13941a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (o1Var.equals(this.h.y0()) && i10 == this.h.n0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        if (f0Var2 != null && f0Var2.b()) {
            if (z10 && this.h.m0() == f0Var2.f47348b && this.h.N() == f0Var2.f47349c) {
                j10 = this.h.M0();
            }
        } else if (z10) {
            j10 = this.h.a0();
        } else if (!o1Var.p()) {
            j10 = m0.h0(o1Var.m(i10, this.f13943c, 0L).f3879l);
        }
        return new a(elapsedRealtime, o1Var, i10, f0Var2, j10, this.h.y0(), this.h.n0(), (f0) this.d.d, this.h.M0(), this.h.q());
    }

    public final a n(f0 f0Var) {
        o1 o1Var;
        this.h.getClass();
        if (f0Var == null) {
            o1Var = null;
        } else {
            o1Var = (o1) ((c2) this.d.f7650c).get(f0Var);
        }
        if (f0Var != null && o1Var != null) {
            return m(o1Var, o1Var.g(f0Var.f47347a, this.f13942b).f3826c, f0Var);
        }
        int n02 = this.h.n0();
        o1 y02 = this.h.y0();
        if (n02 >= y02.o()) {
            y02 = o1.f3894a;
        }
        return m(y02, n02, null);
    }

    public final a o(int i10, f0 f0Var) {
        this.h.getClass();
        if (f0Var != null) {
            if (((o1) ((c2) this.d.f7650c).get(f0Var)) != null) {
                return n(f0Var);
            }
            return m(o1.f3894a, i10, f0Var);
        }
        o1 y02 = this.h.y0();
        if (i10 >= y02.o()) {
            y02 = o1.f3894a;
        }
        return m(y02, i10, null);
    }

    @Override
    public final void onAudioAttributesChanged(b2.f fVar) {
        a p5 = p();
        q(p5, 20, new c(p5, fVar, 2));
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        a p5 = p();
        q(p5, 21, new e(p5, i10, 2));
    }

    @Override
    public final void onAvailableCommandsChanged(b1 b1Var) {
        a l4 = l();
        q(l4, 13, new e(l4, b1Var, 19));
    }

    @Override
    public final void onCues(List list) {
        a l4 = l();
        q(l4, 27, new y(l4, list));
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        a l4 = l();
        q(l4, 3, new e(l4, z10, 3));
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        a l4 = l();
        q(l4, 7, new c(l4, z10));
    }

    @Override
    public final void onMediaItemTransition(o0 o0Var, int i10) {
        a l4 = l();
        q(l4, 1, new e(l4, o0Var, i10));
    }

    @Override
    public final void onMediaMetadataChanged(r0 r0Var) {
        a l4 = l();
        q(l4, 14, new c(l4, r0Var, 22));
    }

    @Override
    public final void onMetadata(t0 t0Var) {
        a l4 = l();
        q(l4, 28, new c(l4, t0Var, 3));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, 5, new c(l4, z10, i10, 10));
    }

    @Override
    public final void onPlaybackParametersChanged(z0 z0Var) {
        a l4 = l();
        q(l4, 12, new fh.b(l4, z0Var));
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        a l4 = l();
        q(l4, 4, new c(l4, i10, 13, (char) 0));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a l4 = l();
        q(l4, 6, new c(l4, i10, 6, (char) 0));
    }

    @Override
    public final void onPlayerError(y0 y0Var) {
        a l4;
        f0 f0Var;
        if ((y0Var instanceof m) && (f0Var = ((m) y0Var).E) != null) {
            l4 = n(f0Var);
        } else {
            l4 = l();
        }
        q(l4, 10, new e1.c(l4, y0Var, 24));
    }

    @Override
    public final void onPlayerErrorChanged(y0 y0Var) {
        a l4;
        f0 f0Var;
        if ((y0Var instanceof m) && (f0Var = ((m) y0Var).E) != null) {
            l4 = n(f0Var);
        } else {
            l4 = l();
        }
        q(l4, 10, new c(l4, y0Var, 8));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, -1, new c(l4, z10, i10, 1));
    }

    @Override
    public final void onPlaylistMetadataChanged(r0 r0Var) {
        a l4 = l();
        q(l4, 15, new e(l4, r0Var, 16));
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        a l4 = l();
        q(l4, 8, new c(l4, i10, 14, (char) 0));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a l4 = l();
        q(l4, 9, new e(l4, z10, 17));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a p5 = p();
        q(p5, 23, new e(p5, z10, 10));
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a p5 = p();
        q(p5, 24, new c(p5, i10, i11));
    }

    @Override
    public final void onTimelineChanged(o1 o1Var, int i10) {
        f1 f1Var = this.h;
        f1Var.getClass();
        com.google.firebase.messaging.l lVar = this.d;
        lVar.d = com.google.firebase.messaging.l.t(f1Var, (n0) lVar.f7649b, (f0) lVar.e, (l1) lVar.f7648a);
        lVar.M(f1Var.y0());
        a l4 = l();
        q(l4, 0, new e(l4, i10, 20));
    }

    @Override
    public final void onTrackSelectionParametersChanged(t1 t1Var) {
        a l4 = l();
        q(l4, 19, new e(l4, t1Var, 9));
    }

    @Override
    public final void onTracksChanged(v1 v1Var) {
        a l4 = l();
        q(l4, 2, new c(l4, v1Var, 9));
    }

    @Override
    public final void onVideoSizeChanged(a2 a2Var) {
        a p5 = p();
        q(p5, 25, new a0(p5, a2Var));
    }

    @Override
    public final void onVolumeChanged(float f7) {
        a p5 = p();
        q(p5, 22, new e(p5, f7));
    }

    public final a p() {
        return n((f0) this.d.f7651f);
    }

    public final void q(a aVar, int i10, o oVar) {
        this.e.put(i10, aVar);
        this.f13944f.e(i10, oVar);
    }

    public final void r(i2.h0 h0Var, Looper looper) {
        boolean z10;
        boolean z11 = true;
        if (this.h != null && !((n0) this.d.f7649b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        h0Var.getClass();
        this.h = h0Var;
        this.f13945n = this.f13941a.a(looper, null);
        r rVar = this.f13944f;
        h0 h0Var2 = new h0(19, this, h0Var);
        rVar.getClass();
        g0 g0Var = this.f13941a;
        if (g0Var == null) {
            z11 = false;
        }
        u6.p(z11);
        this.f13944f = new r(rVar.d, looper, looper.getThread(), g0Var, h0Var2, rVar.f8280i);
    }

    @Override
    public final void onPositionDiscontinuity(e1 e1Var, e1 e1Var2, int i10) {
        if (i10 == 1) {
            this.f13946r = false;
        }
        f1 f1Var = this.h;
        f1Var.getClass();
        com.google.firebase.messaging.l lVar = this.d;
        lVar.d = com.google.firebase.messaging.l.t(f1Var, (n0) lVar.f7649b, (f0) lVar.e, (l1) lVar.f7648a);
        a l4 = l();
        q(l4, 11, new i2.r(l4, i10, e1Var, e1Var2));
    }

    @Override
    public final void onCues(d2.c cVar) {
        a l4 = l();
        q(l4, 27, new c(l4, cVar, 15));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onEvents(f1 f1Var, c1 c1Var) {
    }
}
