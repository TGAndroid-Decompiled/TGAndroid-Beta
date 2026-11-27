package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class x81 extends v79 {
    public boolean a;
    public final i91 b;

    public x81(i91 i91Var) {
        this.b = i91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int abs;
        i91 i91Var = this.b;
        ArrayList arrayList = i91Var.x;
        int K0 = i91Var.b.K0();
        boolean z = false;
        if (K0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(i91Var.b.M0() - K0) + 1;
        }
        if (abs > 0) {
            int size = i91Var.c.g3.E.size();
            if (!i91Var.F && !i91Var.y && !arrayList.isEmpty() && K0 + abs >= size - 5) {
                hl.c3(new z21(this, (f91) c00.g(1, arrayList), (byte) 6));
            }
        }
        if (i2 != 0 && this.a) {
            zp4 zp4Var = i91Var.f;
            if (i2 < 0) {
                z = true;
            }
            zp4Var.e(z, true);
        }
        this.a = true;
    }
}
