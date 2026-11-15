package bi;

import di.l8;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
public final class c6 implements Runnable {
    public final int f3429a = 0;
    public final org.telegram.ui.ActionBar.z0 f3430b;
    public final org.telegram.ui.ActionBar.z0 f3431c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f3432e;
    public final org.telegram.ui.ActionBar.z0 f3433f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.z0 f3434n;
    public final org.telegram.ui.ActionBar.z0 f3435r;
    public final Object f3436s;

    public c6(d6 d6Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f3436s = d6Var;
        this.f3430b = z0Var;
        this.f3431c = z0Var2;
        this.d = z0Var3;
        this.f3432e = z0Var4;
        this.f3433f = z0Var5;
        this.h = z10;
        this.f3434n = z0Var6;
        this.f3435r = z0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3429a;
        org.telegram.ui.ActionBar.z0 z0Var = this.f3435r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f3434n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f3433f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f3432e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f3431c;
        Object obj = this.f3436s;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f3430b;
        switch (i13) {
            case 0:
                l8 l8Var = ((d6) obj).f3448c.U1;
                if (l8Var.f8995e) {
                    i7 = 2131750197;
                } else {
                    i7 = 2131750198;
                }
                String M0 = hd.M0(i7, null);
                if (l8Var.f8995e) {
                    i10 = 2131231890;
                } else {
                    i10 = 2131231888;
                }
                z0Var7.j(M0, i10, null);
                z0Var6.setChecked(TLObject.hasFlag(l8Var.f8997g, 1));
                z0Var5.setChecked(TLObject.hasFlag(l8Var.f8997g, 2));
                z0Var4.setChecked(TLObject.hasFlag(l8Var.f8997g, 4));
                z0Var3.setChecked(TLObject.hasFlag(l8Var.f8997g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(l8Var.f8997g, 256));
                    z0Var.setChecked(TLObject.hasFlag(l8Var.f8997g, 512));
                    return;
                }
                return;
            default:
                l8 l8Var2 = (l8) obj;
                if (z0Var7 != null) {
                    if (l8Var2.f8995e) {
                        i11 = 2131750197;
                    } else {
                        i11 = 2131750198;
                    }
                    String M02 = hd.M0(i11, null);
                    if (l8Var2.f8995e) {
                        i12 = 2131231890;
                    } else {
                        i12 = 2131231888;
                    }
                    z0Var7.j(M02, i12, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(l8Var2.f8997g, 1));
                z0Var5.setChecked(TLObject.hasFlag(l8Var2.f8997g, 2));
                z0Var4.setChecked(TLObject.hasFlag(l8Var2.f8997g, 4));
                z0Var3.setChecked(TLObject.hasFlag(l8Var2.f8997g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(l8Var2.f8997g, 256));
                    z0Var.setChecked(TLObject.hasFlag(l8Var2.f8997g, 512));
                    return;
                }
                return;
        }
    }

    public c6(org.telegram.ui.ActionBar.z0 z0Var, l8 l8Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f3430b = z0Var;
        this.f3436s = l8Var;
        this.f3431c = z0Var2;
        this.d = z0Var3;
        this.f3432e = z0Var4;
        this.f3433f = z0Var5;
        this.h = z10;
        this.f3434n = z0Var6;
        this.f3435r = z0Var7;
    }
}
