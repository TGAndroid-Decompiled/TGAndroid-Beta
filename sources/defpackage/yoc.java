package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yoc extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public yoc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        byte b = this.a;
        int i3 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                zoc zocVar = (zoc) obj;
                EditTextBoldCursor editTextBoldCursor = zocVar.b;
                if (zocVar.s == animator) {
                    zocVar.s = null;
                    View view = zocVar.a;
                    if (zocVar.E) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    view.setVisibility(i);
                    if (!zocVar.E) {
                        i3 = 4;
                    }
                    editTextBoldCursor.setVisibility(i3);
                    if (zocVar.E && !zocVar.F) {
                        editTextBoldCursor.requestFocus();
                        gl.F3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ppc ppcVar = (ppc) obj;
                ppcVar.n = null;
                lnc lncVar = ppcVar.d;
                if (ppcVar.x) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                lncVar.setVisibility(i2);
                TextView textView = ppcVar.f;
                if (!ppcVar.y) {
                    i3 = 4;
                }
                textView.setVisibility(i3);
                return;
            case 2:
                ((stc) obj).f0 = null;
                return;
            case 3:
                ((tuc) ((su) obj).b).c.setVisibility(4);
                return;
            default:
                ((azc) obj).L = null;
                return;
        }
    }
}
