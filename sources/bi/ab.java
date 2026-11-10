package bi;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cn;
import org.telegram.ui.sv;
import org.telegram.ui.zw;
public final class ab implements Runnable {
    public final int f3467a;
    public final Object f3468b;

    public ab(Object obj, int i7) {
        this.f3467a = i7;
        this.f3468b = obj;
    }

    private final void a() {
        ab.q qVar = (ab.q) this.f3468b;
        Map map = null;
        ((AtomicReference) qVar.f991c).set(null);
        synchronized (qVar) {
            try {
                if (((AtomicMarkableReference) qVar.f990b).isMarked()) {
                    map = ((ca.e) ((AtomicMarkableReference) qVar.f990b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.f990b;
                    atomicMarkableReference.set((ca.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            m.q3 q3Var = (m.q3) qVar.d;
            ((ca.h) q3Var.f19233a).h((String) q3Var.f19235c, map, qVar.f989a);
        }
    }

    @Override
    public final void run() {
        ti.o oVar;
        LaunchActivity launchActivity;
        String str = null;
        boolean z9 = false;
        switch (this.f3467a) {
            case 0:
                ((vg.m) this.f3468b).setPaused(true);
                return;
            case 1:
                org.telegram.messenger.g0.K3((EditTextBoldCursor) this.f3468b);
                return;
            case 2:
                ((h1[]) this.f3468b)[0].dismiss();
                return;
            case 3:
                vf.c.t(((tc) this.f3468b).getContext(), org.telegram.messenger.id.M0(2131744966, null));
                return;
            case 4:
                vf.c.t(((uc) this.f3468b).getContext(), org.telegram.messenger.id.M0(2131744966, null));
                return;
            case 5:
                ((c1.e) this.f3468b).f().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 6:
                m.q3 q3Var = (m.q3) this.f3468b;
                synchronized (((AtomicMarkableReference) q3Var.f19238g)) {
                    try {
                        if (((AtomicMarkableReference) q3Var.f19238g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) q3Var.f19238g).getReference();
                            ((AtomicMarkableReference) q3Var.f19238g).set(str, false);
                            z9 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z9) {
                    ((ca.h) q3Var.f19233a).i((String) q3Var.f19235c, str);
                    return;
                }
                return;
            case 7:
                a();
                return;
            case 8:
                ch.r rVar = (ch.r) ((d6.i) this.f3468b).f8212b;
                ch.q qVar = rVar.f6388b;
                if (qVar != null) {
                    qVar.d(true);
                }
                rVar.f6387a.O7(true);
                return;
            case 9:
                ((ValueAnimator) this.f3468b).start();
                return;
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = ((ch.w) this.f3468b).f6410g2.f6201r;
                if (f2Var instanceof cn) {
                    f2Var.showDialog(new ug.w0(f2Var, 11, false));
                    return;
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.showDialog(new ug.w0(f2Var, 11, false));
                    return;
                }
                return;
            case 11:
                ((d3.e) this.f3468b).h.q();
                return;
            case 12:
                ((d3.u) this.f3468b).f8092m--;
                return;
            case 13:
                r0.f7964a.postVsyncCallback((d3.c0) this.f3468b);
                return;
            case 14:
                zw zwVar = ((sv) this.f3468b).O0;
                if (zwVar.L && zwVar.j4().I()) {
                    zwVar.E0.h();
                    return;
                } else {
                    zwVar.J4(true, true);
                    return;
                }
            case 15:
                ((di.e1) this.f3468b).f8947a.t(false);
                return;
            case 16:
                di.g1 g1Var = ((di.f1) this.f3468b).f8986a;
                qs.f(g1Var.f9005e).k(176, Long.valueOf(g1Var.g()));
                return;
            case 17:
                di.i1 i1Var = (di.i1) this.f3468b;
                di.q9 q9Var = i1Var.f9102c;
                if (q9Var != null && i1Var.E() && (oVar = i1Var.f9100a) != null && oVar.f56136c == 0 && (launchActivity = LaunchActivity.G1) != null && c8.kc.a(launchActivity)) {
                    q9Var.T();
                    return;
                }
                return;
            case 18:
                ti.o oVar2 = ((di.h1) this.f3468b).f9063e.f9100a;
                if (oVar2 != null) {
                    oVar2.c();
                    return;
                }
                return;
            case 19:
                ((di.e3) this.f3468b).f8951a.O0();
                return;
            case 20:
                di.j4 j4Var = ((di.j3) this.f3468b).f9166y;
                di.c4 c4Var = j4Var.f9258z1;
                if (c4Var != null) {
                    if (!j4Var.C1 && !j4Var.D1 && !j4Var.E1) {
                        di.q9 q9Var2 = ((di.h9) c4Var).d;
                        if (!q9Var2.f9629n0.getCurrentPeerView().b1(true) && !q9Var2.f9629n0.E(true)) {
                            q9Var2.u(true);
                            return;
                        }
                        return;
                    } else if (j4Var.f9250x1.f9072e) {
                        ((di.p9) j4Var.f9243v2.f9111c).loopBack();
                        return;
                    } else {
                        j4Var.F0 = 0L;
                        return;
                    }
                }
                return;
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f3468b;
                int i7 = ProfileStoriesView.f41977s0;
                profileStoriesView.getClass();
                org.telegram.messenger.g0.c4(profileStoriesView);
                return;
            case 22:
                di.l5.a(((di.h5) this.f3468b).d);
                return;
            case 23:
                di.x5 x5Var = (di.x5) this.f3468b;
                if (x5Var.isShowing()) {
                    x5Var.J0(true);
                    return;
                }
                return;
            case 24:
                fi.z0 z0Var = (fi.z0) this.f3468b;
                z0Var.c(z0Var.f13232b);
                z0Var.f13233c = false;
                return;
            case 25:
                ((fi.d8) this.f3468b).run();
                return;
            case 26:
                di.d7 d7Var = (di.d7) this.f3468b;
                d7Var.c();
                d7Var.a(true);
                return;
            case 27:
                ((di.z5) this.f3468b).a(null);
                return;
            case 28:
                ((di.n7) this.f3468b).R();
                return;
            default:
                di.w7 w7Var = (di.w7) this.f3468b;
                ArrayList arrayList = w7Var.f9908c;
                if (arrayList != null) {
                    w7Var.f9906a.f9194i1 = arrayList;
                }
                di.j4 j4Var2 = w7Var.f9906a;
                long j3 = w7Var.f9907b;
                if (j4Var2.f9201k1 != j3 || j4Var2.f9194i1 != null) {
                    j4Var2.f9201k1 = j3;
                    j4Var2.h1();
                    j4Var2.g1();
                    j4Var2.d1(true);
                    TL_stories.PeerStories peerStories = j4Var2.f9229s0.P0;
                    if (peerStories != null) {
                        j4Var2.B1.V(peerStories, true);
                        return;
                    }
                    di.z6 z6Var = j4Var2.B1;
                    TL_stories.PeerStories y10 = z6Var.y(j3);
                    if (y10 == null) {
                        y10 = z6Var.z(j3);
                        z9 = true;
                    }
                    z6Var.V(y10, z9);
                    return;
                }
                return;
        }
    }
}
