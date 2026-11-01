package kg;

import android.view.View;
import java.util.ArrayList;
public final class i0 implements View.OnClickListener {
    public final j0 f11110a;

    public i0(j0 j0Var) {
        this.f11110a = j0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.m) view.getParent()).getCurrentChannel());
        q0 q0Var = this.f11110a.f11131c;
        int i10 = q0.O2;
        q0Var.x1(arrayList);
    }
}
