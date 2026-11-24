package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class ia5 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final View b;
    public final ViewGroup c;
    public final FrameLayout d;
    public final Object e;
    public final Object f;

    public ia5(pjb pjbVar, h22 h22Var, rc2 rc2Var, ms1 ms1Var, yv1 yv1Var) {
        this.f = pjbVar;
        this.b = h22Var;
        this.c = rc2Var;
        this.d = ms1Var;
        this.e = yv1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        FrameLayout frameLayout = this.d;
        ViewGroup viewGroup = this.c;
        View view = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                yd ydVar = (yd) viewGroup;
                WindowManager windowManager = (WindowManager) obj2;
                ma5 ma5Var = (ma5) view;
                if (ma5Var.getParent() != null) {
                    ma5Var.setVisibility(8);
                    ydVar.setVisibility(8);
                    frameLayout.setVisibility(8);
                    windowManager.removeView(ma5Var);
                    windowManager.removeView(ydVar);
                    windowManager.removeView(frameLayout);
                    windowManager.removeView((z81) obj);
                    return;
                }
                return;
            default:
                yv1 yv1Var = (yv1) obj2;
                pjb pjbVar = (pjb) obj;
                pjbVar.E.e();
                h22 h22Var = (h22) view;
                ((ArrayList) h22Var.c).remove(pjbVar);
                h22Var.a();
                ((ViewGroup) h22Var.d).invalidate();
                rc2 rc2Var = (rc2) viewGroup;
                rc2Var.setEnterTransitionInProgress(false);
                rc2Var.getTransitionParams().E0.set(rc2Var.getBackgroundDrawableLeft(), rc2Var.getBackgroundDrawableTop(), rc2Var.getBackgroundDrawableRight(), rc2Var.getBackgroundDrawableBottom());
                ms1 ms1Var = (ms1) frameLayout;
                ms1Var.setTextTransitionIsRunning(false);
                ms1Var.getEditField().setAlpha(1.0f);
                mw1 mw1Var = ms1Var.M6;
                if (ms1Var.L6) {
                    gm.r(mw1Var);
                    mw1Var.run();
                }
                ((ae2[]) yv1Var.c0.b)[0].c.setAlpha(1.0f);
                ((ae2[]) yv1Var.c0.b)[0].d.setAlpha(1.0f);
                gn.release((View) null, pjbVar.I);
                return;
        }
    }

    public ia5(ma5 ma5Var, yd ydVar, FrameLayout frameLayout, WindowManager windowManager, z81 z81Var) {
        this.b = ma5Var;
        this.c = ydVar;
        this.d = frameLayout;
        this.e = windowManager;
        this.f = z81Var;
    }
}
