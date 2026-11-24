package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class cr extends o76 implements er {
    public CharSequence T;
    public zq U;
    public final Rect V;
    public int W;
    public final fr X;

    public cr(fr frVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.X = frVar;
        this.V = new Rect();
        this.F = frVar;
        this.O = true;
        this.P.setFocusable(true);
        this.G = new ar(this, (byte) 0);
    }

    @Override
    public final CharSequence d() {
        return this.T;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override
    public final void k(int i) {
        this.W = i;
    }

    @Override
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        nq nqVar = this.P;
        boolean isShowing = nqVar.isShowing();
        q();
        nqVar.setInputMethodMode(2);
        f();
        os3 os3Var = this.c;
        os3Var.setChoiceMode(1);
        wq.d(os3Var, i);
        wq.c(os3Var, i2);
        fr frVar = this.X;
        int selectedItemPosition = frVar.getSelectedItemPosition();
        os3 os3Var2 = this.c;
        if (nqVar.isShowing() && os3Var2 != null) {
            os3Var2.setListSelectionHidden(false);
            os3Var2.setSelection(selectedItemPosition);
            if (os3Var2.getChoiceMode() != 0) {
                os3Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = frVar.getViewTreeObserver()) != null) {
            uq uqVar = new uq(this, (byte) 1);
            viewTreeObserver.addOnGlobalLayoutListener(uqVar);
            nqVar.setOnDismissListener(new br(this, uqVar, (byte) 0));
        }
    }

    @Override
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.U = (zq) listAdapter;
    }

    public final void q() {
        int i;
        int i2;
        nq nqVar = this.P;
        Drawable background = nqVar.getBackground();
        fr frVar = this.X;
        Rect rect = frVar.n;
        if (background != null) {
            background.getPadding(rect);
            if (ghc.a(frVar)) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = frVar.getPaddingLeft();
        int paddingRight = frVar.getPaddingRight();
        int width = frVar.getWidth();
        int i3 = frVar.h;
        if (i3 == -2) {
            int a = frVar.a(this.U, nqVar.getBackground());
            int i4 = (frVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i4) {
                a = i4;
            }
            p(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i3);
        }
        if (ghc.a(frVar)) {
            i2 = (((width - paddingRight) - this.e) - this.W) + i;
        } else {
            i2 = paddingLeft + this.W + i;
        }
        this.f = i2;
    }
}
