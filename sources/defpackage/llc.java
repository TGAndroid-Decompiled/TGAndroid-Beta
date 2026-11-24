package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class llc extends AnimatorListenerAdapter {
    public final rc2 a;
    public final h22 b;
    public final mlc c;

    public llc(mlc mlcVar, rc2 rc2Var, h22 h22Var) {
        this.c = mlcVar;
        this.a = rc2Var;
        this.b = h22Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        h22 h22Var = this.b;
        mlc mlcVar = this.c;
        ((ArrayList) h22Var.c).remove(mlcVar);
        h22Var.a();
        ((ViewGroup) h22Var.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mlcVar.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
