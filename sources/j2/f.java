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
import i2.o;
import java.io.IOException;
import java.util.List;
import u2.b0;
import u2.f0;
import u2.k0;
import u2.t;
public final class f implements z0, k0, n2.k {
    public final x f13176a;
    public final h1 f13177b;
    public final j1 f13178c;
    public final n d;
    public final SparseArray f13179e;
    public p f13180f;
    public b1 h;
    public z f13181n;
    public boolean f13182r;

    public f(x xVar) {
        xVar.getClass();
        this.f13176a = xVar;
        String str = d0.f8737a;
        Looper myLooper = Looper.myLooper();
        this.f13180f = new p(myLooper == null ? Looper.getMainLooper() : myLooper, xVar, new i0.b(25));
        h1 h1Var = new h1();
        this.f13177b = h1Var;
        this.f13178c = new j1();
        ?? obj = new Object();
        obj.f6374a = h1Var;
        g0 g0Var = i0.f8957b;
        obj.f6375b = a1.f8920e;
        obj.f6376c = f1.h;
        this.d = obj;
        this.f13179e = new SparseArray();
    }

    @Override
    public final void a(int i10, f0 f0Var, int i11) {
        a o9 = o(i10, f0Var);
        q(o9, 1022, new c(o9, i11, 12, (byte) 0));
    }

    @Override
    public final void b(int i10, f0 f0Var, Exception exc) {
        a o9 = o(i10, f0Var);
        q(o9, 1024, new c(o9, exc, 13));
    }

    @Override
    public final void c(int i10, f0 f0Var, b0 b0Var) {
        a o9 = o(i10, f0Var);
        q(o9, 1005, new c(o9, b0Var, 21));
    }

    @Override
    public final void d(int i10, f0 f0Var, b0 b0Var) {
        a o9 = o(i10, f0Var);
        q(o9, 1004, new ah.i0(18, o9, b0Var));
    }

    @Override
    public final void e(int i10, f0 f0Var, t tVar, b0 b0Var) {
        a o9 = o(i10, f0Var);
        q(o9, 1001, new c(o9, (Object) tVar, (Object) b0Var, 14));
    }

    @Override
    public final void f(int i10, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        a o9 = o(i10, f0Var);
        q(o9, 1003, new fi.f(o9, tVar, b0Var, iOException, z10));
    }

    @Override
    public final void g(int i10, f0 f0Var) {
        a o9 = o(i10, f0Var);
        q(o9, 1027, new c(o9, 22));
    }

    @Override
    public final void h(int i10, f0 f0Var, t tVar, b0 b0Var, int i11) {
        a o9 = o(i10, f0Var);
        q(o9, 1000, new c(o9, tVar, b0Var, i11));
    }

    @Override
    public final void i(int i10, f0 f0Var) {
        a o9 = o(i10, f0Var);
        q(o9, 1025, new c(o9, 27));
    }

    @Override
    public final void j(int i10, f0 f0Var, t tVar, b0 b0Var) {
        a o9 = o(i10, f0Var);
        q(o9, 1002, new c(o9, (Object) tVar, (Object) b0Var, 10));
    }

    @Override
    public final void k(int i10, f0 f0Var) {
        a o9 = o(i10, f0Var);
        q(o9, 1023, new c(o9, 29));
    }

    public final a l() {
        return n((f0) this.d.d);
    }

    public final a m(k1 k1Var, int i10, f0 f0Var) {
        f0 f0Var2;
        boolean z10;
        if (k1Var.p()) {
            f0Var2 = null;
        } else {
            f0Var2 = f0Var;
        }
        this.f13176a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k1Var.equals(this.h.w0()) && i10 == this.h.l0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j3 = 0;
        if (f0Var2 != null && f0Var2.b()) {
            if (z10 && this.h.k0() == f0Var2.f46668b && this.h.O() == f0Var2.f46669c) {
                j3 = this.h.J0();
            }
        } else if (z10) {
            j3 = this.h.a0();
        } else if (!k1Var.p()) {
            j3 = d0.e0(k1Var.m(i10, this.f13178c, 0L).f2115l);
        }
        return new a(elapsedRealtime, k1Var, i10, f0Var2, j3, this.h.w0(), this.h.l0(), (f0) this.d.d, this.h.J0(), this.h.r());
    }

    public final a n(f0 f0Var) {
        k1 k1Var;
        this.h.getClass();
        if (f0Var == null) {
            k1Var = null;
        } else {
            k1Var = (k1) ((e9.k0) this.d.f6376c).get(f0Var);
        }
        if (f0Var != null && k1Var != null) {
            return m(k1Var, k1Var.g(f0Var.f46667a, this.f13177b).f2056c, f0Var);
        }
        int l02 = this.h.l0();
        k1 w02 = this.h.w0();
        if (l02 >= w02.o()) {
            w02 = k1.f2131a;
        }
        return m(w02, l02, null);
    }

    public final a o(int i10, f0 f0Var) {
        this.h.getClass();
        if (f0Var != null) {
            if (((k1) ((e9.k0) this.d.f6376c).get(f0Var)) != null) {
                return n(f0Var);
            }
            return m(k1.f2131a, i10, f0Var);
        }
        k1 w02 = this.h.w0();
        if (i10 >= w02.o()) {
            w02 = k1.f2131a;
        }
        return m(w02, i10, null);
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        a p5 = p();
        q(p5, 20, new i0.b(p5, eVar, 15));
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        a p5 = p();
        q(p5, 21, new c(p5, i10, 18, (byte) 0));
    }

    @Override
    public final void onAvailableCommandsChanged(x0 x0Var) {
        a l4 = l();
        q(l4, 13, new e(2, l4, x0Var));
    }

    @Override
    public final void onCues(List list) {
        a l4 = l();
        q(l4, 27, new i2.z(l4, list));
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        a l4 = l();
        q(l4, 3, new c(l4, z10, 16));
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        a l4 = l();
        q(l4, 7, new i0.b(l4, z10));
    }

    @Override
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
        a l4 = l();
        q(l4, 1, new e(l4, k0Var, i10));
    }

    @Override
    public final void onMediaMetadataChanged(n0 n0Var) {
        a l4 = l();
        q(l4, 14, new c(l4, n0Var, 6));
    }

    @Override
    public final void onMetadata(p0 p0Var) {
        a l4 = l();
        q(l4, 28, new i0.b(l4, p0Var, 16));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, 5, new i0.b(l4, z10, i10, 23));
    }

    @Override
    public final void onPlaybackParametersChanged(v0 v0Var) {
        a l4 = l();
        q(l4, 12, new i0.b(l4, v0Var, 12));
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        a l4 = l();
        q(l4, 4, new i0.b(l4, i10, 26));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a l4 = l();
        q(l4, 6, new i0.b(l4, i10, 19));
    }

    @Override
    public final void onPlayerError(u0 u0Var) {
        a l4;
        f0 f0Var;
        if ((u0Var instanceof o) && (f0Var = ((o) u0Var).E) != null) {
            l4 = n(f0Var);
        } else {
            l4 = l();
        }
        q(l4, 10, new fi.f(l4, u0Var, 15));
    }

    @Override
    public final void onPlayerErrorChanged(u0 u0Var) {
        a l4;
        f0 f0Var;
        if ((u0Var instanceof o) && (f0Var = ((o) u0Var).E) != null) {
            l4 = n(f0Var);
        } else {
            l4 = l();
        }
        q(l4, 10, new i0.b(l4, u0Var, 21));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, -1, new i0.b(l4, z10, i10, 14));
    }

    @Override
    public final void onPlaylistMetadataChanged(n0 n0Var) {
        a l4 = l();
        q(l4, 15, new c(l4, n0Var, 28));
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        a l4 = l();
        q(l4, 8, new i0.b(l4, i10, 27));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a l4 = l();
        q(l4, 9, new e(l4, z10));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a p5 = p();
        q(p5, 23, new c(p5, z10, 26));
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a p5 = p();
        q(p5, 24, new c(p5, i10, i11));
    }

    @Override
    public final void onTimelineChanged(k1 k1Var, int i10) {
        b1 b1Var = this.h;
        b1Var.getClass();
        n nVar = this.d;
        nVar.d = n.p(b1Var, (i0) nVar.f6375b, (f0) nVar.f6377e, (h1) nVar.f6374a);
        nVar.H(b1Var.w0());
        a l4 = l();
        q(l4, 0, new e(l4, i10));
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        a l4 = l();
        q(l4, 19, new c(l4, q1Var, 24));
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        a l4 = l();
        q(l4, 2, new i0.b(l4, s1Var, 22));
    }

    @Override
    public final void onVideoSizeChanged(x1 x1Var) {
        a p5 = p();
        q(p5, 25, new i2.b0(p5, x1Var));
    }

    @Override
    public final void onVolumeChanged(float f7) {
        a p5 = p();
        q(p5, 22, new e(p5, f7));
    }

    public final a p() {
        return n((f0) this.d.f6378f);
    }

    public final void q(a aVar, int i10, m mVar) {
        this.f13179e.put(i10, aVar);
        this.f13180f.e(i10, mVar);
    }

    public final void r(i2.f0 f0Var, Looper looper) {
        boolean z10;
        if (this.h != null && !((i0) this.d.f6375b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        f0Var.getClass();
        this.h = f0Var;
        this.f13181n = this.f13176a.a(looper, null);
        p pVar = this.f13180f;
        ah.i0 i0Var = new ah.i0(17, this, f0Var);
        this.f13180f = new p(pVar.d, looper, pVar.f8767a, i0Var, pVar.f8773i);
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        if (i10 == 1) {
            this.f13182r = false;
        }
        b1 b1Var = this.h;
        b1Var.getClass();
        n nVar = this.d;
        nVar.d = n.p(b1Var, (i0) nVar.f6375b, (f0) nVar.f6377e, (h1) nVar.f6374a);
        a l4 = l();
        q(l4, 11, new i2.t(l4, i10, a1Var, a1Var2));
    }

    @Override
    public final void onCues(d2.c cVar) {
        a l4 = l();
        q(l4, 27, new i0.b(l4, cVar, 28));
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
