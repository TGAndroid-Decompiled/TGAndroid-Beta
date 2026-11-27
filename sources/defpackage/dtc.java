package defpackage;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
public final class dtc implements pcc {
    public final byte a;
    public final gtc b;
    public final l01 c;

    public dtc(gtc gtcVar, l01 l01Var, byte b) {
        this.a = b;
        this.b = gtcVar;
        this.c = l01Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        l01 l01Var = this.c;
        gtc gtcVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                l01Var.c(false);
                if (str != null) {
                    d31.b0(gtcVar).f0(str, false);
                    return;
                }
                wk5 parentLayout = gtcVar.getParentLayout();
                if (parentLayout == null) {
                    gtcVar.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    e eVar = (e) obj2;
                    if ((eVar instanceof muc) || (eVar instanceof ntc) || (eVar instanceof tuc) || (eVar instanceof gtc)) {
                        ((ActionBarLayout) parentLayout).c0(eVar, false);
                    }
                }
                gtcVar.finishFragment();
                return;
            default:
                l01Var.c(false);
                wk5 parentLayout2 = gtcVar.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        e eVar2 = (e) obj3;
                        if ((eVar2 instanceof muc) || (eVar2 instanceof ntc) || (eVar2 instanceof tuc)) {
                            ((ActionBarLayout) parentLayout2).c0(eVar2, false);
                        }
                    }
                }
                if (str != null) {
                    d31.b0(gtcVar).f0(str, false);
                    return;
                }
                v21 I = d31.b0(gtcVar).I(2131623990, ob6.M0(2131742842, null), ob6.M0(2131742840, null));
                I.j = 5000;
                I.j();
                return;
        }
    }
}
