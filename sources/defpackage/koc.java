package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class koc extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public koc(Object obj, byte b) {
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
                moc mocVar = (moc) obj;
                mocVar.O = 0.0f;
                mocVar.P = 0.0f;
                mocVar.c0 = null;
                return;
            case 1:
                npc npcVar = (npc) obj;
                npcVar.J = null;
                npcVar.j0 = 1.0f;
                npcVar.i0 = 0.0f;
                npcVar.h0 = 0.0f;
                npcVar.b();
                return;
            case 2:
                brc brcVar = (brc) obj;
                EditTextBoldCursor editTextBoldCursor = brcVar.b;
                if (brcVar.s == animator) {
                    brcVar.s = null;
                    View view = brcVar.a;
                    if (brcVar.E) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    view.setVisibility(i);
                    if (!brcVar.E) {
                        i3 = 4;
                    }
                    editTextBoldCursor.setVisibility(i3);
                    if (brcVar.E && !brcVar.F) {
                        editTextBoldCursor.requestFocus();
                        gm.E3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                qrc qrcVar = (qrc) obj;
                qrcVar.n = null;
                npc npcVar2 = qrcVar.d;
                if (qrcVar.x) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                npcVar2.setVisibility(i2);
                TextView textView = qrcVar.f;
                if (!qrcVar.y) {
                    i3 = 4;
                }
                textView.setVisibility(i3);
                return;
            case 4:
                ((tvc) obj).f0 = null;
                return;
            case 5:
                ((uwc) ((sv) obj).b).c.setVisibility(4);
                return;
            default:
                ((b1d) obj).L = null;
                return;
        }
    }
}
