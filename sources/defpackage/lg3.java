package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class lg3 extends la {
    public final boolean d;
    public final ii3 e;

    public lg3(ii3 ii3Var, boolean z) {
        this.e = ii3Var;
        this.d = z;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z = this.d;
        ii3 ii3Var = this.e;
        if (z) {
            arrayList = ii3Var.E;
        } else {
            arrayList = ii3Var.y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        og3 og3Var = (og3) f89Var.a;
        og3Var.b = i;
        boolean z = this.d;
        ii3 ii3Var = this.e;
        if (z) {
            og3Var.setDialogId(((mg3) ii3Var.E.get(i)).c);
        } else {
            og3Var.setDialogId(((mg3) ii3Var.y.get(i)).c);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        og3 og3Var = new og3(this.e, viewGroup.getContext());
        boolean z = this.d;
        og3Var.O = z;
        if (z) {
            og3Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new f89(og3Var);
    }
}
