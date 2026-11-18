package bi;

import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
public final class j8 implements Runnable {
    public final int f3784a = 0;
    public final org.telegram.ui.ActionBar.z0 f3785b;
    public final org.telegram.ui.ActionBar.z0 f3786c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f3787e;
    public final org.telegram.ui.ActionBar.z0 f3788f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.z0 f3789n;
    public final org.telegram.ui.ActionBar.z0 f3790r;
    public final Object f3791s;

    public j8(k8 k8Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f3791s = k8Var;
        this.f3785b = z0Var;
        this.f3786c = z0Var2;
        this.d = z0Var3;
        this.f3787e = z0Var4;
        this.f3788f = z0Var5;
        this.h = z10;
        this.f3789n = z0Var6;
        this.f3790r = z0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3784a;
        org.telegram.ui.ActionBar.z0 z0Var = this.f3790r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f3789n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f3788f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f3787e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f3786c;
        Object obj = this.f3791s;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f3785b;
        switch (i13) {
            case 0:
                di.o8 o8Var = ((k8) obj).f3826c.U1;
                if (o8Var.f9464e) {
                    i7 = 2131750181;
                } else {
                    i7 = 2131750182;
                }
                String M0 = gd.M0(i7, null);
                if (o8Var.f9464e) {
                    i10 = 2131231891;
                } else {
                    i10 = 2131231889;
                }
                z0Var7.j(M0, i10, null);
                z0Var6.setChecked(TLObject.hasFlag(o8Var.f9466g, 1));
                z0Var5.setChecked(TLObject.hasFlag(o8Var.f9466g, 2));
                z0Var4.setChecked(TLObject.hasFlag(o8Var.f9466g, 4));
                z0Var3.setChecked(TLObject.hasFlag(o8Var.f9466g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(o8Var.f9466g, 256));
                    z0Var.setChecked(TLObject.hasFlag(o8Var.f9466g, 512));
                    return;
                }
                return;
            default:
                di.o8 o8Var2 = (di.o8) obj;
                if (z0Var7 != null) {
                    if (o8Var2.f9464e) {
                        i11 = 2131750181;
                    } else {
                        i11 = 2131750182;
                    }
                    String M02 = gd.M0(i11, null);
                    if (o8Var2.f9464e) {
                        i12 = 2131231891;
                    } else {
                        i12 = 2131231889;
                    }
                    z0Var7.j(M02, i12, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(o8Var2.f9466g, 1));
                z0Var5.setChecked(TLObject.hasFlag(o8Var2.f9466g, 2));
                z0Var4.setChecked(TLObject.hasFlag(o8Var2.f9466g, 4));
                z0Var3.setChecked(TLObject.hasFlag(o8Var2.f9466g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(o8Var2.f9466g, 256));
                    z0Var.setChecked(TLObject.hasFlag(o8Var2.f9466g, 512));
                    return;
                }
                return;
        }
    }

    public j8(org.telegram.ui.ActionBar.z0 z0Var, di.o8 o8Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f3785b = z0Var;
        this.f3791s = o8Var;
        this.f3786c = z0Var2;
        this.d = z0Var3;
        this.f3787e = z0Var4;
        this.f3788f = z0Var5;
        this.h = z10;
        this.f3789n = z0Var6;
        this.f3790r = z0Var7;
    }
}
