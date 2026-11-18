package bi;

import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
public final class i8 implements Runnable {
    public final int f3706a = 0;
    public final org.telegram.ui.ActionBar.z0 f3707b;
    public final org.telegram.ui.ActionBar.z0 f3708c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f3709e;
    public final org.telegram.ui.ActionBar.z0 f3710f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.z0 f3711n;
    public final org.telegram.ui.ActionBar.z0 f3712r;
    public final Object f3713s;

    public i8(j8 j8Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f3713s = j8Var;
        this.f3707b = z0Var;
        this.f3708c = z0Var2;
        this.d = z0Var3;
        this.f3709e = z0Var4;
        this.f3710f = z0Var5;
        this.h = z10;
        this.f3711n = z0Var6;
        this.f3712r = z0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3706a;
        org.telegram.ui.ActionBar.z0 z0Var = this.f3712r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f3711n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f3710f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f3709e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f3708c;
        Object obj = this.f3713s;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f3707b;
        switch (i13) {
            case 0:
                di.o8 o8Var = ((j8) obj).f3769c.U1;
                if (o8Var.f9461e) {
                    i7 = 2131750181;
                } else {
                    i7 = 2131750182;
                }
                String M0 = gd.M0(i7, null);
                if (o8Var.f9461e) {
                    i10 = 2131231891;
                } else {
                    i10 = 2131231889;
                }
                z0Var7.j(M0, i10, null);
                z0Var6.setChecked(TLObject.hasFlag(o8Var.f9463g, 1));
                z0Var5.setChecked(TLObject.hasFlag(o8Var.f9463g, 2));
                z0Var4.setChecked(TLObject.hasFlag(o8Var.f9463g, 4));
                z0Var3.setChecked(TLObject.hasFlag(o8Var.f9463g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(o8Var.f9463g, 256));
                    z0Var.setChecked(TLObject.hasFlag(o8Var.f9463g, 512));
                    return;
                }
                return;
            default:
                di.o8 o8Var2 = (di.o8) obj;
                if (z0Var7 != null) {
                    if (o8Var2.f9461e) {
                        i11 = 2131750181;
                    } else {
                        i11 = 2131750182;
                    }
                    String M02 = gd.M0(i11, null);
                    if (o8Var2.f9461e) {
                        i12 = 2131231891;
                    } else {
                        i12 = 2131231889;
                    }
                    z0Var7.j(M02, i12, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(o8Var2.f9463g, 1));
                z0Var5.setChecked(TLObject.hasFlag(o8Var2.f9463g, 2));
                z0Var4.setChecked(TLObject.hasFlag(o8Var2.f9463g, 4));
                z0Var3.setChecked(TLObject.hasFlag(o8Var2.f9463g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(o8Var2.f9463g, 256));
                    z0Var.setChecked(TLObject.hasFlag(o8Var2.f9463g, 512));
                    return;
                }
                return;
        }
    }

    public i8(org.telegram.ui.ActionBar.z0 z0Var, di.o8 o8Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f3707b = z0Var;
        this.f3713s = o8Var;
        this.f3708c = z0Var2;
        this.d = z0Var3;
        this.f3709e = z0Var4;
        this.f3710f = z0Var5;
        this.h = z10;
        this.f3711n = z0Var6;
        this.f3712r = z0Var7;
    }
}
