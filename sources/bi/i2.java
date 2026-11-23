package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.c51;
public final class i2 implements y10 {
    public final int f3656a;
    public final p3 f3657b;

    public i2(p3 p3Var, int i7) {
        this.f3656a = i7;
        this.f3657b = p3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3656a) {
            case 0:
                this.f3657b.f3952v2.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                return;
            default:
                List list = (List) obj;
                p3 p3Var = this.f3657b;
                if (p3Var.getContext() != null && !p3Var.J) {
                    ArrayList b10 = wg.s.b(1, list);
                    p3Var.V1 = b10;
                    List c10 = wg.s.c(b10);
                    p3Var.V1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p3Var.h1();
                        c51 c51Var = p3Var.U1;
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
