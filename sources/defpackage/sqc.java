package defpackage;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
public final class sqc implements qac {
    public final byte a;
    public final vqc b;
    public final k11 c;

    public sqc(vqc vqcVar, k11 k11Var, byte b) {
        this.a = b;
        this.b = vqcVar;
        this.c = k11Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        k11 k11Var = this.c;
        vqc vqcVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                k11Var.c(false);
                if (str != null) {
                    c41.b0(vqcVar).f0(str, false);
                    return;
                }
                tk5 parentLayout = vqcVar.getParentLayout();
                if (parentLayout == null) {
                    vqcVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    d dVar = (d) obj2;
                    if ((dVar instanceof asc) || (dVar instanceof drc) || (dVar instanceof hsc) || (dVar instanceof vqc)) {
                        ((ActionBarLayout) parentLayout).c0(dVar, false);
                    }
                }
                vqcVar.finishFragment();
                return;
            default:
                k11Var.c(false);
                tk5 parentLayout2 = vqcVar.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        d dVar2 = (d) obj3;
                        if ((dVar2 instanceof asc) || (dVar2 instanceof drc) || (dVar2 instanceof hsc)) {
                            ((ActionBarLayout) parentLayout2).c0(dVar2, false);
                        }
                    }
                }
                if (str != null) {
                    c41.b0(vqcVar).f0(str, false);
                    return;
                }
                u31 I = c41.b0(vqcVar).I(2131623990, jb6.M0(2131742874, null), jb6.M0(2131742872, null));
                I.j = 5000;
                I.j();
                return;
        }
    }
}
