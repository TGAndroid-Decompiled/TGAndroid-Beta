package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class n0 extends e2 implements p0 {
    public CharSequence O;
    public k0 P;
    public final Rect Q;
    public int R;
    public final q0 S;

    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.S = q0Var;
        this.Q = new Rect();
        this.A = q0Var;
        this.J = true;
        this.K.setFocusable(true);
        this.B = new l0(this, 0);
    }

    @Override
    public final CharSequence d() {
        return this.O;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.O = charSequence;
    }

    @Override
    public final void l(int i10) {
        this.R = i10;
    }

    @Override
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.K;
        boolean isShowing = yVar.isShowing();
        s();
        yVar.setInputMethodMode(2);
        h();
        s1 s1Var = this.f16531c;
        s1Var.setChoiceMode(1);
        h0.d(s1Var, i10);
        h0.c(s1Var, i11);
        q0 q0Var = this.S;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        s1 s1Var2 = this.f16531c;
        if (yVar.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = q0Var.getViewTreeObserver()) != null) {
            androidx.mediarouter.app.h hVar = new androidx.mediarouter.app.h(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(hVar);
            yVar.setOnDismissListener(new m0(this, hVar));
        }
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.P = (k0) listAdapter;
    }

    public final void s() {
        int i10;
        int i11;
        q0 q0Var = this.S;
        Rect rect = q0Var.f16656n;
        y yVar = this.K;
        Drawable background = yVar.getBackground();
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
            int a2 = q0Var.a(this.P, yVar.getBackground());
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
            i11 = (((width - paddingRight) - this.f16532e) - this.R) + i10;
        } else {
            i11 = paddingLeft + this.R + i10;
        }
        this.f16533f = i11;
    }
}
