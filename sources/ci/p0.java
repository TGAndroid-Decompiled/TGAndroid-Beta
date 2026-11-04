package ci;

import org.telegram.messenger.kr;
public final class p0 implements kr {
    public final int f5719a;
    public final Object f5720b;

    public p0(Object obj, int i3) {
        this.f5719a = i3;
        this.f5720b = obj;
    }

    @Override
    public final void a(int i3) {
        dg.b bVar;
        dg.b bVar2;
        dg.b bVar3;
        switch (this.f5719a) {
            case 0:
                t0 t0Var = (t0) this.f5720b;
                t0Var.getClass();
                if (i3 == 0) {
                    bVar = dg.b.f8925a;
                } else {
                    bVar = dg.b.f8926b;
                }
                t0Var.f1(dg.a.i(0L, bVar), true, false, true);
                t0Var.X1.setText("");
                return;
            case 1:
                x0 x0Var = (x0) this.f5720b;
                x0Var.getClass();
                if (i3 == 0) {
                    bVar2 = dg.b.f8925a;
                } else {
                    bVar2 = dg.b.f8926b;
                }
                x0Var.M0(dg.a.i(0L, bVar2), true, false, true);
                x0Var.f6313o1.setText("");
                return;
            default:
                n5 n5Var = (n5) this.f5720b;
                n5Var.getClass();
                if (i3 == 0) {
                    bVar3 = dg.b.f8925a;
                } else {
                    bVar3 = dg.b.f8926b;
                }
                n5Var.f5607q = bVar3;
                n5Var.a(true);
                return;
        }
    }
}
