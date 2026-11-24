package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.r;
public final class clb extends AnimatorListenerAdapter {
    public final byte a;
    public final ThemeEditorView b;

    public clb(ThemeEditorView themeEditorView, byte b) {
        this.a = b;
        this.b = themeEditorView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ThemeEditorView themeEditorView = this.b;
        switch (b) {
            case 0:
                r rVar = themeEditorView.c;
                if (rVar != null) {
                    rVar.setBackground(null);
                    themeEditorView.j.removeView(themeEditorView.c);
                    return;
                }
                return;
            default:
                bkb.v1(themeEditorView.o, true, false, false);
                themeEditorView.a();
                return;
        }
    }
}
