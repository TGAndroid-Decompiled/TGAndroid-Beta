package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class y16 implements View.OnClickListener {
    public final z16 a;

    public y16(z16 z16Var) {
        this.a = z16Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((jb) view.getParent()).getCurrentChannel());
        h26 h26Var = this.a.c;
        int i = h26.R2;
        h26Var.o1(arrayList);
    }
}
