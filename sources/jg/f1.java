package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.e20;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.tk0;
import vh.j4;
import vh.s3;
public final class f1 extends tk0 {
    public final Context f9964c;
    public final s9 d;
    public final j4 e;
    public final boolean f9965f;
    public final s3 h;

    public f1(s3 s3Var, Context context, s9 s9Var, j4 j4Var, boolean z10) {
        this.h = s3Var;
        this.f9964c = context;
        this.d = s9Var;
        this.e = j4Var;
        this.f9965f = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f10058s0.size();
    }

    @Override
    public final int d(int i10) {
        ArrayList arrayList = this.h.f10058s0;
        return ((kj) arrayList.get((arrayList.size() - 1) - i10)).U;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        cj d;
        boolean z12;
        s3 s3Var = this.h;
        ArrayList arrayList = s3Var.f10058s0;
        kj kjVar = (kj) arrayList.get((arrayList.size() - 1) - i10);
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            fj fjVar = s3Var.f10059t0;
            if (fjVar != null && (d = fjVar.d(kjVar)) != null) {
                if (d.f15160c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            fj fjVar2 = s3Var.f10059t0;
            if (fjVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            q1Var.s3(kjVar, fjVar2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) view).setMessageObject(kjVar);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        i1 i1Var = this.h.D0;
        Context context = this.f9964c;
        if (i10 == 1) {
            return new s4.c1(new d1(this, context, i1Var));
        }
        e1 e1Var = new e1(this, context, e20.f15506s0, i1Var);
        e1Var.f22533d6 = true;
        return new s4.c1(e1Var);
    }
}
