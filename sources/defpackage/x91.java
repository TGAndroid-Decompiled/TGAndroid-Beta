package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class x91 extends k69 {
    public boolean a;
    public final ia1 b;

    public x91(ia1 ia1Var) {
        this.b = ia1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int abs;
        ia1 ia1Var = this.b;
        ArrayList arrayList = ia1Var.x;
        int K0 = ia1Var.b.K0();
        boolean z = false;
        if (K0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(ia1Var.b.M0() - K0) + 1;
        }
        if (abs > 0) {
            int size = ia1Var.c.g3.E.size();
            if (!ia1Var.F && !ia1Var.y && !arrayList.isEmpty() && K0 + abs >= size - 5) {
                gm.c3(new y31(this, (fa1) b10.f(1, arrayList), (byte) 7));
            }
        }
        if (i2 != 0 && this.a) {
            wp4 wp4Var = ia1Var.f;
            if (i2 < 0) {
                z = true;
            }
            wp4Var.e(z, true);
        }
        this.a = true;
    }
}
