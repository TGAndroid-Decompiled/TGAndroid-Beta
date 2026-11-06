package bi;

import android.animation.ValueAnimator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.pv;
import org.telegram.ui.ww;
public final class ab implements Runnable {
    public final int f3464a;
    public final Object f3465b;

    public ab(Object obj, int i7) {
        this.f3464a = i7;
        this.f3465b = obj;
    }

    private final void a() {
        ab.q qVar = (ab.q) this.f3465b;
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
            ((ca.h) q3Var.f19225a).h((String) q3Var.f19227c, map, qVar.f989a);
        }
    }

    @Override
    public final void run() {
        ti.o oVar;
        LaunchActivity launchActivity;
        String str = null;
        boolean z9 = false;
        switch (this.f3464a) {
            case 0:
                ((vg.m) this.f3465b).setPaused(true);
                return;
            case 1:
                org.telegram.messenger.g0.K3((EditTextBoldCursor) this.f3465b);
                return;
            case 2:
                ((h1[]) this.f3465b)[0].dismiss();
                return;
            case 3:
                vf.c.t(((tc) this.f3465b).getContext(), org.telegram.messenger.hd.M0(2131744967, null));
                return;
            case 4:
                vf.c.t(((uc) this.f3465b).getContext(), org.telegram.messenger.hd.M0(2131744967, null));
                return;
            case 5:
                ((c1.e) this.f3465b).f().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 6:
                m.q3 q3Var = (m.q3) this.f3465b;
                synchronized (((AtomicMarkableReference) q3Var.f19230g)) {
                    try {
                        if (((AtomicMarkableReference) q3Var.f19230g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) q3Var.f19230g).getReference();
                            ((AtomicMarkableReference) q3Var.f19230g).set(str, false);
                            z9 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z9) {
                    ((ca.h) q3Var.f19225a).i((String) q3Var.f19227c, str);
                    return;
                }
                return;
            case 7:
                a();
                return;
            case 8:
                ch.r rVar = (ch.r) ((d6.i) this.f3465b).f8209b;
                ch.q qVar = rVar.f6385b;
                if (qVar != null) {
                    qVar.d(true);
                }
                rVar.f6384a.N7(true);
                return;
            case 9:
                ((ValueAnimator) this.f3465b).start();
                return;
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = ((ch.w) this.f3465b).f6407g2.f6198r;
                if (f2Var instanceof an) {
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
                ((d3.e) this.f3465b).h.q();
                return;
            case 12:
                ((d3.u) this.f3465b).f8089m--;
                return;
            case 13:
                r0.f7961a.postVsyncCallback((d3.c0) this.f3465b);
                return;
            case 14:
                ww wwVar = ((pv) this.f3465b).O0;
                if (wwVar.L && wwVar.j4().I()) {
                    wwVar.E0.h();
                    return;
                } else {
                    wwVar.J4(true, true);
                    return;
                }
            case 15:
                ((di.e1) this.f3465b).f8954a.t(false);
                return;
            case 16:
                di.g1 g1Var = ((di.f1) this.f3465b).f8976a;
                qs.f(g1Var.f9025e).k(176, Long.valueOf(g1Var.g()));
                return;
            case 17:
                di.i1 i1Var = (di.i1) this.f3465b;
                di.p9 p9Var = i1Var.f9123c;
                if (p9Var != null && i1Var.E() && (oVar = i1Var.f9121a) != null && oVar.f56033c == 0 && (launchActivity = LaunchActivity.G1) != null && c8.jc.a(launchActivity)) {
                    p9Var.T();
                    return;
                }
                return;
            case 18:
                ti.o oVar2 = ((di.h1) this.f3465b).f9068e.f9121a;
                if (oVar2 != null) {
                    oVar2.c();
                    return;
                }
                return;
            case 19:
                ((di.e3) this.f3465b).f8958a.O0();
                return;
            case 20:
                di.i4 i4Var = ((di.j3) this.f3465b).f9252y;
                di.b4 b4Var = i4Var.f9221z1;
                if (b4Var != null) {
                    if (!i4Var.C1 && !i4Var.D1 && !i4Var.E1) {
                        di.p9 p9Var2 = ((di.g9) b4Var).d;
                        if (!p9Var2.f9559n0.getCurrentPeerView().b1(true) && !p9Var2.f9559n0.E(true)) {
                            p9Var2.u(true);
                            return;
                        }
                        return;
                    } else if (i4Var.f9213x1.f9041e) {
                        ((di.o9) i4Var.f9206v2.f9076c).loopBack();
                        return;
                    } else {
                        i4Var.F0 = 0L;
                        return;
                    }
                }
                return;
            case 21:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f3465b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 22:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f3465b;
                int i7 = ProfileStoriesView.f41976s0;
                profileStoriesView.getClass();
                org.telegram.messenger.g0.c4(profileStoriesView);
                return;
            case 23:
                di.k5.a(((di.g5) this.f3465b).d);
                return;
            case 24:
                di.w5 w5Var = (di.w5) this.f3465b;
                if (w5Var.isShowing()) {
                    w5Var.J0(true);
                    return;
                }
                return;
            case 25:
                fi.z0 z0Var = (fi.z0) this.f3465b;
                z0Var.c(z0Var.f13230b);
                z0Var.f13231c = false;
                return;
            case 26:
                ((fi.d8) this.f3465b).run();
                return;
            case 27:
                di.c7 c7Var = (di.c7) this.f3465b;
                c7Var.c();
                c7Var.a(true);
                return;
            case 28:
                ((di.y5) this.f3465b).a(null);
                return;
            default:
                ((di.m7) this.f3465b).R();
                return;
        }
    }
}
