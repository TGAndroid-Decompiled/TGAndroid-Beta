package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class z36 implements View.OnClickListener {
    public final a46 a;

    public z36(a46 a46Var) {
        this.a = a46Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((jb) view.getParent()).getCurrentChannel());
        i46 i46Var = this.a.c;
        int i = i46.R2;
        i46Var.o1(arrayList);
    }
}
