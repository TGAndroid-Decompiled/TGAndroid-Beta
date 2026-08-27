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
    public final void l(int i10) {
        this.R = i10;
    }

    @Override
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.K;
        boolean zIsShowing = yVar.isShowing();
        r();
        yVar.setInputMethodMode(2);
        g();
        s1 s1Var = this.f17307c;
        s1Var.setChoiceMode(1);
        h0.d(s1Var, i10);
        h0.c(s1Var, i11);
        q0 q0Var = this.S;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        s1 s1Var2 = this.f17307c;
        if (yVar.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = q0Var.getViewTreeObserver()) == null) {
            return;
        }
        l.d dVar = new l.d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        yVar.setOnDismissListener(new m0(this, dVar));
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.P = (k0) listAdapter;
    }

    public final void r() {
        int i10;
        q0 q0Var = this.S;
        Rect rect = q0Var.f17434n;
        y yVar = this.K;
        Drawable background = yVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i10 = w3.a(q0Var) ? rect.right : -rect.left;
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i11 = q0Var.h;
        if (i11 == -2) {
            int iA = q0Var.a(this.P, yVar.getBackground());
            int i12 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i12) {
                iA = i12;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i11);
        }
        this.f17309f = w3.a(q0Var) ? (((width - paddingRight) - this.f17308e) - this.R) + i10 : paddingLeft + this.R + i10;
    }
}
