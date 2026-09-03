package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class n0 extends e2 implements p0 {
    public CharSequence P;
    public k0 Q;
    public final Rect R;
    public int S;
    public final q0 T;

    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.T = q0Var;
        this.R = new Rect();
        this.B = q0Var;
        this.K = true;
        this.L.setFocusable(true);
        this.C = new l0(this, 0);
    }

    @Override
    public final CharSequence e() {
        return this.P;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.P = charSequence;
    }

    @Override
    public final void l(int i10) {
        this.S = i10;
    }

    @Override
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        x xVar = this.L;
        boolean isShowing = xVar.isShowing();
        s();
        xVar.setInputMethodMode(2);
        g();
        s1 s1Var = this.f13476c;
        s1Var.setChoiceMode(1);
        g0.d(s1Var, i10);
        g0.c(s1Var, i11);
        q0 q0Var = this.T;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        s1 s1Var2 = this.f13476c;
        if (xVar.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = q0Var.getViewTreeObserver()) != null) {
            androidx.mediarouter.app.k kVar = new androidx.mediarouter.app.k(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(kVar);
            xVar.setOnDismissListener(new m0(this, kVar));
        }
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.Q = (k0) listAdapter;
    }

    public final void s() {
        int i10;
        int i11;
        q0 q0Var = this.T;
        Rect rect = q0Var.f13594n;
        x xVar = this.L;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            if (v3.a(q0Var)) {
                i10 = rect.right;
            } else {
                i10 = -rect.left;
            }
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i12 = q0Var.h;
        if (i12 == -2) {
            int a2 = q0Var.a(this.Q, xVar.getBackground());
            int i13 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i13) {
                a2 = i13;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i12);
        }
        if (v3.a(q0Var)) {
            i11 = (((width - paddingRight) - this.e) - this.S) + i10;
        } else {
            i11 = paddingLeft + this.S + i10;
        }
        this.f13477f = i11;
    }
}
