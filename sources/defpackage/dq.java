package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
public final class dq extends s76 implements fq {
    public CharSequence T;
    public aq U;
    public final Rect V;
    public int W;
    public final gq X;

    public dq(gq gqVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968938);
        this.X = gqVar;
        this.V = new Rect();
        this.F = gqVar;
        this.O = true;
        this.P.setFocusable(true);
        this.G = new bq(this, (byte) 0);
    }

    @Override
    public final CharSequence e() {
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
        op opVar = this.P;
        boolean isShowing = opVar.isShowing();
        q();
        opVar.setInputMethodMode(2);
        g();
        vr3 vr3Var = this.c;
        vr3Var.setChoiceMode(1);
        xp.d(vr3Var, i);
        xp.c(vr3Var, i2);
        gq gqVar = this.X;
        int selectedItemPosition = gqVar.getSelectedItemPosition();
        vr3 vr3Var2 = this.c;
        if (opVar.isShowing() && vr3Var2 != null) {
            vr3Var2.setListSelectionHidden(false);
            vr3Var2.setSelection(selectedItemPosition);
            if (vr3Var2.getChoiceMode() != 0) {
                vr3Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = gqVar.getViewTreeObserver()) != null) {
            vp vpVar = new vp(this, (byte) 1);
            viewTreeObserver.addOnGlobalLayoutListener(vpVar);
            opVar.setOnDismissListener(new cq(this, vpVar, (byte) 0));
        }
    }

    @Override
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.U = (aq) listAdapter;
    }

    public final void q() {
        int i;
        int i2;
        op opVar = this.P;
        Drawable background = opVar.getBackground();
        gq gqVar = this.X;
        Rect rect = gqVar.n;
        if (background != null) {
            background.getPadding(rect);
            if (fjc.a(gqVar)) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = gqVar.getPaddingLeft();
        int paddingRight = gqVar.getPaddingRight();
        int width = gqVar.getWidth();
        int i3 = gqVar.h;
        if (i3 == -2) {
            int a = gqVar.a(this.U, opVar.getBackground());
            int i4 = (gqVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i4) {
                a = i4;
            }
            p(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i3);
        }
        if (fjc.a(gqVar)) {
            i2 = (((width - paddingRight) - this.e) - this.W) + i;
        } else {
            i2 = paddingLeft + this.W + i;
        }
        this.f = i2;
    }
}
