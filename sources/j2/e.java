package j2;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.b1;
import b2.h1;
import b2.j1;
import b2.k1;
import b2.n0;
import b2.p0;
import b2.q1;
import b2.s1;
import b2.u0;
import b2.v0;
import b2.x0;
import b2.x1;
import b2.y0;
import b2.z0;
import bi.cb;
import com.google.firebase.messaging.n;
import e2.d0;
import e2.m;
import e2.p;
import e2.x;
import e2.z;
import e9.a1;
import e9.f1;
import e9.g0;
import e9.i0;
import e9.k0;
import hi.y1;
import i2.a0;
import i2.e0;
import i2.s;
import i2.y;
import java.io.IOException;
import java.util.List;
import u2.c0;
import u2.m0;
import u2.u;
public final class e implements z0, m0, n2.k {
    public final x f11462a;
    public final h1 f11463b;
    public final j1 f11464c;
    public final n d;
    public final SparseArray e;
    public p f11465f;
    public b1 h;
    public z f11466n;
    public boolean f11467r;

    public e(x xVar) {
        xVar.getClass();
        this.f11462a = xVar;
        String str = d0.f7188a;
        Looper myLooper = Looper.myLooper();
        this.f11465f = new p(myLooper == null ? Looper.getMainLooper() : myLooper, xVar, new i0.b(19));
        h1 h1Var = new h1();
        this.f11463b = h1Var;
        this.f11464c = new j1();
        ?? obj = new Object();
        obj.f6103a = h1Var;
        g0 g0Var = i0.f7384b;
        obj.f6104b = a1.e;
        obj.f6105c = f1.h;
        this.d = obj;
        this.e = new SparseArray();
    }

    @Override
    public final void a(int i10, u2.g0 g0Var, int i11) {
        a o9 = o(i10, g0Var);
        q(o9, 1022, new d(o9, i11, 6));
    }

    @Override
    public final void b(int i10, u2.g0 g0Var, Exception exc) {
        a o9 = o(i10, g0Var);
        q(o9, 1024, new d(o9, exc, 7));
    }

    @Override
    public final void c(int i10, u2.g0 g0Var, c0 c0Var) {
        a o9 = o(i10, g0Var);
        q(o9, 1005, new d(o9, c0Var, 15));
    }

    @Override
    public final void d(int i10, u2.g0 g0Var, c0 c0Var) {
        a o9 = o(i10, g0Var);
        q(o9, 1004, new cb(17, o9, c0Var));
    }

    @Override
    public final void e(int i10, u2.g0 g0Var, u uVar, c0 c0Var) {
        a o9 = o(i10, g0Var);
        q(o9, 1001, new d(o9, uVar, c0Var, 8));
    }

    @Override
    public final void f(int i10, u2.g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        a o9 = o(i10, g0Var);
        q(o9, 1003, new y1(o9, uVar, c0Var, iOException, z10));
    }

    @Override
    public final void g(int i10, u2.g0 g0Var) {
        a o9 = o(i10, g0Var);
        q(o9, 1027, new d(o9, 16));
    }

    @Override
    public final void h(int i10, u2.g0 g0Var, u uVar, c0 c0Var, int i11) {
        a o9 = o(i10, g0Var);
        q(o9, 1000, new i0.b(o9, uVar, c0Var, i11));
    }

    @Override
    public final void i(int i10, u2.g0 g0Var) {
        a o9 = o(i10, g0Var);
        q(o9, 1025, new d(o9, 21));
    }

    @Override
    public final void j(int i10, u2.g0 g0Var, u uVar, c0 c0Var) {
        a o9 = o(i10, g0Var);
        q(o9, 1002, new d(o9, uVar, c0Var, 4));
    }

    @Override
    public final void k(int i10, u2.g0 g0Var) {
        a o9 = o(i10, g0Var);
        q(o9, 1023, new d(o9, 23));
    }

    public final a l() {
        return n((u2.g0) this.d.d);
    }

    public final a m(k1 k1Var, int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        boolean z10;
        if (k1Var.p()) {
            g0Var2 = null;
        } else {
            g0Var2 = g0Var;
        }
        this.f11462a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k1Var.equals(this.h.w0()) && i10 == this.h.l0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j3 = 0;
        if (g0Var2 != null && g0Var2.b()) {
            if (z10 && this.h.k0() == g0Var2.f42325b && this.h.O() == g0Var2.f42326c) {
                j3 = this.h.J0();
            }
        } else if (z10) {
            j3 = this.h.a0();
        } else if (!k1Var.p()) {
            j3 = d0.e0(k1Var.m(i10, this.f11464c, 0L).f1759l);
        }
        return new a(elapsedRealtime, k1Var, i10, g0Var2, j3, this.h.w0(), this.h.l0(), (u2.g0) this.d.d, this.h.J0(), this.h.r());
    }

    public final a n(u2.g0 g0Var) {
        k1 k1Var;
        this.h.getClass();
        if (g0Var == null) {
            k1Var = null;
        } else {
            k1Var = (k1) ((k0) this.d.f6105c).get(g0Var);
        }
        if (g0Var != null && k1Var != null) {
            return m(k1Var, k1Var.g(g0Var.f42324a, this.f11463b).f1707c, g0Var);
        }
        int l02 = this.h.l0();
        k1 w02 = this.h.w0();
        if (l02 >= w02.o()) {
            w02 = k1.f1774a;
        }
        return m(w02, l02, null);
    }

    public final a o(int i10, u2.g0 g0Var) {
        this.h.getClass();
        if (g0Var != null) {
            if (((k1) ((k0) this.d.f6105c).get(g0Var)) != null) {
                return n(g0Var);
            }
            return m(k1.f1774a, i10, g0Var);
        }
        k1 w02 = this.h.w0();
        if (i10 >= w02.o()) {
            w02 = k1.f1774a;
        }
        return m(w02, i10, null);
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        a p5 = p();
        q(p5, 20, new i0.b(p5, eVar, 9));
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        a p5 = p();
        q(p5, 21, new d(p5, i10, 12));
    }

    @Override
    public final void onAvailableCommandsChanged(x0 x0Var) {
        a l4 = l();
        q(l4, 13, new d(l4, x0Var, 26));
    }

    @Override
    public final void onCues(List list) {
        a l4 = l();
        q(l4, 27, new y(l4, list));
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        a l4 = l();
        q(l4, 3, new d(l4, z10, 10));
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        a l4 = l();
        q(l4, 7, new i0.b(l4, z10));
    }

    @Override
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
        a l4 = l();
        q(l4, 1, new d(l4, k0Var, i10));
    }

    @Override
    public final void onMediaMetadataChanged(n0 n0Var) {
        a l4 = l();
        q(l4, 14, new d(l4, n0Var, 0));
    }

    @Override
    public final void onMetadata(p0 p0Var) {
        a l4 = l();
        q(l4, 28, new i0.b(l4, p0Var, 10));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, 5, new i0.b(l4, z10, i10, 17));
    }

    @Override
    public final void onPlaybackParametersChanged(v0 v0Var) {
        a l4 = l();
        q(l4, 12, new i0.b(l4, v0Var, 6));
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        a l4 = l();
        q(l4, 4, new i0.b(l4, i10, 20, (char) 0));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a l4 = l();
        q(l4, 6, new i0.b(l4, i10, 13, (char) 0));
    }

    @Override
    public final void onPlayerError(u0 u0Var) {
        a l4;
        u2.g0 g0Var;
        if ((u0Var instanceof i2.n) && (g0Var = ((i2.n) u0Var).E) != null) {
            l4 = n(g0Var);
        } else {
            l4 = l();
        }
        q(l4, 10, new y1(l4, u0Var, 14));
    }

    @Override
    public final void onPlayerErrorChanged(u0 u0Var) {
        a l4;
        u2.g0 g0Var;
        if ((u0Var instanceof i2.n) && (g0Var = ((i2.n) u0Var).E) != null) {
            l4 = n(g0Var);
        } else {
            l4 = l();
        }
        q(l4, 10, new i0.b(l4, u0Var, 15));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, -1, new i0.b(l4, z10, i10, 8));
    }

    @Override
    public final void onPlaylistMetadataChanged(n0 n0Var) {
        a l4 = l();
        q(l4, 15, new d(l4, n0Var, 22));
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        a l4 = l();
        q(l4, 8, new i0.b(l4, i10, 21, (char) 0));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a l4 = l();
        q(l4, 9, new d(l4, z10, 25));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a p5 = p();
        q(p5, 23, new d(p5, z10, 20));
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a p5 = p();
        q(p5, 24, new i0.b(p5, i10, i11));
    }

    @Override
    public final void onTimelineChanged(k1 k1Var, int i10) {
        b1 b1Var = this.h;
        b1Var.getClass();
        n nVar = this.d;
        nVar.d = n.p(b1Var, (i0) nVar.f6104b, (u2.g0) nVar.e, (h1) nVar.f6103a);
        nVar.H(b1Var.w0());
        a l4 = l();
        q(l4, 0, new d(l4, i10, 27));
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        a l4 = l();
        q(l4, 19, new d(l4, q1Var, 18));
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        a l4 = l();
        q(l4, 2, new i0.b(l4, s1Var, 16));
    }

    @Override
    public final void onVideoSizeChanged(x1 x1Var) {
        a p5 = p();
        q(p5, 25, new a0(p5, x1Var));
    }

    @Override
    public final void onVolumeChanged(float f7) {
        a p5 = p();
        q(p5, 22, new d(p5, f7));
    }

    public final a p() {
        return n((u2.g0) this.d.f6106f);
    }

    public final void q(a aVar, int i10, m mVar) {
        this.e.put(i10, aVar);
        this.f11465f.e(i10, mVar);
    }

    public final void r(e0 e0Var, Looper looper) {
        boolean z10;
        if (this.h != null && !((i0) this.d.f6104b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        e0Var.getClass();
        this.h = e0Var;
        this.f11466n = this.f11462a.a(looper, null);
        p pVar = this.f11465f;
        cb cbVar = new cb(16, this, e0Var);
        this.f11465f = new p(pVar.d, looper, pVar.f7216a, cbVar, pVar.f7221i);
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        if (i10 == 1) {
            this.f11467r = false;
        }
        b1 b1Var = this.h;
        b1Var.getClass();
        n nVar = this.d;
        nVar.d = n.p(b1Var, (i0) nVar.f6104b, (u2.g0) nVar.e, (h1) nVar.f6103a);
        a l4 = l();
        q(l4, 11, new s(l4, i10, a1Var, a1Var2));
    }

    @Override
    public final void onCues(d2.c cVar) {
        a l4 = l();
        q(l4, 27, new i0.b(l4, cVar, 22));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onEvents(b1 b1Var, y0 y0Var) {
    }
}
