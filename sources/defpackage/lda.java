package defpackage;

import android.view.View;
public final class lda implements View.OnLayoutChangeListener {
    public final nfa a;

    public lda(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        r7 r7Var = this.a.q0;
        if (r7Var == null) {
            return;
        }
        r7Var.setTranslationX(((View) r7Var.getParent()).getMeasuredWidth() - r7Var.getRight());
    }
}
