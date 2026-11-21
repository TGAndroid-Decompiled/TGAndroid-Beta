package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.c51;
public final class g2 implements x10 {
    public final int f3634a;
    public final n3 f3635b;

    public g2(n3 n3Var, int i7) {
        this.f3634a = i7;
        this.f3635b = n3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3634a) {
            case 0:
                this.f3635b.f3930v2.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                return;
            default:
                List list = (List) obj;
                n3 n3Var = this.f3635b;
                if (n3Var.getContext() != null && !n3Var.J) {
                    ArrayList b10 = wg.s.b(1, list);
                    n3Var.V1 = b10;
                    List c10 = wg.s.c(b10);
                    n3Var.V1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        n3Var.h1();
                        c51 c51Var = n3Var.U1;
                        if (c51Var != null) {
                            c51Var.O(true);
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
