package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ColorPicker$RadioButton;
import org.telegram.ui.Components.p;
public final class fm2 extends AnimatorListenerAdapter {
    public final byte a;
    public final p b;

    public fm2(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                if (pVar.L == pVar.M) {
                    pVar.H.setVisibility(4);
                }
                pVar.E = null;
                return;
            default:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = pVar.w;
                if (pVar.L == 1) {
                    pVar.G.setVisibility(4);
                }
                for (int i = 0; i < colorPicker$RadioButtonArr.length; i++) {
                    if (colorPicker$RadioButtonArr[i].getTag(2131296463) == null) {
                        colorPicker$RadioButtonArr[i].setVisibility(4);
                    }
                }
                pVar.E = null;
                return;
        }
    }
}
