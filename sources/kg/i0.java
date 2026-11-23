package kg;

import a8.la;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import bi.m2;
import hi.w4;
import ki.r2;
import ki.r3;
import org.telegram.messenger.ls;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Cells.l3;
import org.telegram.ui.Components.c51;
public final class i0 implements Runnable {
    public final int f18380a;
    public final Object f18381b;

    public i0(Object obj, int i7) {
        this.f18380a = i7;
        this.f18381b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        Object obj;
        int i7 = this.f18380a;
        Object obj2 = this.f18381b;
        switch (i7) {
            case 0:
                k0 k0Var = (k0) obj2;
                c51 c51Var = k0Var.f18397a2;
                if (c51Var != null) {
                    c51Var.O(true);
                }
                k0Var.e1(true);
                return;
            case 1:
                s0 s0Var = (s0) ((w4) obj2).f15708b;
                s0Var.f18499c.f35789g3.O(true);
                s0Var.g0();
                return;
            case 2:
                u0 u0Var = (u0) obj2;
                u0Var.f18525b.f35789g3.O(true);
                u0Var.a0(true);
                return;
            case 3:
                e1 e1Var = (e1) obj2;
                e1Var.f18334a.f35789g3.O(true);
                e1Var.d0(true);
                return;
            case 4:
                ((m2) obj2).a(Boolean.FALSE);
                return;
            case 5:
                ls.f(((v1) obj2).f18544a).k(121, new Object[0]);
                return;
            case 6:
                ((ki.c0) obj2).invalidateSelf();
                return;
            case 7:
                ((ki.d0) obj2).invalidateSelf();
                return;
            case 8:
                ((ki.f0) obj2).d();
                return;
            case 9:
                ((ki.s0) obj2).c();
                return;
            case 10:
                ((ki.s0) obj2).c();
                return;
            case 11:
                ((ki.t0) obj2).a();
                return;
            case 12:
                ((ki.u0) obj2).a();
                return;
            case 13:
                ((r2) obj2).invalidate();
                return;
            case 14:
                ((h2.f) obj2).e();
                return;
            case 15:
                r3 r3Var = (r3) obj2;
                r3Var.R = r3Var.f18910r;
                return;
            case 16:
                l2.f0 f0Var = (l2.f0) obj2;
                h2.c cVar = f0Var.C;
                Context context = f0Var.f19349e;
                String str = h2.l0.f13815a;
                int generateAudioSessionId = f2.i.d(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((h2.i0) cVar.f13763c).f13800a.getLooper()) {
                    obj = cVar.f13764e;
                } else {
                    if (myLooper == ((h2.i0) cVar.f13762b).f13800a.getLooper()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    la.p(z10);
                    obj = cVar.f13765f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f13765f = valueOf;
                    h2.b bVar = new h2.b(cVar, valueOf, 0);
                    h2.i0 i0Var = (h2.i0) cVar.f13763c;
                    if (i0Var.f13800a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    f0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    f0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 17:
                l2.f0 f0Var2 = ((l2.z) obj2).f19628a;
                f0Var2.x1(null);
                f0Var2.q1(0, 0);
                return;
            case 18:
                try {
                    l2.o0.f((l2.j1) obj2);
                    return;
                } catch (l2.l e10) {
                    h2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 19:
                m2.d dVar = (m2.d) obj2;
                m2.a Q = dVar.Q();
                dVar.V(Q, 1028, new li.c(Q, 23));
                dVar.f20520f.d();
                return;
            case 20:
                ((mh.b) obj2).invalidate();
                return;
            case 21:
                ((n2.e) obj2).c();
                return;
            case 22:
                h2.r rVar = (h2.r) obj2;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f13842a) {
                    rVar.e(-1, new n2.a0(1));
                    return;
                }
                return;
            case 23:
                n2.r0 r0Var = (n2.r0) obj2;
                if (r0Var.f21243a0 >= 300000) {
                    r0Var.f21255n.Q();
                    r0Var.f21243a0 = 0L;
                    return;
                }
                return;
            case 24:
                nh.c cVar2 = (nh.c) obj2;
                GroupCallMessage groupCallMessage = cVar2.I;
                if (groupCallMessage != null) {
                    cVar2.f21556a.a(groupCallMessage.isSendDelayed(), true);
                    cVar2.f21557b.a(cVar2.I.isSendError(), true);
                    return;
                }
                return;
            case 25:
                j3 j3Var = ((l3) obj2).d;
                j3Var.requestFocus();
                org.telegram.messenger.g0.I3(j3Var);
                return;
            case 26:
                org.telegram.messenger.g0.I3(((oi.v) obj2).f22471a2.d);
                return;
            case 27:
                ((oi.b0) obj2).invalidate();
                return;
            case 28:
                ga.d dVar2 = (ga.d) obj2;
                dVar2.d = null;
                dVar2.f13311e = null;
                dVar2.f13312f = null;
                dVar2.h = null;
                dVar2.j(null);
                return;
            default:
                ((oi.y1) obj2).invalidateSelf();
                return;
        }
    }

    public i0(l2.z zVar, SurfaceTexture surfaceTexture) {
        this.f18380a = 17;
        this.f18381b = zVar;
    }

    public i0(l2.o0 o0Var, l2.j1 j1Var) {
        this.f18380a = 18;
        this.f18381b = j1Var;
    }
}
