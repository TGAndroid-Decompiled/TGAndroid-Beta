package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class m0 extends d2 implements o0 {
    public CharSequence S;
    public j0 T;
    public final Rect U;
    public int V;
    public final p0 W;

    public m0(p0 p0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.W = p0Var;
        this.U = new Rect();
        this.E = p0Var;
        this.N = true;
        this.O.setFocusable(true);
        this.F = new k0(this, 0);
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
        x xVar = this.O;
        boolean isShowing = xVar.isShowing();
        s();
        xVar.setInputMethodMode(2);
        g();
        r1 r1Var = this.f15499c;
        r1Var.setChoiceMode(1);
        g0.d(r1Var, i10);
        g0.c(r1Var, i11);
        p0 p0Var = this.W;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        r1 r1Var2 = this.f15499c;
        if (xVar.isShowing() && r1Var2 != null) {
            r1Var2.setListSelectionHidden(false);
            r1Var2.setSelection(selectedItemPosition);
            if (r1Var2.getChoiceMode() != 0) {
                r1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = p0Var.getViewTreeObserver()) != null) {
            androidx.mediarouter.app.j jVar = new androidx.mediarouter.app.j(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(jVar);
            xVar.setOnDismissListener(new l0(this, jVar));
        }
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.T = (j0) listAdapter;
    }

    public final void s() {
        int i10;
        int i11;
        p0 p0Var = this.W;
        Rect rect = p0Var.f15631n;
        x xVar = this.O;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            if (s3.a(p0Var)) {
                i10 = rect.right;
            } else {
                i10 = -rect.left;
            }
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = p0Var.getPaddingLeft();
        int paddingRight = p0Var.getPaddingRight();
        int width = p0Var.getWidth();
        int i12 = p0Var.h;
        if (i12 == -2) {
            int a2 = p0Var.a(this.T, xVar.getBackground());
            int i13 = (p0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i13) {
                a2 = i13;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i12);
        }
        if (s3.a(p0Var)) {
            i11 = (((width - paddingRight) - this.f15500e) - this.V) + i10;
        } else {
            i11 = paddingLeft + this.V + i10;
        }
        this.f15501f = i11;
    }
}
