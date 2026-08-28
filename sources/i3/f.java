package i3;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.firebase.messaging.m;
import d5.a0;
import d5.c0;
import d5.f0;
import d5.n;
import gh.i3;
import h3.a2;
import h3.b2;
import h3.c2;
import h3.f1;
import h3.h1;
import h3.p2;
import h3.q2;
import h3.r2;
import h3.t2;
import h3.v1;
import h3.x1;
import h3.y1;
import h3.z1;
import j4.b0;
import j4.d0;
import j4.i0;
import j4.q;
import j4.y;
import java.io.IOException;
import java.util.List;
import o8.l0;
import o8.q0;
import o8.x;
import o8.z;
public final class f implements a2, i0, l3.g {
    public final a0 f10889a;
    public final p2 f10890b;
    public final q2 f10891c;
    public final m d;
    public final SparseArray f10892e;
    public n f10893f;
    public c2 h;
    public c0 f10894n;
    public boolean f10895r;

    public f(a0 a0Var) {
        a0Var.getClass();
        this.f10889a = a0Var;
        int i9 = f0.f4349a;
        Looper myLooper = Looper.myLooper();
        this.f10893f = new n(myLooper == null ? Looper.getMainLooper() : myLooper, a0Var, new d());
        p2 p2Var = new p2();
        this.f10890b = p2Var;
        this.f10891c = new q2();
        ?? obj = new Object();
        obj.f4160a = p2Var;
        x xVar = z.f19105b;
        obj.f4161b = l0.f19056e;
        obj.f4162c = q0.h;
        this.d = obj;
        this.f10892e = new SparseArray();
    }

    public final a a() {
        return i((d0) this.d.d);
    }

    @Override
    public final void b(int i9, d0 d0Var, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1004, new b5.d(26, j10, yVar));
    }

    @Override
    public final void c(int i9, d0 d0Var, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1005, new d(j10, yVar, 15));
    }

    @Override
    public final void d(int i9, d0 d0Var, q qVar, y yVar, IOException iOException, boolean z10) {
        a j10 = j(i9, d0Var);
        l(j10, 1003, new i3(j10, qVar, yVar, iOException, z10));
    }

    @Override
    public final void e(int i9, d0 d0Var, q qVar, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1002, new d(j10, qVar, yVar, 25));
    }

    @Override
    public final void f(int i9, d0 d0Var, q qVar, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1000, new d(j10, qVar, yVar, 9));
    }

    @Override
    public final void g(int i9, d0 d0Var, q qVar, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1001, new h9.a(j10, qVar, yVar, 22));
    }

    public final a h(r2 r2Var, int i9, d0 d0Var) {
        d0 d0Var2;
        boolean z10;
        if (r2Var.p()) {
            d0Var2 = null;
        } else {
            d0Var2 = d0Var;
        }
        this.f10889a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (r2Var.equals(this.h.A()) && i9 == this.h.x()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        if (d0Var2 != null && d0Var2.a()) {
            if (z10 && this.h.w() == d0Var2.f13427b && this.h.m() == d0Var2.f13428c) {
                j10 = this.h.D();
            }
        } else if (z10) {
            j10 = this.h.q();
        } else if (!r2Var.p()) {
            j10 = f0.S(r2Var.m(i9, this.f10891c, 0L).f9667x);
        }
        return new a(elapsedRealtime, r2Var, i9, d0Var2, j10, this.h.A(), this.h.x(), (d0) this.d.d, this.h.D(), this.h.d());
    }

    public final a i(d0 d0Var) {
        r2 r2Var;
        this.h.getClass();
        if (d0Var == null) {
            r2Var = null;
        } else {
            r2Var = (r2) ((q0) this.d.f4162c).get(d0Var);
        }
        if (d0Var != null && r2Var != null) {
            return h(r2Var, r2Var.g(d0Var.f13426a, this.f10890b).f9639c, d0Var);
        }
        int x10 = this.h.x();
        r2 A = this.h.A();
        if (x10 >= A.o()) {
            A = r2.f9692a;
        }
        return h(A, x10, null);
    }

    public final a j(int i9, d0 d0Var) {
        this.h.getClass();
        if (d0Var != null) {
            if (((r2) ((q0) this.d.f4162c).get(d0Var)) != null) {
                return i(d0Var);
            }
            return h(r2.f9692a, i9, d0Var);
        }
        r2 A = this.h.A();
        if (i9 >= A.o()) {
            A = r2.f9692a;
        }
        return h(A, i9, null);
    }

    public final a k() {
        return i((d0) this.d.f4164f);
    }

    public final void l(a aVar, int i9, d5.k kVar) {
        this.f10892e.put(i9, aVar);
        this.f10893f.e(i9, kVar);
    }

    public final void m(c2 c2Var, Looper looper) {
        boolean z10;
        if (this.h != null && !((z) this.d.f4161b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        d5.a.i(z10);
        c2Var.getClass();
        this.h = c2Var;
        this.f10894n = this.f10889a.a(looper, null);
        n nVar = this.f10893f;
        b5.d dVar = new b5.d(25, this, c2Var);
        this.f10893f = new n(nVar.d, looper, nVar.f4369a, dVar);
    }

    @Override
    public final void onAudioAttributesChanged(j3.e eVar) {
        a k10 = k();
        l(k10, 20, new d(k10, eVar, 28));
    }

    @Override
    public final void onAvailableCommandsChanged(y1 y1Var) {
        a a2 = a();
        l(a2, 13, new h9.a(a2, y1Var, 28));
    }

    @Override
    public final void onCues(List list) {
        a a2 = a();
        l(a2, 27, new h3.c0(a2, list));
    }

    @Override
    public final void onDeviceInfoChanged(h3.m mVar) {
        a a2 = a();
        l(a2, 29, new d(a2, mVar, 20));
    }

    @Override
    public final void onDeviceVolumeChanged(int i9, boolean z10) {
        a a2 = a();
        l(a2, 30, new d(a2, i9, z10));
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        a a2 = a();
        l(a2, 3, new d(a2, z10, 19));
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        a a2 = a();
        l(a2, 7, new d(a2, z10, 27));
    }

    @Override
    public final void onMediaItemTransition(f1 f1Var, int i9) {
        a a2 = a();
        l(a2, 1, new h9.a(a2, f1Var, i9));
    }

    @Override
    public final void onMediaMetadataChanged(h1 h1Var) {
        a a2 = a();
        l(a2, 14, new h9.a(a2, h1Var, 20));
    }

    @Override
    public final void onMetadata(z3.c cVar) {
        a a2 = a();
        l(a2, 28, new d(a2, cVar, 22));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i9) {
        a a2 = a();
        l(a2, 5, new h9.a(a2, z10, i9, 24));
    }

    @Override
    public final void onPlaybackParametersChanged(x1 x1Var) {
        a a2 = a();
        l(a2, 12, new h9.a(a2, x1Var, 21));
    }

    @Override
    public final void onPlaybackStateChanged(int i9) {
        a a2 = a();
        l(a2, 4, new d(a2, i9, 1));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i9) {
        a a2 = a();
        l(a2, 6, new d(a2, i9, 12));
    }

    @Override
    public final void onPlayerError(v1 v1Var) {
        a a2;
        b0 b0Var;
        if ((v1Var instanceof h3.n) && (b0Var = ((h3.n) v1Var).f9601n) != null) {
            a2 = i(new b0(b0Var));
        } else {
            a2 = a();
        }
        l(a2, 10, new i3(a2, v1Var, 16));
    }

    @Override
    public final void onPlayerErrorChanged(v1 v1Var) {
        a a2;
        b0 b0Var;
        if ((v1Var instanceof h3.n) && (b0Var = ((h3.n) v1Var).f9601n) != null) {
            a2 = i(new b0(b0Var));
        } else {
            a2 = a();
        }
        l(a2, 10, new d(a2, v1Var, 11));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i9) {
        a a2 = a();
        l(a2, -1, new h9.a(a2, z10, i9, 23));
    }

    @Override
    public final void onPositionDiscontinuity(int i9) {
    }

    @Override
    public final void onRepeatModeChanged(int i9) {
        a a2 = a();
        l(a2, 8, new d(a2, i9, 6));
    }

    @Override
    public final void onSeekProcessed() {
        a a2 = a();
        l(a2, -1, new c(a2, 1));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a a2 = a();
        l(a2, 9, new h9.a(a2, z10));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a k10 = k();
        l(k10, 23, new d(k10, z10, 26));
    }

    @Override
    public final void onSurfaceSizeChanged(int i9, int i10) {
        a k10 = k();
        l(k10, 24, new h9.a(k10, i9, i10));
    }

    @Override
    public final void onTimelineChanged(r2 r2Var, int i9) {
        c2 c2Var = this.h;
        c2Var.getClass();
        m mVar = this.d;
        mVar.d = m.n(c2Var, (z) mVar.f4161b, (d0) mVar.f4163e, (p2) mVar.f4160a);
        mVar.D(c2Var.A());
        a a2 = a();
        l(a2, 0, new d(a2, i9, 17));
    }

    @Override
    public final void onTracksChanged(t2 t2Var) {
        a a2 = a();
        l(a2, 2, new d(a2, t2Var, 8));
    }

    @Override
    public final void onVideoSizeChanged(e5.z zVar) {
        a k10 = k();
        l(k10, 25, new h3.d0(k10, zVar));
    }

    @Override
    public final void onVolumeChanged(float f10) {
        a k10 = k();
        l(k10, 22, new d(k10, f10));
    }

    @Override
    public final void onPositionDiscontinuity(b2 b2Var, b2 b2Var2, int i9) {
        if (i9 == 1) {
            this.f10895r = false;
        }
        c2 c2Var = this.h;
        c2Var.getClass();
        m mVar = this.d;
        mVar.d = m.n(c2Var, (z) mVar.f4161b, (d0) mVar.f4163e, (p2) mVar.f4160a);
        a a2 = a();
        l(a2, 11, new h3.x(a2, i9, b2Var, b2Var2));
    }

    @Override
    public final void onCues(r4.c cVar) {
        a a2 = a();
        l(a2, 27, new h9.a(a2, cVar, 27));
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
