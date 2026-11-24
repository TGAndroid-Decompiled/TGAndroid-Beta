package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class i85 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final View b;
    public final ViewGroup c;
    public final FrameLayout d;
    public final Object e;
    public final Object f;

    public i85(ohb ohbVar, w02 w02Var, gb2 gb2Var, ar1 ar1Var, mu1 mu1Var) {
        this.f = ohbVar;
        this.b = w02Var;
        this.c = gb2Var;
        this.d = ar1Var;
        this.e = mu1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.e;
        FrameLayout frameLayout = this.d;
        ViewGroup viewGroup = this.c;
        View view = this.b;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                yc ycVar = (yc) viewGroup;
                WindowManager windowManager = (WindowManager) obj;
                m85 m85Var = (m85) view;
                if (m85Var.getParent() != null) {
                    m85Var.setVisibility(8);
                    ycVar.setVisibility(8);
                    frameLayout.setVisibility(8);
                    windowManager.removeView(m85Var);
                    windowManager.removeView(ycVar);
                    windowManager.removeView(frameLayout);
                    windowManager.removeView((r71) obj2);
                    return;
                }
                return;
            default:
                ohb ohbVar = (ohb) obj2;
                ohbVar.E.e();
                w02 w02Var = (w02) view;
                ((ArrayList) w02Var.c).remove(ohbVar);
                w02Var.a();
                ((ViewGroup) w02Var.d).invalidate();
                gb2 gb2Var = (gb2) viewGroup;
                gb2Var.setEnterTransitionInProgress(false);
                gb2Var.getTransitionParams().E0.set(gb2Var.getBackgroundDrawableLeft(), gb2Var.getBackgroundDrawableTop(), gb2Var.getBackgroundDrawableRight(), gb2Var.getBackgroundDrawableBottom());
                ar1 ar1Var = (ar1) frameLayout;
                ar1Var.setTextTransitionIsRunning(false);
                ar1Var.getEditField().setAlpha(1.0f);
                mu1 mu1Var = (mu1) obj;
                ((pc2[]) mu1Var.c0.b)[0].c.setAlpha(1.0f);
                ((pc2[]) mu1Var.c0.b)[0].d.setAlpha(1.0f);
                gm.release((View) null, ohbVar.I);
                return;
        }
    }

    public i85(m85 m85Var, yc ycVar, FrameLayout frameLayout, WindowManager windowManager, r71 r71Var) {
        this.b = m85Var;
        this.c = ycVar;
        this.d = frameLayout;
        this.e = windowManager;
        this.f = r71Var;
    }
}
