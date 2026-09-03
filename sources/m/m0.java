package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class m0 extends d2 implements o0 {
    public CharSequence P;
    public j0 Q;
    public final Rect R;
    public int S;
    public final p0 T;

    public m0(p0 p0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.T = p0Var;
        this.R = new Rect();
        this.B = p0Var;
        this.K = true;
        this.L.setFocusable(true);
        this.C = new k0(this, 0);
    }

    @Override
    public final CharSequence d() {
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
        r();
        xVar.setInputMethodMode(2);
        g();
        r1 r1Var = this.f13172c;
        r1Var.setChoiceMode(1);
        g0.d(r1Var, i10);
        g0.c(r1Var, i11);
        p0 p0Var = this.T;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        r1 r1Var2 = this.f13172c;
        if (xVar.isShowing() && r1Var2 != null) {
            r1Var2.setListSelectionHidden(false);
            r1Var2.setSelection(selectedItemPosition);
            if (r1Var2.getChoiceMode() != 0) {
                r1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = p0Var.getViewTreeObserver()) != null) {
            androidx.mediarouter.app.k kVar = new androidx.mediarouter.app.k(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(kVar);
            xVar.setOnDismissListener(new l0(this, kVar));
        }
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.Q = (j0) listAdapter;
    }

    public final void r() {
        int i10;
        int i11;
        p0 p0Var = this.T;
        Rect rect = p0Var.f13297n;
        x xVar = this.L;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            if (u3.a(p0Var)) {
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
            int a2 = p0Var.a(this.Q, xVar.getBackground());
            int i13 = (p0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i13) {
                a2 = i13;
            }
            q(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i12);
        }
        if (u3.a(p0Var)) {
            i11 = (((width - paddingRight) - this.f13173e) - this.S) + i10;
        } else {
            i11 = paddingLeft + this.S + i10;
        }
        this.f13174f = i11;
    }
}
