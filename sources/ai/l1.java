package ai;

import org.telegram.messenger.u10;
public final class l1 implements Runnable {
    public final int f780a;
    public final b3 f781b;
    public final u10 f782c;

    public l1(b3 b3Var, u10 u10Var, int i3) {
        this.f780a = i3;
        this.f781b = b3Var;
        this.f782c = u10Var;
    }

    @Override
    public final void run() {
        switch (this.f780a) {
            case 0:
                b3 b3Var = this.f781b;
                u10 u10Var = this.f782c;
                if (u10Var != null) {
                    b3Var.getClass();
                    u10Var.a(Boolean.FALSE);
                }
                b3Var.dismiss();
                return;
            case 1:
                b3 b3Var2 = this.f781b;
                u10 u10Var2 = this.f782c;
                if (u10Var2 != null) {
                    b3Var2.getClass();
                    u10Var2.a(Boolean.FALSE);
                }
                b3Var2.dismiss();
                return;
            default:
                b3 b3Var3 = this.f781b;
                u10 u10Var3 = this.f782c;
                if (u10Var3 != null) {
                    b3Var3.getClass();
                    u10Var3.a(Boolean.FALSE);
                }
                b3Var3.dismiss();
                return;
        }
    }
}
