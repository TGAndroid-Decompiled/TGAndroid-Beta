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
    public final void h(CharSequence charSequence) {
        this.O = charSequence;
    }

    @Override
    public final void l(int i9) {
        this.R = i9;
    }

    @Override
    public final void m(int i9, int i10) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.K;
        boolean isShowing = yVar.isShowing();
        r();
        yVar.setInputMethodMode(2);
        g();
        s1 s1Var = this.f16932c;
        s1Var.setChoiceMode(1);
        h0.d(s1Var, i9);
        h0.c(s1Var, i10);
        q0 q0Var = this.S;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        s1 s1Var2 = this.f16932c;
        if (yVar.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = q0Var.getViewTreeObserver()) != null) {
            androidx.mediarouter.app.k kVar = new androidx.mediarouter.app.k(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(kVar);
            yVar.setOnDismissListener(new m0(this, kVar));
        }
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.P = (k0) listAdapter;
    }

    public final void r() {
        int i9;
        int i10;
        q0 q0Var = this.S;
        Rect rect = q0Var.f17059n;
        y yVar = this.K;
        Drawable background = yVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            if (w3.a(q0Var)) {
                i9 = rect.right;
            } else {
                i9 = -rect.left;
            }
        } else {
            i9 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i11 = q0Var.h;
        if (i11 == -2) {
            int a2 = q0Var.a(this.P, yVar.getBackground());
            int i12 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i12) {
                a2 = i12;
            }
            q(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i11);
        }
        if (w3.a(q0Var)) {
            i10 = (((width - paddingRight) - this.f16933e) - this.R) + i9;
        } else {
            i10 = paddingLeft + this.R + i9;
        }
        this.f16934f = i10;
    }
}
