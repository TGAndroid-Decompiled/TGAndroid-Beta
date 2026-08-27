package i3;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.firebase.messaging.m;
import d5.b0;
import d5.d0;
import d5.g0;
import d5.n;
import h3.a2;
import h3.b2;
import h3.c2;
import h3.e0;
import h3.f1;
import h3.h1;
import h3.p2;
import h3.q2;
import h3.r2;
import h3.s2;
import h3.u2;
import h3.v1;
import h3.x1;
import h3.y;
import h3.y1;
import h3.z1;
import j4.a0;
import j4.c0;
import j4.h0;
import j4.p;
import java.io.IOException;
import java.util.List;
import p8.l0;
import p8.q0;
import p8.x;
import p8.z;

public final class f implements a2, h0, l3.h {

    public final b0 f10530a;

    public final p2 f10531b;

    public final r2 f10532c;
    public final m d;

    public final SparseArray f10533e;

    public n f10534f;
    public c2 h;

    public d0 f10535n;

    public boolean f10536r;

    public f(b0 b0Var) {
        b0Var.getClass();
        this.f10530a = b0Var;
        int i10 = g0.f4795a;
        Looper looperMyLooper = Looper.myLooper();
        this.f10534f = new n(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, b0Var, new q2(26));
        p2 p2Var = new p2();
        this.f10531b = p2Var;
        this.f10532c = new r2();
        m mVar = new m();
        mVar.f4602a = p2Var;
        x xVar = z.f45604b;
        mVar.f4603b = l0.f45555e;
        mVar.f4604c = q0.h;
        this.d = mVar;
        this.f10533e = new SparseArray();
    }

    public final a a() {
        return i((c0) this.d.d);
    }

    @Override
    public final void b(int i10, c0 c0Var, j4.x xVar) {
        a aVarJ = j(i10, c0Var);
        l(aVarJ, 1004, new ag.h0(26, aVarJ, xVar));
    }

    @Override
    public final void c(int i10, c0 c0Var, j4.x xVar) {
        a aVarJ = j(i10, c0Var);
        l(aVarJ, 1005, new d(aVarJ, xVar, 8));
    }

    @Override
    public final void d(int i10, c0 c0Var, p pVar, j4.x xVar, IOException iOException, boolean z10) {
        a aVarJ = j(i10, c0Var);
        l(aVarJ, 1003, new h3.x(aVarJ, pVar, xVar, iOException, z10));
    }

    public final a e(s2 s2Var, int i10, c0 c0Var) {
        c0 c0Var2 = s2Var.p() ? null : c0Var;
        this.f10530a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = s2Var.equals(this.h.A()) && i10 == this.h.x();
        long jS = 0;
        if (c0Var2 == null || !c0Var2.a()) {
            if (z10) {
                jS = this.h.q();
            } else if (!s2Var.p()) {
                jS = g0.S(s2Var.m(i10, this.f10532c, 0L).f8121x);
            }
        } else if (z10 && this.h.w() == c0Var2.f12504b && this.h.m() == c0Var2.f12505c) {
            jS = this.h.D();
        }
        return new a(jElapsedRealtime, s2Var, i10, c0Var2, jS, this.h.A(), this.h.x(), (c0) this.d.d, this.h.D(), this.h.d());
    }

    @Override
    public final void f(int i10, c0 c0Var, p pVar, j4.x xVar) {
        a aVarJ = j(i10, c0Var);
        l(aVarJ, 1002, new d(aVarJ, pVar, xVar, 18));
    }

    @Override
    public final void g(int i10, c0 c0Var, p pVar, j4.x xVar) {
        a aVarJ = j(i10, c0Var);
        l(aVarJ, 1000, new d(aVarJ, pVar, xVar, 2));
    }

    @Override
    public final void h(int i10, c0 c0Var, p pVar, j4.x xVar) {
        a aVarJ = j(i10, c0Var);
        l(aVarJ, 1001, new q2(aVarJ, pVar, xVar, 15));
    }

    public final a i(c0 c0Var) {
        this.h.getClass();
        s2 s2Var = c0Var == null ? null : (s2) ((q0) this.d.f4604c).get(c0Var);
        if (c0Var != null && s2Var != null) {
            return e(s2Var, s2Var.g(c0Var.f12503a, this.f10531b).f8069c, c0Var);
        }
        int iX = this.h.x();
        s2 s2VarA = this.h.A();
        if (iX >= s2VarA.o()) {
            s2VarA = s2.f8156a;
        }
        return e(s2VarA, iX, null);
    }

    public final a j(int i10, c0 c0Var) {
        this.h.getClass();
        if (c0Var != null) {
            return ((s2) ((q0) this.d.f4604c).get(c0Var)) != null ? i(c0Var) : e(s2.f8156a, i10, c0Var);
        }
        s2 s2VarA = this.h.A();
        if (i10 >= s2VarA.o()) {
            s2VarA = s2.f8156a;
        }
        return e(s2VarA, i10, null);
    }

    public final a k() {
        return i((c0) this.d.f4606f);
    }

    public final void l(a aVar, int i10, d5.k kVar) {
        this.f10533e.put(i10, aVar);
        this.f10534f.e(i10, kVar);
    }

    public final void m(c2 c2Var, Looper looper) {
        d5.a.i(this.h == null || ((z) this.d.f4603b).isEmpty());
        c2Var.getClass();
        this.h = c2Var;
        this.f10535n = this.f10530a.a(looper, null);
        n nVar = this.f10534f;
        this.f10534f = new n(nVar.d, looper, nVar.f4814a, new ag.h0(25, this, c2Var));
    }

    @Override
    public final void onAudioAttributesChanged(j3.e eVar) {
        a aVarK = k();
        l(aVarK, 20, new d(aVarK, eVar, 21));
    }

    @Override
    public final void onAvailableCommandsChanged(y1 y1Var) {
        a aVarA = a();
        l(aVarA, 13, new q2(aVarA, y1Var, 21));
    }

    @Override
    public final void onCues(List list) {
        a aVarA = a();
        l(aVarA, 27, new h3.d0(aVarA, list));
    }

    @Override
    public final void onDeviceInfoChanged(h3.m mVar) {
        a aVarA = a();
        l(aVarA, 29, new d(aVarA, mVar, 13));
    }

    @Override
    public final void onDeviceVolumeChanged(int i10, boolean z10) {
        a aVarA = a();
        l(aVarA, 30, new d(aVarA, i10, z10));
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        a aVarA = a();
        l(aVarA, 3, new d(aVarA, z10, 12));
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        a aVarA = a();
        l(aVarA, 7, new d(aVarA, z10, 20));
    }

    @Override
    public final void onMediaItemTransition(f1 f1Var, int i10) {
        a aVarA = a();
        l(aVarA, 1, new q2(aVarA, f1Var, i10));
    }

    @Override
    public final void onMediaMetadataChanged(h1 h1Var) {
        a aVarA = a();
        l(aVarA, 14, new q2(aVarA, h1Var, 13));
    }

    @Override
    public final void onMetadata(z3.c cVar) {
        a aVarA = a();
        l(aVarA, 28, new d(aVarA, cVar, 15));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a aVarA = a();
        l(aVarA, 5, new q2(aVarA, z10, i10, 17));
    }

    @Override
    public final void onPlaybackParametersChanged(x1 x1Var) {
        a aVarA = a();
        l(aVarA, 12, new q2(aVarA, x1Var, 14));
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        a aVarA = a();
        l(aVarA, 4, new q2(aVarA, i10, 24, (byte) 0));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a aVarA = a();
        l(aVarA, 6, new d(aVarA, i10, 5));
    }

    @Override
    public final void onPlayerError(v1 v1Var) {
        a0 a0Var;
        a aVarA = (!(v1Var instanceof h3.n) || (a0Var = ((h3.n) v1Var).f8031n) == null) ? a() : i(new c0(a0Var));
        l(aVarA, 10, new h3.x(aVarA, v1Var, 15));
    }

    @Override
    public final void onPlayerErrorChanged(v1 v1Var) {
        a0 a0Var;
        a aVarA = (!(v1Var instanceof h3.n) || (a0Var = ((h3.n) v1Var).f8031n) == null) ? a() : i(new c0(a0Var));
        l(aVarA, 10, new d(aVarA, v1Var, 4));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a aVarA = a();
        l(aVarA, -1, new q2(aVarA, z10, i10, 16));
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        a aVarA = a();
        l(aVarA, 8, new q2(aVarA, i10, 29, (byte) 0));
    }

    @Override
    public final void onSeekProcessed() {
        a aVarA = a();
        l(aVarA, -1, new c(aVarA, 1));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a aVarA = a();
        l(aVarA, 9, new q2(aVarA, z10));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a aVarK = k();
        l(aVarK, 23, new d(aVarK, z10, 19));
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a aVarK = k();
        l(aVarK, 24, new q2(aVarK, i10, i11));
    }

    @Override
    public final void onTimelineChanged(s2 s2Var, int i10) {
        c2 c2Var = this.h;
        c2Var.getClass();
        m mVar = this.d;
        mVar.d = m.o(c2Var, (z) mVar.f4603b, (c0) mVar.f4605e, (p2) mVar.f4602a);
        mVar.D(c2Var.A());
        a aVarA = a();
        l(aVarA, 0, new d(aVarA, i10, 10));
    }

    @Override
    public final void onTracksChanged(u2 u2Var) {
        a aVarA = a();
        l(aVarA, 2, new d(aVarA, u2Var, 1));
    }

    @Override
    public final void onVideoSizeChanged(e5.x xVar) {
        a aVarK = k();
        l(aVarK, 25, new e0(aVarK, xVar));
    }

    @Override
    public final void onVolumeChanged(float f10) {
        a aVarK = k();
        l(aVarK, 22, new d(aVarK, f10));
    }

    @Override
    public final void onPositionDiscontinuity(b2 b2Var, b2 b2Var2, int i10) {
        if (i10 == 1) {
            this.f10536r = false;
        }
        c2 c2Var = this.h;
        c2Var.getClass();
        m mVar = this.d;
        mVar.d = m.o(c2Var, (z) mVar.f4603b, (c0) mVar.f4605e, (p2) mVar.f4602a);
        a aVarA = a();
        l(aVarA, 11, new y(aVarA, i10, b2Var, b2Var2));
    }

    @Override
    public final void onCues(r4.d dVar) {
        a aVarA = a();
        l(aVarA, 27, new q2(aVarA, dVar, 20));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onEvents(c2 c2Var, z1 z1Var) {
    }
}
