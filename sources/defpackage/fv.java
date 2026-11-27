package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class fv extends HorizontalScrollView {
    public final xi5 a;
    public final hv b;

    public fv(hv hvVar, Activity activity, xi5 xi5Var) {
        super(activity);
        this.b = hvVar;
        this.a = xi5Var;
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        hv hvVar;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i, i2, i3, i4);
        xi5 xi5Var = this.a;
        if (xi5Var.d != null) {
            xi5Var.d = null;
            xi5Var.f = null;
        }
        hv hvVar2 = this.b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = hvVar2.f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !hvVar2.n) {
            ex exVar = hvVar2.b;
            if (exVar != null) {
                exVar.I = i;
            }
            if (hvVar2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) hvVar2.getParent();
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (childAt != hvVar2 && (childAt instanceof hv) && (pageblockpreformatted = (hvVar = (hv) childAt).f) != null && pageblockpreformatted.diff) {
                        hvVar.n = true;
                        hvVar.d.scrollTo(i, 0);
                        hvVar.n = false;
                    }
                }
            }
        }
    }
}
