package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.d20;
import org.telegram.messenger.ej;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.sk0;
import vh.j4;
import vh.s3;
public final class f1 extends sk0 {
    public final Context f9963c;
    public final s9 d;
    public final j4 e;
    public final boolean f9964f;
    public final s3 h;

    public f1(s3 s3Var, Context context, s9 s9Var, j4 j4Var, boolean z10) {
        this.h = s3Var;
        this.f9963c = context;
        this.d = s9Var;
        this.e = j4Var;
        this.f9964f = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f10057s0.size();
    }

    @Override
    public final int d(int i10) {
        ArrayList arrayList = this.h.f10057s0;
        return ((jj) arrayList.get((arrayList.size() - 1) - i10)).U;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        bj d;
        boolean z12;
        s3 s3Var = this.h;
        ArrayList arrayList = s3Var.f10057s0;
        jj jjVar = (jj) arrayList.get((arrayList.size() - 1) - i10);
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            ej ejVar = s3Var.f10058t0;
            if (ejVar != null && (d = ejVar.d(jjVar)) != null) {
                if (d.f14777c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            ej ejVar2 = s3Var.f10058t0;
            if (ejVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            q1Var.s3(jjVar, ejVar2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) view).setMessageObject(jjVar);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        i1 i1Var = this.h.D0;
        Context context = this.f9963c;
        if (i10 == 1) {
            return new s4.c1(new d1(this, context, i1Var));
        }
        e1 e1Var = new e1(this, context, d20.f15147s0, i1Var);
        e1Var.f22532d6 = true;
        return new s4.c1(e1Var);
    }
}
