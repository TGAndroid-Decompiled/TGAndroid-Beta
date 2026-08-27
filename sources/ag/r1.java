package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import hh.ca;
import hh.da;
import hh.m5;
import hh.y3;
import hh.z3;
import java.util.Iterator;
import jh.a4;
import jh.i4;
import jh.s4;
import jh.v6;
import jh.w6;
import jh.z7;
import lh.c6;
import lh.d7;
import lh.h6;
import lh.k9;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;

public final class r1 extends AnimatorListenerAdapter {

    public final int f634a;

    public final Object f635b;

    public r1(Object obj, int i10) {
        this.f634a = i10;
        this.f635b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f634a;
        Object obj = this.f635b;
        switch (i10) {
            case 0:
                s1 s1Var = (s1) obj;
                s1Var.f646n = s1Var.h ? 1.0f : 0.0f;
                s1Var.e();
                break;
            case 1:
                p3 p3Var = (p3) ((o3) obj).f584b;
                p3Var.B = true;
                p3Var.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                bg.i iVar = (bg.i) ((bg.e) obj).f2121b;
                iVar.f2129b.d = 0.0f;
                iVar.P = null;
                iVar.h(iVar.E);
                break;
            case 3:
                cg.b bVar = (cg.b) obj;
                bVar.f2604b = 1.0f;
                bVar.invalidate();
                break;
            case 4:
                eh.k kVar = (eh.k) obj;
                Iterator it = kVar.h.iterator();
                while (it.hasNext()) {
                    eh.e eVar = (eh.e) it.next();
                    if (kVar.f5513c.size() < kVar.d) {
                        kVar.f5513c.push(eVar);
                    }
                    it.remove();
                }
                Runnable runnable = kVar.f5525q;
                if (runnable != null) {
                    runnable.run();
                    kVar.f5525q = null;
                }
                kVar.f5526r = null;
                kVar.invalidateSelf();
                break;
            case 5:
                ((gh.u0) obj).f7548b.f7621w.setVisibility(8);
                break;
            case 6:
                z3 z3Var = (z3) obj;
                z3Var.A = 1.0f;
                z3Var.B = -1;
                y3 y3Var = z3Var.D;
                if (y3Var != null && (z10 = y3Var.f10376l) && z10) {
                    y3Var.f10376l = false;
                    y3Var.b();
                }
                z3Var.C = null;
                break;
            case 7:
                ca caVar = ((da) obj).f9144c;
                caVar.setScaleX(1.0f);
                caVar.setScaleY(1.0f);
                break;
            case 8:
                ((m5) obj).run();
                break;
            case 9:
                ig.v vVar = (ig.v) obj;
                vVar.setVisibility(8);
                ig.u uVar = vVar.f11458b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.f11458b = null;
                }
                vVar.f11460e = null;
                break;
            case 10:
                ((ig.j0) obj).f11334x.c();
                break;
            case 11:
                jh.a aVar = (jh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((jh.o) obj).K.f13404p = false;
                break;
            case 13:
                jh.n0 n0Var = (jh.n0) obj;
                jh.s0 s0Var = n0Var.G;
                if (s0Var != null && n0Var.E == s0Var.f13929a) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n0Var.F = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new u(this, 18));
                    n0Var.F.setStartDelay(3000L);
                    n0Var.F.setDuration(550L);
                    n0Var.F.setInterpolator(new LinearInterpolator());
                    n0Var.F.start();
                    break;
                }
                break;
            case 14:
                ((jh.i1) obj).E = null;
                break;
            case 15:
                jh.o2 o2Var = (jh.o2) obj;
                o2Var.f13742n5.invalidate();
                o2Var.setAnimatedTop(0);
                o2Var.f13742n5.R2 = true;
                View view = o2Var.B1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var.B1.setTranslationY(((1.0f - o2Var.getTopViewEnterProgress()) * o2Var.B1.getLayoutParams().height) + o2Var.O1);
                }
                o2Var.f13742n5.a2 = null;
                break;
            case 16:
                a4 a4Var = (a4) obj;
                a4Var.f13035c[1].setVisibility(8);
                a4Var.f13035c[0].setAlpha(1.0f);
                a4Var.f13035c[0].setTranslationY(0.0f);
                break;
            case 17:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                iz0 iz0Var = profileStoriesView.h;
                profileStoriesView.C = 1.0f;
                iz0Var.N = 1.0f;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 18:
                ((i4) obj).I = null;
                break;
            case 19:
                s4 s4Var = (s4) obj;
                s4Var.f13949w = null;
                s4Var.f13947r = 1.0f;
                s4Var.invalidate();
                break;
            case 20:
            default:
                super.onAnimationEnd(animator);
                break;
            case 21:
                z7 z7Var = (z7) obj;
                z7Var.D = false;
                z7Var.C = 0.0f;
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.F.requestLayout();
                break;
            case 22:
                lh.m mVar = ((lh.g) obj).V;
                if (mVar.f16334c0 == animator) {
                    mVar.f16334c0 = null;
                    mVar.f16338f.getEditText().setScrollY(mVar.U);
                    break;
                }
                break;
            case 23:
                lh.d0 d0Var = (lh.d0) obj;
                d0Var.f15844l = 1.0f;
                lh.e0 e0Var = d0Var.f15848p;
                if (e0Var.f15906n.contains(d0Var)) {
                    d0Var.f15837c.onDetachedFromWindow();
                    o3 o3Var = d0Var.d;
                    if (o3Var != null) {
                        o3Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f15838e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.f15838e = null;
                    }
                    d0Var.f15839f = false;
                    e0Var.f15906n.remove(d0Var);
                }
                e0Var.invalidate();
                break;
            case 24:
                lh.p3 p3Var2 = ((lh.x2) obj).h;
                p3Var2.B.setVisibility(8);
                p3Var2.d.setVisibility(8);
                break;
            case 25:
                w3 w3Var = (w3) obj;
                w3Var.f16987k0 = 1.0f;
                w3Var.invalidate();
                break;
            case 26:
                super.onAnimationEnd(animator);
                c6 c6Var = (c6) obj;
                ImageView imageView = c6Var.f15749c;
                c6Var.f15749c = c6Var.d;
                c6Var.d = imageView;
                imageView.bringToFront();
                c6Var.d.setVisibility(8);
                c6Var.h = null;
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((h6) obj).f16073w = null;
                break;
            case 28:
                d7 d7Var = (d7) obj;
                if (d7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) d7Var.getParent()).removeView(d7Var);
                }
                break;
            case 29:
                ((k9) obj).J = false;
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f634a) {
            case 20:
                super.onAnimationStart(animator);
                w6 w6Var = (w6) this.f635b;
                oi0 oi0Var = ((v6) w6Var.f14095a.get(w6Var.d)).f14052c;
                oi0Var.I = 2;
                oi0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
