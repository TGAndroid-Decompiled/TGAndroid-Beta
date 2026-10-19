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
    public final CharSequence e() {
        return this.S;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override
    public final void l(int i10) {
        this.V = i10;
    }

    @Override
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.O;
        boolean isShowing = yVar.isShowing();
        s();
        yVar.setInputMethodMode(2);
        g();
        s1 s1Var = this.f16188c;
        s1Var.setChoiceMode(1);
        h0.d(s1Var, i10);
        h0.c(s1Var, i11);
        q0 q0Var = this.W;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        s1 s1Var2 = this.f16188c;
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
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.T = (k0) listAdapter;
    }

    public final void s() {
        int i10;
        int i11;
        q0 q0Var = this.W;
        Rect rect = q0Var.f16306n;
        y yVar = this.O;
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
            int a2 = q0Var.a(this.T, yVar.getBackground());
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
            i11 = (((width - paddingRight) - this.e) - this.V) + i10;
        } else {
            i11 = paddingLeft + this.V + i10;
        }
        this.f16189f = i11;
    }
}
