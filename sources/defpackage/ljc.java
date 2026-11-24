package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ljc extends AnimatorListenerAdapter {
    public final gb2 a;
    public final w02 b;
    public final mjc c;

    public ljc(mjc mjcVar, gb2 gb2Var, w02 w02Var) {
        this.c = mjcVar;
        this.a = gb2Var;
        this.b = w02Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        w02 w02Var = this.b;
        mjc mjcVar = this.c;
        ((ArrayList) w02Var.c).remove(mjcVar);
        w02Var.a();
        ((ViewGroup) w02Var.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mjcVar.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
