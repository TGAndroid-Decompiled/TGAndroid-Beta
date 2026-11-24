package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class ew extends HorizontalScrollView {
    public final ui5 a;
    public final gw b;

    public ew(gw gwVar, Activity activity, ui5 ui5Var) {
        super(activity);
        this.b = gwVar;
        this.a = ui5Var;
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        gw gwVar;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i, i2, i3, i4);
        ui5 ui5Var = this.a;
        if (ui5Var.d != null) {
            ui5Var.d = null;
            ui5Var.f = null;
        }
        gw gwVar2 = this.b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = gwVar2.f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !gwVar2.n) {
            ey eyVar = gwVar2.b;
            if (eyVar != null) {
                eyVar.I = i;
            }
            if (gwVar2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) gwVar2.getParent();
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (childAt != gwVar2 && (childAt instanceof gw) && (pageblockpreformatted = (gwVar = (gw) childAt).f) != null && pageblockpreformatted.diff) {
                        gwVar.n = true;
                        gwVar.d.scrollTo(i, 0);
                        gwVar.n = false;
                    }
                }
            }
        }
    }
}
