package ag;

import android.view.View;
import java.util.ArrayList;

public final class y0 implements View.OnClickListener {

    public final z0 f704a;

    public y0(z0 z0Var) {
        this.f704a = z0Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar.getCurrentChannel());
        i1 i1Var = this.f704a.f736c;
        int i10 = i1.R0;
        i1Var.D1(arrayList);
    }
}
