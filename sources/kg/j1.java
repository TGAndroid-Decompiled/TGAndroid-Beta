package kg;

import a8.ja;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import ki.w2;
import ki.x3;
import oi.d2;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k3;
public final class j1 implements Runnable {
    public final int f17975a;
    public final Object f17976b;

    public j1(Object obj, int i7) {
        this.f17975a = i7;
        this.f17976b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        Object obj;
        int i7 = this.f17975a;
        Object obj2 = this.f17976b;
        switch (i7) {
            case 0:
                ((bi.o1) obj2).a(Boolean.FALSE);
                return;
            case 1:
                ns.f(((v1) obj2).f18123a).k(121, new Object[0]);
                return;
            case 2:
                ((ki.e0) obj2).invalidateSelf();
                return;
            case 3:
                ((ki.f0) obj2).invalidateSelf();
                return;
            case 4:
                ((ki.h0) obj2).d();
                return;
            case 5:
                ((ki.t0) obj2).c();
                return;
            case 6:
                ((ki.t0) obj2).c();
                return;
            case 7:
                ((ki.u0) obj2).a();
                return;
            case 8:
                ((ki.v0) obj2).a();
                return;
            case 9:
                ((w2) obj2).invalidate();
                return;
            case 10:
                ((h2.f) obj2).e();
                return;
            case 11:
                x3 x3Var = (x3) obj2;
                x3Var.R = x3Var.f18697r;
                return;
            case 12:
                l2.f0 f0Var = (l2.f0) obj2;
                h2.c cVar = f0Var.C;
                Context context = f0Var.f18954e;
                String str = h2.l0.f13471a;
                int generateAudioSessionId = f2.h.d(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((h2.i0) cVar.f13419c).f13456a.getLooper()) {
                    obj = cVar.f13420e;
                } else {
                    if (myLooper == ((h2.i0) cVar.f13418b).f13456a.getLooper()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ja.p(z10);
                    obj = cVar.f13421f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f13421f = valueOf;
                    h2.b bVar = new h2.b(cVar, valueOf, 0);
                    h2.i0 i0Var = (h2.i0) cVar.f13419c;
                    if (i0Var.f13456a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    f0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    f0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 13:
                l2.f0 f0Var2 = ((l2.z) obj2).f19233a;
                f0Var2.x1(null);
                f0Var2.q1(0, 0);
                return;
            case 14:
                try {
                    l2.o0.f((l2.j1) obj2);
                    return;
                } catch (l2.l e10) {
                    h2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 15:
                m2.e eVar = (m2.e) obj2;
                m2.a Q = eVar.Q();
                eVar.V(Q, 1028, new li.p(Q, 22));
                eVar.f20128f.d();
                return;
            case 16:
                ((mh.b) obj2).invalidate();
                return;
            case 17:
                ((n2.e) obj2).c();
                return;
            case 18:
                h2.r rVar = (h2.r) obj2;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f13498a) {
                    rVar.e(-1, new n2.a0(0));
                    return;
                }
                return;
            case 19:
                n2.r0 r0Var = (n2.r0) obj2;
                if (r0Var.f20851a0 >= 300000) {
                    r0Var.f20863n.q();
                    r0Var.f20851a0 = 0L;
                    return;
                }
                return;
            case 20:
                nh.c cVar2 = (nh.c) obj2;
                GroupCallMessage groupCallMessage = cVar2.I;
                if (groupCallMessage != null) {
                    cVar2.f21164a.a(groupCallMessage.isSendDelayed(), true);
                    cVar2.f21165b.a(cVar2.I.isSendError(), true);
                    return;
                }
                return;
            case 21:
                i3 i3Var = ((k3) obj2).d;
                i3Var.requestFocus();
                org.telegram.messenger.g0.J3(i3Var);
                return;
            case 22:
                org.telegram.messenger.g0.J3(((oi.u) obj2).f22020a2.d);
                return;
            case 23:
                ((oi.a0) obj2).invalidate();
                return;
            case 24:
                ga.d dVar = (ga.d) obj2;
                dVar.d = null;
                dVar.f12965e = null;
                dVar.f12966f = null;
                dVar.h = null;
                dVar.j(null);
                return;
            case 25:
                ((oi.w1) obj2).invalidateSelf();
                return;
            case 26:
                ((d2) obj2).c();
                return;
            case 27:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj2);
                return;
            case 28:
                Drawable drawable = ActionBarLayout.f28322w1;
                org.telegram.messenger.g0.h3((ci.p0) obj2);
                return;
            default:
                ((org.telegram.ui.ActionBar.p0) obj2).setSelectedForDelete(false);
                return;
        }
    }

    public j1(l2.z zVar, SurfaceTexture surfaceTexture) {
        this.f17975a = 13;
        this.f17976b = zVar;
    }

    public j1(l2.o0 o0Var, l2.j1 j1Var) {
        this.f17975a = 14;
        this.f17976b = j1Var;
    }
}
