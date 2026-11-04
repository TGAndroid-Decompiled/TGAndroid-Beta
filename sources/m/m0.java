package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class m0 extends d2 implements o0 {
    public CharSequence T;
    public j0 U;
    public final Rect V;
    public int W;
    public final p0 X;

    public m0(p0 p0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.X = p0Var;
        this.V = new Rect();
        this.F = p0Var;
        this.O = true;
        this.P.setFocusable(true);
        this.G = new k0(this, 0);
    }

    @Override
    public final CharSequence e() {
        return this.T;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override
    public final void l(int i3) {
        this.W = i3;
    }

    @Override
    public final void m(int i3, int i10) {
        ViewTreeObserver viewTreeObserver;
        x xVar = this.P;
        boolean isShowing = xVar.isShowing();
        r();
        xVar.setInputMethodMode(2);
        g();
        r1 r1Var = this.f18560c;
        r1Var.setChoiceMode(1);
        g0.d(r1Var, i3);
        g0.c(r1Var, i10);
        p0 p0Var = this.X;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        r1 r1Var2 = this.f18560c;
        if (xVar.isShowing() && r1Var2 != null) {
            r1Var2.setListSelectionHidden(false);
            r1Var2.setSelection(selectedItemPosition);
            if (r1Var2.getChoiceMode() != 0) {
                r1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = p0Var.getViewTreeObserver()) != null) {
            androidx.mediarouter.app.i iVar = new androidx.mediarouter.app.i(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(iVar);
            xVar.setOnDismissListener(new l0(this, iVar));
        }
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.U = (j0) listAdapter;
    }

    public final void r() {
        int i3;
        int i10;
        p0 p0Var = this.X;
        Rect rect = p0Var.f18699n;
        x xVar = this.P;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            if (r3.a(p0Var)) {
                i3 = rect.right;
            } else {
                i3 = -rect.left;
            }
        } else {
            i3 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = p0Var.getPaddingLeft();
        int paddingRight = p0Var.getPaddingRight();
        int width = p0Var.getWidth();
        int i11 = p0Var.h;
        if (i11 == -2) {
            int a10 = p0Var.a(this.U, xVar.getBackground());
            int i12 = (p0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a10 > i12) {
                a10 = i12;
            }
            q(Math.max(a10, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i11);
        }
        if (r3.a(p0Var)) {
            i10 = (((width - paddingRight) - this.f18561e) - this.W) + i3;
        } else {
            i10 = paddingLeft + this.W + i3;
        }
        this.f18562f = i10;
    }
}
