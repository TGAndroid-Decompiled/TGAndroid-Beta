package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class m1c extends i49 {
    public final byte a = 1;
    public int b;
    public final Object c;

    public m1c(bn0 bn0Var, int i) {
        this.c = bn0Var;
        this.b = i;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        zoc zocVar;
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b = 0;
                    return;
                }
                return;
            default:
                if (i == 1 && (zocVar = ((hmc) ((bn0) this.c).c).j0) != null) {
                    zocVar.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                p1c p1cVar = (p1c) obj;
                d2c d2cVar = p1cVar.n1;
                this.b += i2;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > gl.L(96.0f)) {
                    View findFocus = d2cVar.findFocus();
                    if (findFocus == null) {
                        findFocus = d2cVar;
                    }
                    gl.t1(findFocus);
                }
                if (i2 != 0 && d2cVar.c()) {
                    p1cVar.o1 = d2cVar.getContentTopOffset();
                    p1cVar.b.invalidate();
                    return;
                }
                return;
            default:
                int i3 = this.b;
                hmc hmcVar = (hmc) ((bn0) obj).c;
                if (i3 == 0) {
                    hmcVar.G0();
                    return;
                } else {
                    recyclerView.post(new qkc(hmcVar, (byte) 14));
                    return;
                }
        }
    }

    public m1c(p1c p1cVar) {
        this.c = p1cVar;
    }
}
