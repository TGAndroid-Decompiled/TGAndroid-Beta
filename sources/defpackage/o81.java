package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class o81 extends i49 {
    public boolean a;
    public final z81 b;

    public o81(z81 z81Var) {
        this.b = z81Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int abs;
        z81 z81Var = this.b;
        ArrayList arrayList = z81Var.x;
        int K0 = z81Var.b.K0();
        boolean z = false;
        if (K0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(z81Var.b.M0() - K0) + 1;
        }
        if (abs > 0) {
            int size = z81Var.c.g3.E.size();
            if (!z81Var.F && !z81Var.y && !arrayList.isEmpty() && K0 + abs >= size - 5) {
                gl.c3(new q21(this, (w81) b00.f(1, arrayList), (byte) 6));
            }
        }
        if (i2 != 0 && this.a) {
            un4 un4Var = z81Var.f;
            if (i2 < 0) {
                z = true;
            }
            un4Var.e(z, true);
        }
        this.a = true;
    }
}
