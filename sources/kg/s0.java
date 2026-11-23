package kg;

import a8.ma;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import bi.o2;
import hi.x4;
import ki.r2;
import ki.r3;
import oi.e2;
import org.telegram.messenger.ls;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Cells.l3;
public final class s0 implements Runnable {
    public final int f18444a;
    public final Object f18445b;

    public s0(Object obj, int i7) {
        this.f18444a = i7;
        this.f18445b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        Object obj;
        int i7 = this.f18444a;
        Object obj2 = this.f18445b;
        switch (i7) {
            case 0:
                t0 t0Var = (t0) ((x4) obj2).f15680b;
                t0Var.f18475c.f35742g3.O(true);
                t0Var.g0();
                return;
            case 1:
                v0 v0Var = (v0) obj2;
                v0Var.f18497b.f35742g3.O(true);
                v0Var.a0(true);
                return;
            case 2:
                f1 f1Var = (f1) obj2;
                f1Var.f18311a.f35742g3.O(true);
                f1Var.d0(true);
                return;
            case 3:
                ((o2) obj2).a(Boolean.FALSE);
                return;
            case 4:
                ls.f(((w1) obj2).f18518a).k(121, new Object[0]);
                return;
            case 5:
                ((ki.c0) obj2).invalidateSelf();
                return;
            case 6:
                ((ki.d0) obj2).invalidateSelf();
                return;
            case 7:
                ((ki.f0) obj2).d();
                return;
            case 8:
                ((ki.s0) obj2).c();
                return;
            case 9:
                ((ki.s0) obj2).c();
                return;
            case 10:
                ((ki.t0) obj2).a();
                return;
            case 11:
                ((ki.u0) obj2).a();
                return;
            case 12:
                ((r2) obj2).invalidate();
                return;
            case 13:
                ((h2.f) obj2).e();
                return;
            case 14:
                r3 r3Var = (r3) obj2;
                r3Var.R = r3Var.f18876r;
                return;
            case 15:
                l2.f0 f0Var = (l2.f0) obj2;
                h2.c cVar = f0Var.C;
                Context context = f0Var.f19315e;
                String str = h2.l0.f13778a;
                int generateAudioSessionId = f2.i.d(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((h2.i0) cVar.f13726c).f13763a.getLooper()) {
                    obj = cVar.f13727e;
                } else {
                    if (myLooper == ((h2.i0) cVar.f13725b).f13763a.getLooper()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ma.p(z10);
                    obj = cVar.f13728f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f13728f = valueOf;
                    h2.b bVar = new h2.b(cVar, valueOf, 0);
                    h2.i0 i0Var = (h2.i0) cVar.f13726c;
                    if (i0Var.f13763a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    f0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    f0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 16:
                l2.f0 f0Var2 = ((l2.z) obj2).f19594a;
                f0Var2.x1(null);
                f0Var2.q1(0, 0);
                return;
            case 17:
                try {
                    l2.o0.f((l2.j1) obj2);
                    return;
                } catch (l2.l e10) {
                    h2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 18:
                m2.d dVar = (m2.d) obj2;
                m2.a Q = dVar.Q();
                dVar.V(Q, 1028, new li.c(Q, 23));
                dVar.f20486f.d();
                return;
            case 19:
                ((mh.b) obj2).invalidate();
                return;
            case 20:
                ((n2.e) obj2).c();
                return;
            case 21:
                h2.r rVar = (h2.r) obj2;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f13805a) {
                    rVar.e(-1, new n2.a0(1));
                    return;
                }
                return;
            case 22:
                n2.r0 r0Var = (n2.r0) obj2;
                if (r0Var.f21209a0 >= 300000) {
                    r0Var.f21221n.Q();
                    r0Var.f21209a0 = 0L;
                    return;
                }
                return;
            case 23:
                nh.c cVar2 = (nh.c) obj2;
                GroupCallMessage groupCallMessage = cVar2.I;
                if (groupCallMessage != null) {
                    cVar2.f21522a.a(groupCallMessage.isSendDelayed(), true);
                    cVar2.f21523b.a(cVar2.I.isSendError(), true);
                    return;
                }
                return;
            case 24:
                j3 j3Var = ((l3) obj2).d;
                j3Var.requestFocus();
                org.telegram.messenger.g0.I3(j3Var);
                return;
            case 25:
                org.telegram.messenger.g0.I3(((oi.u) obj2).f22408a2.d);
                return;
            case 26:
                ((oi.a0) obj2).invalidate();
                return;
            case 27:
                ga.d dVar2 = (ga.d) obj2;
                dVar2.d = null;
                dVar2.f13274e = null;
                dVar2.f13275f = null;
                dVar2.h = null;
                dVar2.j(null);
                return;
            case 28:
                ((oi.x1) obj2).invalidateSelf();
                return;
            default:
                ((e2) obj2).c();
                return;
        }
    }

    public s0(l2.z zVar, SurfaceTexture surfaceTexture) {
        this.f18444a = 16;
        this.f18445b = zVar;
    }

    public s0(l2.o0 o0Var, l2.j1 j1Var) {
        this.f18444a = 17;
        this.f18445b = j1Var;
    }
}
