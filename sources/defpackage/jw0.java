package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class jw0 implements View.OnLayoutChangeListener {
    public final byte a;
    public final Object b;

    public jw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        byte b = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                xw0 xw0Var = (xw0) obj;
                yp0 yp0Var = xw0Var.o0;
                ow0 ow0Var = xw0Var.x;
                ow0Var.setSwipeOffsetY(ow0Var.getHeight());
                xw0Var.f.setAlpha(1.0f);
                if (xw0Var.I0 != Float.MAX_VALUE) {
                    ow0Var.setSwipeOffsetAnimationDisallowed(true);
                    ow0Var.setOffsetY(xw0Var.I0);
                    ow0Var.setSwipeOffsetAnimationDisallowed(false);
                }
                xw0Var.E.l(true, true);
                pn pnVar = new pn(null);
                pnVar.d();
                if (!xw0Var.H0 && !xw0Var.p()) {
                    vpa vpaVar = new vpa((Object) ow0Var, (vk4) i22.c0, 0.0f);
                    wpa wpaVar = new wpa(0.0f);
                    wpaVar.a(0.75f);
                    wpaVar.b(500.0f);
                    vpaVar.m = wpaVar;
                    vpaVar.a(new iw0(pnVar, (byte) 0));
                    vpaVar.h();
                } else {
                    ow0Var.e(ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY()), false, new fv0(pnVar, (byte) 3));
                }
                ow0Var.L = true;
                if (xw0Var.f0 && yp0Var != null) {
                    yp0Var.setAlpha(0.0f);
                    yp0Var.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            case 1:
                ((g41) obj).l0();
                return;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
                View view2 = searchView.O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.I.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a = fjc.a(searchView);
                    if (searchView.g0) {
                        i10 = resources.getDimensionPixelSize(2131165225) + resources.getDimensionPixelSize(2131165226);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i11 = rect.left;
                    if (a) {
                        i9 = -i11;
                    } else {
                        i9 = paddingLeft - (i11 + i10);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i9);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
