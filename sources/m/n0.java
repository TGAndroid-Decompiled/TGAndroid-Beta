package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class n0 extends e2 implements p0 {
    public CharSequence S;
    public k0 T;
    public final Rect U;
    public int V;
    public final q0 W;

    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.W = q0Var;
        this.U = new Rect();
        this.E = q0Var;
        this.N = true;
        this.O.setFocusable(true);
        this.F = new l0(this, 0);
    }

    @Override
    public final CharSequence d() {
        return this.S;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override
    public final void k(int i7) {
        this.V = i7;
    }

    @Override
    public final void l(int i7, int i10) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.O;
        boolean isShowing = yVar.isShowing();
        q();
        yVar.setInputMethodMode(2);
        g();
        s1 s1Var = this.f19087c;
        s1Var.setChoiceMode(1);
        h0.d(s1Var, i7);
        h0.c(s1Var, i10);
        q0 q0Var = this.W;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        s1 s1Var2 = this.f19087c;
        if (yVar.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = q0Var.getViewTreeObserver()) != null) {
            androidx.mediarouter.app.i iVar = new androidx.mediarouter.app.i(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(iVar);
            yVar.setOnDismissListener(new m0(this, iVar));
        }
    }

    @Override
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.T = (k0) listAdapter;
    }

    public final void q() {
        int i7;
        int i10;
        q0 q0Var = this.W;
        Rect rect = q0Var.f19222n;
        y yVar = this.O;
        Drawable background = yVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            if (t3.a(q0Var)) {
                i7 = rect.right;
            } else {
                i7 = -rect.left;
            }
        } else {
            i7 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i11 = q0Var.h;
        if (i11 == -2) {
            int a10 = q0Var.a(this.T, yVar.getBackground());
            int i12 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a10 > i12) {
                a10 = i12;
            }
            p(Math.max(a10, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i11);
        }
        if (t3.a(q0Var)) {
            i10 = (((width - paddingRight) - this.f19088e) - this.V) + i7;
        } else {
            i10 = paddingLeft + this.V + i7;
        }
        this.f19089f = i10;
    }
}
