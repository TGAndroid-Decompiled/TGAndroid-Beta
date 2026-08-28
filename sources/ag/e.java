package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import dh.l;
import fh.w0;
import gh.a4;
import gh.b4;
import gh.ca;
import gh.da;
import h3.g0;
import hg.k0;
import hg.u;
import hg.v;
import ih.d8;
import ih.e4;
import ih.k1;
import ih.m4;
import ih.p0;
import ih.p2;
import ih.q;
import ih.u0;
import ih.w4;
import ih.y6;
import ih.z6;
import java.util.Iterator;
import kh.d0;
import kh.d6;
import kh.e0;
import kh.e7;
import kh.f0;
import kh.j6;
import kh.l9;
import kh.m;
import kh.n9;
import kh.q3;
import kh.x3;
import kh.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
public final class e extends AnimatorListenerAdapter {
    public final int f194a;
    public final Object f195b;

    public e(Object obj, int i9) {
        this.f194a = i9;
        this.f195b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f194a) {
            case 29:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f195b;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i9 = this.f194a;
        Object obj = this.f195b;
        switch (i9) {
            case 0:
                super.onAnimationEnd(animator);
                j jVar = (j) ((f) obj).f197b;
                jVar.f205b.d = 0.0f;
                jVar.P = null;
                jVar.h(jVar.E);
                return;
            case 1:
                bg.c cVar = (bg.c) obj;
                cVar.f1710b = 1.0f;
                cVar.invalidate();
                return;
            case 2:
                l lVar = (l) obj;
                Iterator it = lVar.h.iterator();
                while (it.hasNext()) {
                    dh.e eVar = (dh.e) it.next();
                    if (lVar.f4615c.size() < lVar.d) {
                        lVar.f4615c.push(eVar);
                    }
                    it.remove();
                }
                Runnable runnable = lVar.f4627q;
                if (runnable != null) {
                    runnable.run();
                    lVar.f4627q = null;
                }
                lVar.f4628r = null;
                lVar.invalidateSelf();
                return;
            case 3:
                ((w0) obj).f6830b.f6904w.setVisibility(8);
                return;
            case 4:
                b4 b4Var = (b4) obj;
                b4Var.A = 1.0f;
                b4Var.B = -1;
                a4 a4Var = b4Var.D;
                if (a4Var != null && (z10 = a4Var.f7787l) && z10) {
                    a4Var.f7787l = false;
                    a4Var.b();
                }
                b4Var.C = null;
                return;
            case 5:
                ca caVar = ((da) obj).f7988c;
                caVar.setScaleX(1.0f);
                caVar.setScaleY(1.0f);
                return;
            case 6:
                ((g0) obj).run();
                return;
            case 7:
                v vVar = (v) obj;
                vVar.setVisibility(8);
                u uVar = vVar.f10762b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.f10762b = null;
                }
                vVar.f10764e = null;
                return;
            case 8:
                ((k0) obj).f10640x.c();
                return;
            case 9:
                ih.a aVar = (ih.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((q) obj).K.f11729p = false;
                return;
            case 11:
                p0 p0Var = (p0) obj;
                u0 u0Var = p0Var.G;
                if (u0Var != null && p0Var.E == u0Var.f12174a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    p0Var.F = ofFloat;
                    ofFloat.addUpdateListener(new bg.b(this, 15));
                    p0Var.F.setStartDelay(3000L);
                    p0Var.F.setDuration(550L);
                    p0Var.F.setInterpolator(new LinearInterpolator());
                    p0Var.F.start();
                    return;
                }
                return;
            case 12:
                ((k1) obj).E = null;
                return;
            case 13:
                p2 p2Var = (p2) obj;
                p2Var.f11943n5.invalidate();
                p2Var.setAnimatedTop(0);
                p2Var.f11943n5.R2 = true;
                View view = p2Var.B1;
                if (view != null && view.getVisibility() == 0) {
                    p2Var.B1.setTranslationY(((1.0f - p2Var.getTopViewEnterProgress()) * p2Var.B1.getLayoutParams().height) + p2Var.O1);
                }
                p2Var.f11943n5.a2 = null;
                return;
            case 14:
                e4 e4Var = (e4) obj;
                e4Var.f11356c[1].setVisibility(8);
                e4Var.f11356c[0].setAlpha(1.0f);
                e4Var.f11356c[0].setTranslationY(0.0f);
                return;
            case 15:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                iz0 iz0Var = profileStoriesView.h;
                profileStoriesView.C = 1.0f;
                iz0Var.N = 1.0f;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 16:
                ((m4) obj).I = null;
                return;
            case 17:
                w4 w4Var = (w4) obj;
                w4Var.f12300w = null;
                w4Var.f12298r = 1.0f;
                w4Var.invalidate();
                return;
            case 18:
            default:
                super.onAnimationEnd(animator);
                return;
            case 19:
                d8 d8Var = (d8) obj;
                d8Var.D = false;
                d8Var.C = 0.0f;
                d8Var.invalidate();
                d8Var.requestLayout();
                d8Var.F.requestLayout();
                return;
            case 20:
                m mVar = ((kh.g) obj).V;
                if (mVar.f15628c0 == animator) {
                    mVar.f15628c0 = null;
                    mVar.f15632f.getEditText().setScrollY(mVar.U);
                    return;
                }
                return;
            case 21:
                e0 e0Var = (e0) obj;
                e0Var.f15138l = 1.0f;
                f0 f0Var = e0Var.f15142p;
                if (f0Var.f15211n.contains(e0Var)) {
                    e0Var.f15131c.onDetachedFromWindow();
                    d0 d0Var = e0Var.d;
                    if (d0Var != null) {
                        d0Var.pause();
                        e0Var.d.release(null);
                        e0Var.d = null;
                    }
                    TextureView textureView = e0Var.f15132e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        e0Var.f15132e = null;
                    }
                    e0Var.f15133f = false;
                    f0Var.f15211n.remove(e0Var);
                }
                f0Var.invalidate();
                return;
            case 22:
                q3 q3Var = ((y2) obj).h;
                q3Var.B.setVisibility(8);
                q3Var.d.setVisibility(8);
                return;
            case 23:
                x3 x3Var = (x3) obj;
                x3Var.f16355k0 = 1.0f;
                x3Var.invalidate();
                return;
            case 24:
                super.onAnimationEnd(animator);
                d6 d6Var = (d6) obj;
                ImageView imageView = d6Var.f15108c;
                d6Var.f15108c = d6Var.d;
                d6Var.d = imageView;
                imageView.bringToFront();
                d6Var.d.setVisibility(8);
                d6Var.h = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((j6) obj).f15473w = null;
                return;
            case 26:
                e7 e7Var = (e7) obj;
                if (e7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) e7Var.getParent()).removeView(e7Var);
                    return;
                }
                return;
            case 27:
                ((n9) obj).J = false;
                return;
            case 28:
                l9 l9Var = (l9) obj;
                l9Var.setTranslationY(0.0f);
                l9Var.d = null;
                return;
            case 29:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f194a) {
            case 18:
                super.onAnimationStart(animator);
                z6 z6Var = (z6) this.f195b;
                mi0 mi0Var = ((y6) z6Var.f12376a.get(z6Var.d)).f12349c;
                mi0Var.I = 2;
                mi0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
