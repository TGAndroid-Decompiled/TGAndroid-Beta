package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.a11;
public final class h extends AnimatorListenerAdapter {
    public final int f2773a;
    public final Object f2774b;

    public h(Object obj, int i10) {
        this.f2773a = i10;
        this.f2774b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2773a) {
            case 15:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2774b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f2773a) {
            case 0:
                o oVar = ((i) this.f2774b).f2824c0;
                if (oVar.f3270g0 == animator) {
                    oVar.f3270g0 = null;
                    oVar.f3268f.getEditText().setScrollY(oVar.f3263b0);
                    return;
                }
                return;
            case 1:
                i0 i0Var = (i0) this.f2774b;
                i0Var.f2833l = 1.0f;
                j0 j0Var = i0Var.f2837p;
                if (j0Var.f2920n.contains(i0Var)) {
                    i0Var.f2827c.onDetachedFromWindow();
                    h0 h0Var = i0Var.d;
                    if (h0Var != null) {
                        h0Var.pause();
                        i0Var.d.release(null);
                        i0Var.d = null;
                    }
                    TextureView textureView = i0Var.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        i0Var.e = null;
                    }
                    i0Var.f2828f = false;
                    j0Var.f2920n.remove(i0Var);
                }
                j0Var.invalidate();
                return;
            case 2:
                p4 p4Var = ((v3) this.f2774b).h;
                p4Var.F.setVisibility(8);
                p4Var.d.setVisibility(8);
                return;
            case 3:
                x4 x4Var = (x4) this.f2774b;
                x4Var.f3893o0 = 1.0f;
                x4Var.invalidate();
                return;
            case 4:
                super.onAnimationEnd(animator);
                o7 o7Var = (o7) this.f2774b;
                ImageView imageView = o7Var.f3323c;
                o7Var.f3323c = o7Var.d;
                o7Var.d = imageView;
                imageView.bringToFront();
                o7Var.d.setVisibility(8);
                o7Var.h = null;
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((u7) this.f2774b).f3729w = null;
                return;
            case 6:
                r8 r8Var = (r8) this.f2774b;
                if (r8Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) r8Var.getParent()).removeView(r8Var);
                    return;
                }
                return;
            case 7:
                ((kb) this.f2774b).N = false;
                return;
            case 8:
                ib ibVar = (ib) this.f2774b;
                ibVar.setTranslationY(0.0f);
                ibVar.d = null;
                return;
            case 9:
                di.b0 b0Var = (di.b0) this.f2774b;
                b0Var.setVisibility(8);
                b0Var.f6530a = null;
                return;
            case 10:
                ((di.n3) this.f2774b).f6814y.setVisibility(8);
                return;
            case 11:
                ((di.u4) this.f2774b).I.setVisibility(8);
                return;
            case 12:
                super.onAnimationEnd(animator);
                hg.g gVar = (hg.g) this.f2774b;
                if (!gVar.f9368i1) {
                    gVar.f9383u0 = false;
                    gVar.f9382t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f9361f0 = false;
                return;
            case 13:
                ((jg.e) this.f2774b).h.setVisibility(8);
                return;
            case 14:
                ((CropAreaView) this.f2774b).f21093c0 = null;
                return;
            case 15:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2774b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 16:
                og.g0 g0Var = (og.g0) this.f2774b;
                g0Var.f14364a.getPainting().c(null, g0Var.f14364a.getCurrentColor(), true, null);
                g0Var.f14378r = null;
                return;
            case 17:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f2774b;
                Runnable runnable = j4Var.f33900a0;
                if (runnable != null) {
                    runnable.run();
                    j4Var.f33900a0 = null;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) this.f2774b;
                w3Var.f37692w = 1.0f;
                w3Var.n();
                w3Var.i();
                w3Var.h();
                w3Var.f37685a.unlock();
                return;
            case 19:
                org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) this.f2774b;
                r4Var.getClass();
                r4Var.setVisibility(8);
                return;
            case 20:
                org.telegram.ui.u4 u4Var = (org.telegram.ui.u4) this.f2774b;
                u4Var.f37105c = false;
                u4Var.invalidate();
                return;
            case 21:
                ((org.telegram.ui.w5) this.f2774b).f37708f0.setVisibility(8);
                return;
            case 22:
            default:
                super.onAnimationEnd(animator);
                return;
            case 23:
                ((org.telegram.ui.u9) this.f2774b).f37171s = null;
                return;
            case 24:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f2774b;
                ((a11) jVar).f30776c0.e.f30365c.f41601r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f2774b;
                Button button = wVar.f20579n;
                hi0 hi0Var = wVar.f20578f;
                if (button == hi0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    hi0Var.setVisibility(4);
                    return;
                }
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f2774b).f19046x = null;
                return;
            case 27:
                ((org.telegram.ui.Cells.g4) this.f2774b).G = null;
                return;
            case 28:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f2774b;
                if (animator.equals(t5Var.f20438n)) {
                    t5Var.f20438n = null;
                    return;
                }
                return;
            case 29:
                androidx.activity.i iVar = (androidx.activity.i) this.f2774b;
                if (animator.equals(((org.telegram.ui.Cells.w5) iVar.f573b).d)) {
                    ((org.telegram.ui.Cells.w5) iVar.f573b).d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f2773a) {
            case 19:
                ((org.telegram.ui.r4) this.f2774b).setVisibility(0);
                return;
            case 22:
                org.telegram.ui.h8 h8Var = (org.telegram.ui.h8) this.f2774b;
                for (int i10 = 0; i10 < h8Var.f33302b.getChildCount(); i10++) {
                    org.telegram.ui.e8.a((org.telegram.ui.e8) h8Var.f33302b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                return;
            case 24:
                ((a11) ((org.telegram.ui.Cells.j) this.f2774b)).f30776c0.e.f30365c.f41601r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
