package gh;

import hh.fa;

public final class b6 implements Runnable {

    public final int f7172a;

    public final m6 f7173b;

    public b6(m6 m6Var, int i10) {
        this.f7172a = i10;
        this.f7173b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f7172a) {
            case 0:
                this.f7173b.Y(false);
                break;
            case 1:
                this.f7173b.Y(true);
                break;
            case 2:
                m6.U(this.f7173b);
                break;
            case 3:
                m6 m6Var = this.f7173b;
                i0.U(m6Var.getContext(), m6Var.Y, m6Var.resourcesProvider);
                break;
            case 4:
                m6 m6Var2 = this.f7173b;
                new fa(m6Var2.getContext(), m6Var2.resourcesProvider).show();
                break;
            default:
                this.f7173b.dismiss();
                break;
        }
    }
}
