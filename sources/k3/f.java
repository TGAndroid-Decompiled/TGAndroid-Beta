package k3;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import h5.a0;
import h5.d0;
import h5.y;
import j3.a2;
import j3.c1;
import j3.e1;
import j3.m2;
import j3.n;
import j3.n2;
import j3.o2;
import j3.q0;
import j3.q2;
import j3.t1;
import j3.v1;
import j3.w1;
import j3.x1;
import j3.y1;
import j3.z1;
import java.io.IOException;
import java.util.List;
import o3.m;
import o4.r;
import o4.u;
import o4.z;
import s8.i0;
import s8.n0;
import s8.t;
import s8.v;
public final class f implements y1, z, m {
    public final y f9706a;
    public final m2 f9707b;
    public final n2 f9708c;
    public final a9.a d;
    public final SparseArray e;
    public h5.m f9709f;
    public a2 h;
    public a0 f9710n;
    public boolean f9711r;

    public f(y yVar) {
        yVar.getClass();
        this.f9706a = yVar;
        int i10 = d0.f6937a;
        Looper myLooper = Looper.myLooper();
        this.f9709f = new h5.m(myLooper == null ? Looper.getMainLooper() : myLooper, yVar, new c());
        m2 m2Var = new m2();
        this.f9707b = m2Var;
        this.f9708c = new n2();
        ?? obj = new Object();
        obj.f143a = m2Var;
        t tVar = v.f44157b;
        obj.f144b = i0.e;
        obj.f145c = n0.h;
        this.d = obj;
        this.e = new SparseArray();
    }

    @Override
    public final void a(int i10, o4.v vVar, o4.j jVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1001, new q0(o10, jVar, rVar, 24));
    }

    @Override
    public final void b(int i10, o4.v vVar) {
        a o10 = o(i10, vVar);
        q(o10, 1023, new c(o10, 29));
    }

    @Override
    public final void c(int i10, o4.v vVar, int i11) {
        a o10 = o(i10, vVar);
        q(o10, 1022, new c(o10, i11, 22));
    }

    @Override
    public final void d(int i10, o4.v vVar, o4.j jVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1002, new e(o10, jVar, rVar));
    }

    @Override
    public final void e(int i10, o4.v vVar, Exception exc) {
        a o10 = o(i10, vVar);
        q(o10, 1024, new c(o10, exc, 19));
    }

    @Override
    public final void f(int i10, o4.v vVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1004, new c1.b(20, o10, rVar));
    }

    @Override
    public final void g(int i10, o4.v vVar, o4.j jVar, r rVar, IOException iOException, boolean z4) {
        a o10 = o(i10, vVar);
        q(o10, 1003, new gg.f(o10, jVar, rVar, iOException, z4));
    }

    @Override
    public final void h(int i10, o4.v vVar, o4.j jVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1000, new c(o10, jVar, rVar, 13));
    }

    @Override
    public final void i(int i10, o4.v vVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1005, new c(o10, rVar, 18));
    }

    @Override
    public final void j(int i10, o4.v vVar) {
        a o10 = o(i10, vVar);
        q(o10, 1025, new e(o10, 0));
    }

    @Override
    public final void k(int i10, o4.v vVar) {
        a o10 = o(i10, vVar);
        q(o10, 1027, new c(o10, 10));
    }

    public final a l() {
        return n((o4.v) this.d.d);
    }

    public final a m(o2 o2Var, int i10, o4.v vVar) {
        o4.v vVar2;
        boolean z4;
        if (o2Var.p()) {
            vVar2 = null;
        } else {
            vVar2 = vVar;
        }
        this.f9706a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (o2Var.equals(this.h.z()) && i10 == this.h.x()) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j10 = 0;
        if (vVar2 != null && vVar2.a()) {
            if (z4 && this.h.w() == vVar2.f16425b && this.h.o() == vVar2.f16426c) {
                j10 = this.h.C();
            }
        } else if (z4) {
            j10 = this.h.r();
        } else if (!o2Var.p()) {
            j10 = d0.S(o2Var.m(i10, this.f9708c, 0L).f8757x);
        }
        return new a(elapsedRealtime, o2Var, i10, vVar2, j10, this.h.z(), this.h.x(), (o4.v) this.d.d, this.h.C(), this.h.h());
    }

    public final a n(o4.v vVar) {
        o2 o2Var;
        this.h.getClass();
        if (vVar == null) {
            o2Var = null;
        } else {
            o2Var = (o2) ((n0) this.d.f145c).get(vVar);
        }
        if (vVar != null && o2Var != null) {
            return m(o2Var, o2Var.g(vVar.f16424a, this.f9707b).f8704c, vVar);
        }
        int x10 = this.h.x();
        o2 z4 = this.h.z();
        if (x10 >= z4.o()) {
            z4 = o2.f8766a;
        }
        return m(z4, x10, null);
    }

    public final a o(int i10, o4.v vVar) {
        this.h.getClass();
        if (vVar != null) {
            if (((o2) ((n0) this.d.f145c).get(vVar)) != null) {
                return n(vVar);
            }
            return m(o2.f8766a, i10, vVar);
        }
        o2 z4 = this.h.z();
        if (i10 >= z4.o()) {
            z4 = o2.f8766a;
        }
        return m(z4, i10, null);
    }

    @Override
    public final void onAudioAttributesChanged(l3.d dVar) {
        a p10 = p();
        q(p10, 20, new e(p10, dVar, 3));
    }

    @Override
    public final void onAvailableCommandsChanged(w1 w1Var) {
        a l10 = l();
        q(l10, 13, new c(l10, w1Var, 0));
    }

    @Override
    public final void onCues(List list) {
        a l10 = l();
        q(l10, 27, new j3.z(l10, list));
    }

    @Override
    public final void onIsLoadingChanged(boolean z4) {
        a l10 = l();
        q(l10, 3, new c(l10, z4, 23));
    }

    @Override
    public final void onIsPlayingChanged(boolean z4) {
        a l10 = l();
        q(l10, 7, new e(l10, z4));
    }

    @Override
    public final void onMediaItemTransition(c1 c1Var, int i10) {
        a l10 = l();
        q(l10, 1, new q0(l10, c1Var, i10));
    }

    @Override
    public final void onMediaMetadataChanged(e1 e1Var) {
        a l10 = l();
        q(l10, 14, new q0(l10, e1Var, 22));
    }

    @Override
    public final void onMetadata(e4.c cVar) {
        a l10 = l();
        q(l10, 28, new c(l10, cVar, 25));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z4, int i10) {
        a l10 = l();
        q(l10, 5, new q0(l10, z4, i10, 26));
    }

    @Override
    public final void onPlaybackParametersChanged(v1 v1Var) {
        a l10 = l();
        q(l10, 12, new q0(l10, v1Var, 23));
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        a l10 = l();
        q(l10, 4, new c(l10, i10, 3));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a l10 = l();
        q(l10, 6, new c(l10, i10, 15));
    }

    @Override
    public final void onPlayerError(t1 t1Var) {
        a l10;
        u uVar;
        if ((t1Var instanceof n) && (uVar = ((n) t1Var).f8708n) != null) {
            l10 = n(new u(uVar));
        } else {
            l10 = l();
        }
        q(l10, 10, new gg.f(l10, t1Var, 17));
    }

    @Override
    public final void onPlayerErrorChanged(t1 t1Var) {
        a l10;
        u uVar;
        if ((t1Var instanceof n) && (uVar = ((n) t1Var).f8708n) != null) {
            l10 = n(new u(uVar));
        } else {
            l10 = l();
        }
        q(l10, 10, new c(l10, t1Var, 14));
    }

    @Override
    public final void onPlayerStateChanged(boolean z4, int i10) {
        a l10 = l();
        q(l10, -1, new q0(l10, z4, i10, 25));
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        a l10 = l();
        q(l10, 8, new c(l10, i10, 8));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z4) {
        a l10 = l();
        q(l10, 9, new q0(l10, z4));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z4) {
        a p10 = p();
        q(p10, 23, new c(p10, z4, 27));
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a p10 = p();
        q(p10, 24, new q0(p10, i10, i11));
    }

    @Override
    public final void onTimelineChanged(o2 o2Var, int i10) {
        a2 a2Var = this.h;
        a2Var.getClass();
        a9.a aVar = this.d;
        aVar.d = a9.a.o(a2Var, (v) aVar.f144b, (o4.v) aVar.e, (m2) aVar.f143a);
        aVar.E(a2Var.z());
        a l10 = l();
        q(l10, 0, new c(l10, i10, 21));
    }

    @Override
    public final void onTracksChanged(q2 q2Var) {
        a l10 = l();
        q(l10, 2, new c(l10, q2Var, 11));
    }

    @Override
    public final void onVideoSizeChanged(i5.y yVar) {
        a p10 = p();
        q(p10, 25, new j3.a0(p10, yVar));
    }

    @Override
    public final void onVolumeChanged(float f10) {
        a p10 = p();
        q(p10, 22, new c(p10, f10));
    }

    public final a p() {
        return n((o4.v) this.d.f146f);
    }

    public final void q(a aVar, int i10, h5.j jVar) {
        this.e.put(i10, aVar);
        this.f9709f.e(i10, jVar);
    }

    public final void r(a2 a2Var, Looper looper) {
        boolean z4;
        if (this.h != null && !((v) this.d.f144b).isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.i(z4);
        a2Var.getClass();
        this.h = a2Var;
        this.f9710n = this.f9706a.a(looper, null);
        h5.m mVar = this.f9709f;
        c1.b bVar = new c1.b(19, this, a2Var);
        this.f9709f = new h5.m(mVar.d, looper, mVar.f6960a, bVar, mVar.f6965i);
    }

    @Override
    public final void onPositionDiscontinuity(z1 z1Var, z1 z1Var2, int i10) {
        if (i10 == 1) {
            this.f9711r = false;
        }
        a2 a2Var = this.h;
        a2Var.getClass();
        a9.a aVar = this.d;
        aVar.d = a9.a.o(a2Var, (v) aVar.f144b, (o4.v) aVar.e, (m2) aVar.f143a);
        a l10 = l();
        q(l10, 11, new gg.m2(l10, i10, z1Var, z1Var2));
    }

    @Override
    public final void onCues(v4.c cVar) {
        a l10 = l();
        q(l10, 27, new q0(l10, cVar, 29));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onLoadingChanged(boolean z4) {
    }

    @Override
    public final void onEvents(a2 a2Var, x1 x1Var) {
    }
}
