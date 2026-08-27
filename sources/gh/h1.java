package gh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b51;

public final class h1 implements Utilities.Callback {

    public final int f7281a;

    public final k2 f7282b;

    public h1(k2 k2Var, int i10) {
        this.f7281a = i10;
        this.f7282b = k2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7281a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                k2 k2Var = this.f7282b;
                if (k2Var.f7394o0 != iIntValue) {
                    k2Var.f7394o0 = iIntValue;
                    k2Var.f7387g0.g();
                    k2Var.U.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                k2 k2Var2 = this.f7282b;
                if (k2Var2.getContext() != null && k2Var2.isShown()) {
                    ArrayList arrayListB = cg.q0.b(1, list);
                    k2Var2.V = arrayListB;
                    List listC = cg.q0.c(arrayListB);
                    k2Var2.V = listC;
                    if (!((ArrayList) listC).isEmpty()) {
                        k2Var2.W();
                        b51 b51Var = k2Var2.U;
                        if (b51Var != null) {
                            b51Var.N(true);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
