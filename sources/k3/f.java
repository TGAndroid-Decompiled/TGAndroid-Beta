package k3;

import a9.s;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import bg.c2;
import eg.n;
import f5.a0;
import f5.d0;
import f5.m;
import f5.y;
import j3.a2;
import j3.b2;
import j3.e0;
import j3.f1;
import j3.h1;
import j3.p2;
import j3.q2;
import j3.r2;
import j3.t2;
import j3.v1;
import j3.x1;
import j3.y1;
import j3.z1;
import java.io.IOException;
import java.util.List;
import jh.d3;
import l4.c0;
import l4.h0;
import l4.p;
import q8.l0;
import q8.q0;
import q8.x;
import q8.z;
public final class f implements a2, h0, n3.g {
    public final y f13413a;
    public final p2 f13414b;
    public final q2 f13415c;
    public final c2 d;
    public final SparseArray f13416e;
    public m f13417f;
    public j3.c2 h;
    public a0 f13418n;
    public boolean f13419r;

    public f(y yVar) {
        yVar.getClass();
        this.f13413a = yVar;
        int i10 = d0.f6579a;
        Looper myLooper = Looper.myLooper();
        this.f13417f = new m(myLooper == null ? Looper.getMainLooper() : myLooper, yVar, new d3(19));
        p2 p2Var = new p2();
        this.f13414b = p2Var;
        this.f13415c = new q2();
        ?? obj = new Object();
        obj.f2118a = p2Var;
        x xVar = z.f46511b;
        obj.f2119b = l0.f46462e;
        obj.f2120c = q0.h;
        this.d = obj;
        this.f13416e = new SparseArray();
    }

    @Override
    public final void a(int i10, c0 c0Var, p pVar, l4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1002, new d(j10, pVar, xVar));
    }

    @Override
    public final void b(int i10, c0 c0Var, l4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1005, new d(j10, xVar, 1));
    }

    @Override
    public final void c(int i10, c0 c0Var, l4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1004, new s(28, j10, xVar));
    }

    public final a d() {
        return i((c0) this.d.d);
    }

    public final a e(r2 r2Var, int i10, c0 c0Var) {
        c0 c0Var2;
        boolean z10;
        if (r2Var.p()) {
            c0Var2 = null;
        } else {
            c0Var2 = c0Var;
        }
        this.f13413a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (r2Var.equals(this.h.A()) && i10 == this.h.x()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        if (c0Var2 != null && c0Var2.a()) {
            if (z10 && this.h.w() == c0Var2.f14263b && this.h.m() == c0Var2.f14264c) {
                j10 = this.h.D();
            }
        } else if (z10) {
            j10 = this.h.q();
        } else if (!r2Var.p()) {
            j10 = d0.S(r2Var.m(i10, this.f13415c, 0L).f10704x);
        }
        return new a(elapsedRealtime, r2Var, i10, c0Var2, j10, this.h.A(), this.h.x(), (c0) this.d.d, this.h.D(), this.h.d());
    }

    @Override
    public final void f(int i10, c0 c0Var, p pVar, l4.x xVar, IOException iOException, boolean z10) {
        a j10 = j(i10, c0Var);
        l(j10, 1003, new n(j10, pVar, xVar, iOException, z10));
    }

    @Override
    public final void g(int i10, c0 c0Var, p pVar, l4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1000, new d3(j10, pVar, xVar, 25));
    }

    @Override
    public final void h(int i10, c0 c0Var, p pVar, l4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1001, new d3(j10, pVar, xVar, 8));
    }

    public final a i(c0 c0Var) {
        r2 r2Var;
        this.h.getClass();
        if (c0Var == null) {
            r2Var = null;
        } else {
            r2Var = (r2) ((q0) this.d.f2120c).get(c0Var);
        }
        if (c0Var != null && r2Var != null) {
            return e(r2Var, r2Var.g(c0Var.f14262a, this.f13414b).f10676c, c0Var);
        }
        int x4 = this.h.x();
        r2 A = this.h.A();
        if (x4 >= A.o()) {
            A = r2.f10729a;
        }
        return e(A, x4, null);
    }

    public final a j(int i10, c0 c0Var) {
        this.h.getClass();
        if (c0Var != null) {
            if (((r2) ((q0) this.d.f2120c).get(c0Var)) != null) {
                return i(c0Var);
            }
            return e(r2.f10729a, i10, c0Var);
        }
        r2 A = this.h.A();
        if (i10 >= A.o()) {
            A = r2.f10729a;
        }
        return e(A, i10, null);
    }

    public final a k() {
        return i((c0) this.d.f2122f);
    }

    public final void l(a aVar, int i10, f5.j jVar) {
        this.f13416e.put(i10, aVar);
        this.f13417f.e(i10, jVar);
    }

    public final void m(j3.c2 c2Var, Looper looper) {
        boolean z10;
        if (this.h != null && !((z) this.d.f2119b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        f5.a.i(z10);
        c2Var.getClass();
        this.h = c2Var;
        this.f13418n = this.f13413a.a(looper, null);
        m mVar = this.f13417f;
        s sVar = new s(27, this, c2Var);
        this.f13417f = new m(mVar.d, looper, mVar.f6601a, sVar);
    }

    @Override
    public final void onAudioAttributesChanged(l3.e eVar) {
        a k9 = k();
        l(k9, 20, new d(k9, eVar, 14));
    }

    @Override
    public final void onAvailableCommandsChanged(y1 y1Var) {
        a d = d();
        l(d, 13, new d3(d, y1Var, 14));
    }

    @Override
    public final void onCues(List list) {
        a d = d();
        l(d, 27, new j3.c0(d, list));
    }

    @Override
    public final void onDeviceInfoChanged(j3.m mVar) {
        a d = d();
        l(d, 29, new d(d, mVar, 6));
    }

    @Override
    public final void onDeviceVolumeChanged(int i10, boolean z10) {
        a d = d();
        l(d, 30, new d(d, i10, z10));
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        a d = d();
        l(d, 3, new d(d, z10, 5));
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        a d = d();
        l(d, 7, new d(d, z10, 13));
    }

    @Override
    public final void onMediaItemTransition(f1 f1Var, int i10) {
        a d = d();
        l(d, 1, new d3(d, f1Var, i10));
    }

    @Override
    public final void onMediaMetadataChanged(h1 h1Var) {
        a d = d();
        l(d, 14, new d3(d, h1Var, 6));
    }

    @Override
    public final void onMetadata(b4.c cVar) {
        a d = d();
        l(d, 28, new d(d, cVar, 8));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a d = d();
        l(d, 5, new d3(d, z10, i10, 10));
    }

    @Override
    public final void onPlaybackParametersChanged(x1 x1Var) {
        a d = d();
        l(d, 12, new d3(d, x1Var, 7));
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        a d = d();
        l(d, 4, new d3(d, i10, 17, (byte) 0));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a d = d();
        l(d, 6, new d3(d, i10, 28, (byte) 0));
    }

    @Override
    public final void onPlayerError(v1 v1Var) {
        a d;
        l4.a0 a0Var;
        if ((v1Var instanceof j3.n) && (a0Var = ((j3.n) v1Var).f10638n) != null) {
            d = i(new l4.a0(a0Var));
        } else {
            d = d();
        }
        l(d, 10, new n(d, v1Var, 28));
    }

    @Override
    public final void onPlayerErrorChanged(v1 v1Var) {
        a d;
        l4.a0 a0Var;
        if ((v1Var instanceof j3.n) && (a0Var = ((j3.n) v1Var).f10638n) != null) {
            d = i(new l4.a0(a0Var));
        } else {
            d = d();
        }
        l(d, 10, new d3(d, v1Var, 27));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a d = d();
        l(d, -1, new d3(d, z10, i10, 9));
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        a d = d();
        l(d, 8, new d3(d, i10, 22, (byte) 0));
    }

    @Override
    public final void onSeekProcessed() {
        a d = d();
        l(d, -1, new c(d, 1));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a d = d();
        l(d, 9, new d3(d, z10));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a k9 = k();
        l(k9, 23, new d(k9, z10, 12));
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a k9 = k();
        l(k9, 24, new d3(k9, i10, i11));
    }

    @Override
    public final void onTimelineChanged(r2 r2Var, int i10) {
        j3.c2 c2Var = this.h;
        c2Var.getClass();
        c2 c2Var2 = this.d;
        c2Var2.d = c2.o(c2Var, (z) c2Var2.f2119b, (c0) c2Var2.f2121e, (p2) c2Var2.f2118a);
        c2Var2.E(c2Var.A());
        a d = d();
        l(d, 0, new d(d, i10));
    }

    @Override
    public final void onTracksChanged(t2 t2Var) {
        a d = d();
        l(d, 2, new d3(d, t2Var, 24));
    }

    @Override
    public final void onVideoSizeChanged(g5.y yVar) {
        a k9 = k();
        l(k9, 25, new e0(k9, yVar));
    }

    @Override
    public final void onVolumeChanged(float f9) {
        a k9 = k();
        l(k9, 22, new d(k9, f9));
    }

    @Override
    public final void onPositionDiscontinuity(b2 b2Var, b2 b2Var2, int i10) {
        if (i10 == 1) {
            this.f13419r = false;
        }
        j3.c2 c2Var = this.h;
        c2Var.getClass();
        c2 c2Var2 = this.d;
        c2Var2.d = c2.o(c2Var, (z) c2Var2.f2119b, (c0) c2Var2.f2121e, (p2) c2Var2.f2118a);
        a d = d();
        l(d, 11, new j3.x(d, i10, b2Var, b2Var2));
    }

    @Override
    public final void onCues(t4.c cVar) {
        a d = d();
        l(d, 27, new d3(d, cVar, 13));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onEvents(j3.c2 c2Var, z1 z1Var) {
    }
}
