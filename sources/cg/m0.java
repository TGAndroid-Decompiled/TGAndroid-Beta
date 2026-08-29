package cg;

import android.view.View;
import java.util.ArrayList;
public final class m0 implements View.OnClickListener {
    public final n0 f3213a;

    public m0(n0 n0Var) {
        this.f3213a = n0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        v0 v0Var = this.f3213a.f3224c;
        int i10 = v0.R0;
        v0Var.D1(arrayList);
    }
}
