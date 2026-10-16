package j2;

import ah.h0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.a1;
import b2.b2;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.g1;
import b2.m1;
import b2.o1;
import b2.p0;
import b2.p1;
import b2.s0;
import b2.u0;
import b2.u1;
import b2.w1;
import b2.z0;
import com.google.firebase.messaging.m;
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
import i2.y;
import java.io.IOException;
import java.util.List;
import u2.c0;
import u2.k0;
import u2.u;
import v7.u6;
public final class f implements e1, k0, n2.k {
    public final g0 f12529a;
    public final m1 f12530b;
    public final o1 f12531c;
    public final m d;
    public final SparseArray e;
    public r f12532f;
    public g1 h;
    public i0 f12533n;
    public boolean f12534r;

    public f(g0 g0Var) {
        g0Var.getClass();
        this.f12529a = g0Var;
        String str = m0.f8375a;
        Looper myLooper = Looper.myLooper();
        this.f12532f = new r((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        m1 m1Var = new m1();
        this.f12530b = m1Var;
        this.f12531c = new o1();
        ?? obj = new Object();
        obj.f6194a = m1Var;
        l0 l0Var = n0.f8595b;
        obj.f6195b = x1.e;
        obj.f6196c = c2.h;
        this.d = obj;
        this.e = new SparseArray();
    }

    @Override
    public final void a(int i10, u2.g0 g0Var, int i11) {
        a o10 = o(i10, g0Var);
        q(o10, 1022, new c(o10, i11, 25, (char) 0));
    }

    @Override
    public final void b(int i10, u2.g0 g0Var, Exception exc) {
        a o10 = o(i10, g0Var);
        q(o10, 1024, new c(o10, exc, 26));
    }

    @Override
    public final void c(int i10, u2.g0 g0Var, oa.d dVar) {
        a o10 = o(i10, g0Var);
        q(o10, 1023, new e(o10, dVar, 12));
    }

    @Override
    public final void d(int i10, u2.g0 g0Var, c0 c0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1005, new e(o10, c0Var, 4));
    }

    @Override
    public final void e(int i10, u2.g0 g0Var, c0 c0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1004, new h0(18, o10, c0Var));
    }

    @Override
    public final void f(int i10, u2.g0 g0Var, u uVar, c0 c0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1001, new c(o10, (Object) uVar, (Object) c0Var, 27));
    }

    @Override
    public final void g(int i10, u2.g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        a o10 = o(i10, g0Var);
        q(o10, 1003, new f1.a(o10, uVar, c0Var, iOException, z10));
    }

    @Override
    public final void h(int i10, u2.g0 g0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1027, new e(o10, 5));
    }

    @Override
    public final void i(int i10, u2.g0 g0Var, u uVar, c0 c0Var, int i11) {
        a o10 = o(i10, g0Var);
        q(o10, 1000, new c(o10, uVar, c0Var, i11));
    }

    @Override
    public final void j(int i10, u2.g0 g0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1025, new e(o10, 13));
    }

    @Override
    public final void k(int i10, u2.g0 g0Var, u uVar, c0 c0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1002, new c(o10, (Object) uVar, (Object) c0Var, 23));
    }

    public final a l() {
        return n((u2.g0) this.d.d);
    }

    public final a m(p1 p1Var, int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        boolean z10;
        if (p1Var.p()) {
            g0Var2 = null;
        } else {
            g0Var2 = g0Var;
        }
        this.f12529a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (p1Var.equals(this.h.y0()) && i10 == this.h.n0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        if (g0Var2 != null && g0Var2.b()) {
            if (z10 && this.h.m0() == g0Var2.f45921b && this.h.N() == g0Var2.f45922c) {
                j10 = this.h.M0();
            }
        } else if (z10) {
            j10 = this.h.a0();
        } else if (!p1Var.p()) {
            j10 = m0.h0(p1Var.m(i10, this.f12531c, 0L).f2270l);
        }
        return new a(elapsedRealtime, p1Var, i10, g0Var2, j10, this.h.y0(), this.h.n0(), (u2.g0) this.d.d, this.h.M0(), this.h.q());
    }

    public final a n(u2.g0 g0Var) {
        p1 p1Var;
        this.h.getClass();
        if (g0Var == null) {
            p1Var = null;
        } else {
            p1Var = (p1) ((c2) this.d.f6196c).get(g0Var);
        }
        if (g0Var != null && p1Var != null) {
            return m(p1Var, p1Var.g(g0Var.f45920a, this.f12530b).f2217c, g0Var);
        }
        int n02 = this.h.n0();
        p1 y02 = this.h.y0();
        if (n02 >= y02.o()) {
            y02 = p1.f2285a;
        }
        return m(y02, n02, null);
    }

    public final a o(int i10, u2.g0 g0Var) {
        this.h.getClass();
        if (g0Var != null) {
            if (((p1) ((c2) this.d.f6196c).get(g0Var)) != null) {
                return n(g0Var);
            }
            return m(p1.f2285a, i10, g0Var);
        }
        p1 y02 = this.h.y0();
        if (i10 >= y02.o()) {
            y02 = p1.f2285a;
        }
        return m(y02, i10, null);
    }

    @Override
    public final void onAudioAttributesChanged(b2.f fVar) {
        a p5 = p();
        q(p5, 20, new c(p5, fVar, 0));
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        a p5 = p();
        q(p5, 21, new e(p5, i10, 0));
    }

    @Override
    public final void onAvailableCommandsChanged(c1 c1Var) {
        a l4 = l();
        q(l4, 13, new e(l4, c1Var, 17));
    }

    @Override
    public final void onCues(List list) {
        a l4 = l();
        q(l4, 27, new y(l4, list));
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        a l4 = l();
        q(l4, 3, new e(l4, z10, 1));
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        a l4 = l();
        q(l4, 7, new c(l4, z10));
    }

    @Override
    public final void onMediaItemTransition(p0 p0Var, int i10) {
        a l4 = l();
        q(l4, 1, new e(l4, p0Var, i10));
    }

    @Override
    public final void onMediaMetadataChanged(s0 s0Var) {
        a l4 = l();
        q(l4, 14, new c(l4, s0Var, 20));
    }

    @Override
    public final void onMetadata(u0 u0Var) {
        a l4 = l();
        q(l4, 28, new c(l4, u0Var, 1));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, 5, new c(l4, z10, i10));
    }

    @Override
    public final void onPlaybackParametersChanged(a1 a1Var) {
        a l4 = l();
        q(l4, 12, new fi.c2(l4, a1Var, 27));
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        a l4 = l();
        q(l4, 4, new c(l4, i10, 11, (char) 0));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a l4 = l();
        q(l4, 6, new c(l4, i10, 4, (char) 0));
    }

    @Override
    public final void onPlayerError(z0 z0Var) {
        a l4;
        u2.g0 g0Var;
        if ((z0Var instanceof i2.m) && (g0Var = ((i2.m) z0Var).E) != null) {
            l4 = n(g0Var);
        } else {
            l4 = l();
        }
        q(l4, 10, new f1.a(l4, z0Var, 15));
    }

    @Override
    public final void onPlayerErrorChanged(z0 z0Var) {
        a l4;
        u2.g0 g0Var;
        if ((z0Var instanceof i2.m) && (g0Var = ((i2.m) z0Var).E) != null) {
            l4 = n(g0Var);
        } else {
            l4 = l();
        }
        q(l4, 10, new c(l4, z0Var, 6));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, -1, new fi.c2(l4, z10, i10));
    }

    @Override
    public final void onPlaylistMetadataChanged(s0 s0Var) {
        a l4 = l();
        q(l4, 15, new e(l4, s0Var, 14));
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        a l4 = l();
        q(l4, 8, new c(l4, i10, 12, (char) 0));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a l4 = l();
        q(l4, 9, new e(l4, z10, 15));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a p5 = p();
        q(p5, 23, new e(p5, z10, 8));
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a p5 = p();
        q(p5, 24, new c(p5, i10, i11));
    }

    @Override
    public final void onTimelineChanged(p1 p1Var, int i10) {
        g1 g1Var = this.h;
        g1Var.getClass();
        m mVar = this.d;
        mVar.d = m.p(g1Var, (n0) mVar.f6195b, (u2.g0) mVar.e, (m1) mVar.f6194a);
        mVar.H(g1Var.y0());
        a l4 = l();
        q(l4, 0, new e(l4, i10, 18));
    }

    @Override
    public final void onTrackSelectionParametersChanged(u1 u1Var) {
        a l4 = l();
        q(l4, 19, new e(l4, u1Var, 7));
    }

    @Override
    public final void onTracksChanged(w1 w1Var) {
        a l4 = l();
        q(l4, 2, new c(l4, w1Var, 7));
    }

    @Override
    public final void onVideoSizeChanged(b2 b2Var) {
        a p5 = p();
        q(p5, 25, new a0(p5, b2Var));
    }

    @Override
    public final void onVolumeChanged(float f7) {
        a p5 = p();
        q(p5, 22, new e(p5, f7));
    }

    public final a p() {
        return n((u2.g0) this.d.f6197f);
    }

    public final void q(a aVar, int i10, o oVar) {
        this.e.put(i10, aVar);
        this.f12532f.e(i10, oVar);
    }

    public final void r(i2.h0 h0Var, Looper looper) {
        boolean z10;
        boolean z11 = true;
        if (this.h != null && !((n0) this.d.f6195b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        h0Var.getClass();
        this.h = h0Var;
        this.f12533n = this.f12529a.a(looper, null);
        r rVar = this.f12532f;
        h0 h0Var2 = new h0(17, this, h0Var);
        rVar.getClass();
        g0 g0Var = this.f12529a;
        if (g0Var == null) {
            z11 = false;
        }
        u6.p(z11);
        this.f12532f = new r(rVar.d, looper, looper.getThread(), g0Var, h0Var2, rVar.f8400i);
    }

    @Override
    public final void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        if (i10 == 1) {
            this.f12534r = false;
        }
        g1 g1Var = this.h;
        g1Var.getClass();
        m mVar = this.d;
        mVar.d = m.p(g1Var, (n0) mVar.f6195b, (u2.g0) mVar.e, (m1) mVar.f6194a);
        a l4 = l();
        q(l4, 11, new i2.r(l4, i10, f1Var, f1Var2));
    }

    @Override
    public final void onCues(d2.c cVar) {
        a l4 = l();
        q(l4, 27, new c(l4, cVar, 13));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onEvents(g1 g1Var, d1 d1Var) {
    }
}
