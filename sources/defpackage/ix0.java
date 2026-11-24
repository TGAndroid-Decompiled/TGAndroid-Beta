package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class ix0 implements View.OnLayoutChangeListener {
    public final byte a;
    public final Object b;

    public ix0(Object obj, byte b) {
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
                wx0 wx0Var = (wx0) obj;
                yq0 yq0Var = wx0Var.o0;
                nx0 nx0Var = wx0Var.x;
                nx0Var.setSwipeOffsetY(nx0Var.getHeight());
                wx0Var.f.setAlpha(1.0f);
                if (wx0Var.I0 != Float.MAX_VALUE) {
                    nx0Var.setSwipeOffsetAnimationDisallowed(true);
                    nx0Var.setOffsetY(wx0Var.I0);
                    nx0Var.setSwipeOffsetAnimationDisallowed(false);
                }
                wx0Var.E.l(true, true);
                po poVar = new po(null);
                poVar.d();
                if (!wx0Var.H0 && !wx0Var.p()) {
                    zna znaVar = new zna((Object) nx0Var, (vk4) d32.c0, 0.0f);
                    aoa aoaVar = new aoa(0.0f);
                    aoaVar.a(0.75f);
                    aoaVar.b(500.0f);
                    znaVar.m = aoaVar;
                    znaVar.a(new hx0(poVar, (byte) 0));
                    znaVar.h();
                } else {
                    nx0Var.e(nx0Var.getTopActionBarOffsetY() + (-nx0Var.getOffsetY()), false, new yt0(poVar, (byte) 4));
                }
                nx0Var.L = true;
                if (wx0Var.f0 && yq0Var != null) {
                    yq0Var.setAlpha(0.0f);
                    yq0Var.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            case 1:
                ((f51) obj).m0();
                return;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
                View view2 = searchView.O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.I.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a = ghc.a(searchView);
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
