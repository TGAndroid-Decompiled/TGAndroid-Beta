package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class cq extends o56 implements eq {
    public CharSequence T;
    public zp U;
    public final Rect V;
    public int W;
    public final fq X;

    public cq(fq fqVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.X = fqVar;
        this.V = new Rect();
        this.F = fqVar;
        this.O = true;
        this.P.setFocusable(true);
        this.G = new aq(this, (byte) 0);
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
    public final void l(int i) {
        this.W = i;
    }

    @Override
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        np npVar = this.P;
        boolean isShowing = npVar.isShowing();
        s();
        npVar.setInputMethodMode(2);
        f();
        er3 er3Var = this.c;
        er3Var.setChoiceMode(1);
        wp.d(er3Var, i);
        wp.c(er3Var, i2);
        fq fqVar = this.X;
        int selectedItemPosition = fqVar.getSelectedItemPosition();
        er3 er3Var2 = this.c;
        if (npVar.isShowing() && er3Var2 != null) {
            er3Var2.setListSelectionHidden(false);
            er3Var2.setSelection(selectedItemPosition);
            if (er3Var2.getChoiceMode() != 0) {
                er3Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = fqVar.getViewTreeObserver()) != null) {
            up upVar = new up(this, (byte) 1);
            viewTreeObserver.addOnGlobalLayoutListener(upVar);
            npVar.setOnDismissListener(new bq(this, upVar, (byte) 0));
        }
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.U = (zp) listAdapter;
    }

    public final void s() {
        int i;
        int i2;
        np npVar = this.P;
        Drawable background = npVar.getBackground();
        fq fqVar = this.X;
        Rect rect = fqVar.n;
        if (background != null) {
            background.getPadding(rect);
            if (gfc.a(fqVar)) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = fqVar.getPaddingLeft();
        int paddingRight = fqVar.getPaddingRight();
        int width = fqVar.getWidth();
        int i3 = fqVar.h;
        if (i3 == -2) {
            int a = fqVar.a(this.U, npVar.getBackground());
            int i4 = (fqVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i4) {
                a = i4;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        if (gfc.a(fqVar)) {
            i2 = (((width - paddingRight) - this.e) - this.W) + i;
        } else {
            i2 = paddingLeft + this.W + i;
        }
        this.f = i2;
    }
}
