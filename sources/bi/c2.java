package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.z41;
public final class c2 implements x10 {
    public final int f3453a;
    public final j3 f3454b;

    public c2(j3 j3Var, int i7) {
        this.f3453a = i7;
        this.f3454b = j3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3453a) {
            case 0:
                this.f3454b.f3742v2.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                return;
            default:
                List list = (List) obj;
                j3 j3Var = this.f3454b;
                if (j3Var.getContext() != null && !j3Var.J) {
                    ArrayList b10 = wg.s.b(1, list);
                    j3Var.V1 = b10;
                    List c10 = wg.s.c(b10);
                    j3Var.V1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        j3Var.h1();
                        z41 z41Var = j3Var.U1;
                        if (z41Var != null) {
                            z41Var.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
