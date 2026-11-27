package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class c46 implements View.OnClickListener {
    public final d46 a;

    public c46(d46 d46Var) {
        this.a = d46Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((kb) view.getParent()).getCurrentChannel());
        l46 l46Var = this.a.c;
        int i = l46.R2;
        l46Var.p1(arrayList);
    }
}
