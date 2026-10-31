package gg;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Looper;
import android.view.Choreographer;
import androidx.activity.i;
import c2.h;
import e2.j0;
import e2.l0;
import i2.c0;
import i2.i0;
import i2.l;
import i2.p1;
import i2.s0;
import ig.a1;
import ig.f1;
import ig.p0;
import ig.q0;
import ig.s1;
import ig.t1;
import ih.q;
import ih.r;
import j2.g;
import jg.g3;
import jg.t2;
import k2.w0;
import kg.b2;
import kg.i1;
import kg.k2;
import kg.x0;
import kg.z1;
import org.telegram.messenger.d20;
import org.telegram.messenger.ui;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Wallet.a7;
import org.telegram.ui.Wallet.z6;
import org.telegram.ui.pb1;
import org.telegram.ui.u61;
import org.telegram.ui.un;
import s4.a0;
import v7.t6;
import vh.s3;
public final class c implements Runnable {
    public final int f7502a;
    public final Object f7503b;

    public c(c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f7502a = 4;
        this.f7503b = c0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        Object obj;
        int i10 = this.f7502a;
        Object obj2 = this.f7503b;
        switch (i10) {
            case 0:
                pb1 pb1Var = (pb1) obj2;
                if (pb1Var.getParentLayout() != null) {
                    pb1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", pb1Var.f40566a);
                    un unVar = new un(bundle);
                    unVar.Ca = true;
                    pb1Var.presentFragment(unVar);
                    return;
                }
                return;
            case 1:
                ((j0) obj2).getClass();
                return;
            case 2:
                hh.c cVar = (hh.c) obj2;
                hh.b bVar = (hh.b) cVar.f7689c;
                if (bVar == hh.b.f7685b) {
                    cVar.a(hh.b.f7684a, true);
                    return;
                } else if (bVar == hh.b.f7686c) {
                    cVar.a(hh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 3:
                i0 i0Var = (i0) obj2;
                e2.c cVar2 = i0Var.C;
                Context context = i0Var.e;
                String str = l0.f6165a;
                int generateAudioSessionId = h.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar2.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((e2.i0) cVar2.f6118c).f6151a.getLooper()) {
                    obj = cVar2.e;
                } else {
                    if (myLooper == ((e2.i0) cVar2.f6117b).f6151a.getLooper()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t6.p(z10);
                    obj = cVar2.f6119f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar2.f6119f = valueOf;
                    e2.b bVar2 = new e2.b(cVar2, valueOf, 0);
                    e2.i0 i0Var2 = (e2.i0) cVar2.f6118c;
                    if (i0Var2.f6151a.getLooper().getThread().isAlive()) {
                        i0Var2.d(bVar2);
                    }
                    i0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    i0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 4:
                i0 i0Var3 = ((c0) obj2).f7821a;
                i0Var3.x1(null);
                i0Var3.q1(0, 0);
                return;
            case 5:
                try {
                    s0.g((p1) obj2);
                    return;
                } catch (l e) {
                    e2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 6:
                a4.l lVar = ((p0) obj2).f8390b.f8410a;
                if (lVar != null) {
                    lVar.u();
                    return;
                }
                return;
            case 7:
                q0 q0Var = ((p0) obj2).f8390b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f8413f.getCurrentColor();
                q0Var.l(q0Var.f8411b, false, false);
                a5.a d = q0Var.d(q0Var.f8411b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                f1 f1Var = q0Var.d;
                RectF rectF = new RectF();
                q0Var.h = rectF;
                f1Var.a(rectF);
                q0Var.p(q0Var.e(f1Var, currentColor, new RectF(q0Var.h)), false);
                q0Var.p(d, false);
                q0Var.e(f1Var, currentColor, null);
                q0Var.d = null;
                q0Var.J = 0.0f;
                q0Var.L = null;
                return;
            case 8:
                ((a1) ((i) obj2).f935b).D.f8282a.d();
                return;
            case 9:
                s1 s1Var = ((t1) obj2).f8469a;
                if (s1Var != null) {
                    s1Var.B();
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.i0.J3(((ih.d) obj2).f8523a);
                return;
            case 11:
                ih.d dVar = (ih.d) ((ih.b) obj2).Z1;
                q1 q1Var = dVar.f8527n;
                if (q1Var != null && q1Var.getDelegate() != null) {
                    dVar.f8527n.getDelegate().n1(dVar.f8527n, false);
                    return;
                }
                return;
            case 12:
                ((r) obj2).f8576c.f30819f3.O(true);
                return;
            case 13:
                ((q) obj2).a();
                return;
            case 14:
                g gVar = (g) obj2;
                j2.a Q = gVar.Q();
                gVar.V(Q, 1028, new j2.c(Q));
                gVar.f9354f.d();
                return;
            case 15:
                s3 s3Var = (s3) obj2;
                s3Var.f10062x0 = true;
                s3Var.s();
                return;
            case 16:
                ui.b0(d20.f15147s0).d(2, null, ((t2) obj2).f10272f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                org.telegram.messenger.i0.J3(((g3) obj2).f9983q0);
                return;
            case 18:
                ji.d dVar2 = (ji.d) obj2;
                org.telegram.messenger.i0.h3(new ji.c(dVar2.f10434a, dVar2.f10435b, 1), 500L);
                return;
            case 19:
                ((k2.e) obj2).c();
                return;
            case 20:
                e2.r rVar = (e2.r) obj2;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f6188a) {
                    rVar.e(-1, new j2.e(27));
                    return;
                }
                return;
            case 21:
                w0 w0Var = (w0) obj2;
                if (w0Var.f10785a0 >= 300000) {
                    w0Var.f10796n.n();
                    w0Var.f10785a0 = 0L;
                    return;
                }
                return;
            case 22:
                kg.q0 q0Var2 = ((kg.j0) obj2).f11130c;
                q0Var2.f26669o1.presentFragment(u61.f0(q0Var2.n1(), true));
                return;
            case 23:
                ei0 ei0Var = ((x0) obj2).F;
                ei0Var.getAnimatedDrawable().N(0, true, false);
                ei0Var.d();
                return;
            case 24:
                ((i1) ((kg.f1) obj2).f11067c).I0();
                return;
            case 25:
                z1 z1Var = (z1) obj2;
                int size = 1073741823 - (1073741823 % z1Var.f11352e3.size());
                a0 a0Var = z1Var.f11353f3;
                z1Var.f11366s3 = size;
                a0Var.h1(size, (z1Var.getMeasuredHeight() - z1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                z1Var.z1(null, false);
                return;
            case 26:
                ((b2) obj2).invalidate();
                return;
            case 27:
                ((k2) obj2).a();
                return;
            case 28:
                ((bh.d) obj2).L();
                return;
            default:
                lg.g gVar2 = ((lg.e) obj2).d;
                gVar2.f11872s = false;
                gVar2.f11873w = null;
                Choreographer.getInstance().removeFrameCallback(gVar2);
                gVar2.F = 0L;
                z6 z6Var = (z6) gVar2;
                a7 a7Var = z6Var.L;
                if (a7Var.d == z6Var) {
                    a7.c(a7Var);
                    return;
                }
                return;
        }
    }

    public c(s0 s0Var, p1 p1Var) {
        this.f7502a = 5;
        this.f7503b = p1Var;
    }

    public c(Object obj, int i10) {
        this.f7502a = i10;
        this.f7503b = obj;
    }
}
