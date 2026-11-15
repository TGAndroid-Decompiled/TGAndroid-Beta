package di;

import org.telegram.messenger.z10;
import org.telegram.ui.ah0;
public final class c8 implements Runnable {
    public final int f8365a;
    public final boolean[] f8366b;
    public final z10 f8367c;

    public c8(int i7, z10 z10Var, boolean[] zArr) {
        this.f8365a = i7;
        this.f8366b = zArr;
        this.f8367c = z10Var;
    }

    @Override
    public final void run() {
        z10 z10Var;
        z10 z10Var2;
        z10 z10Var3;
        switch (this.f8365a) {
            case 0:
                boolean[] zArr = this.f8366b;
                if (!zArr[0] && (z10Var = this.f8367c) != null) {
                    z10Var.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f8366b;
                if (!zArr2[0] && (z10Var2 = this.f8367c) != null) {
                    zArr2[0] = true;
                    z10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.i3(new ah0(2), 220L);
                return;
            default:
                boolean[] zArr3 = this.f8366b;
                if (!zArr3[0] && (z10Var3 = this.f8367c) != null) {
                    zArr3[0] = true;
                    z10Var3.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public c8(u8 u8Var, boolean[] zArr, z10 z10Var) {
        this.f8365a = 0;
        this.f8366b = zArr;
        this.f8367c = z10Var;
    }
}
