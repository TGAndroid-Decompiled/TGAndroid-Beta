package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xnc extends AnimatorListenerAdapter {
    public final wb2 a;
    public final m12 b;
    public final ync c;

    public xnc(ync yncVar, wb2 wb2Var, m12 m12Var) {
        this.c = yncVar;
        this.a = wb2Var;
        this.b = m12Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        m12 m12Var = this.b;
        ync yncVar = this.c;
        ((ArrayList) m12Var.c).remove(yncVar);
        m12Var.a();
        ((ViewGroup) m12Var.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = yncVar.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
