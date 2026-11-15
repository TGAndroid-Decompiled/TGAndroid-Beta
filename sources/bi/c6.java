package bi;

import di.m8;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
public final class c6 implements Runnable {
    public final int f3426a = 0;
    public final org.telegram.ui.ActionBar.z0 f3427b;
    public final org.telegram.ui.ActionBar.z0 f3428c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f3429e;
    public final org.telegram.ui.ActionBar.z0 f3430f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.z0 f3431n;
    public final org.telegram.ui.ActionBar.z0 f3432r;
    public final Object f3433s;

    public c6(d6 d6Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f3433s = d6Var;
        this.f3427b = z0Var;
        this.f3428c = z0Var2;
        this.d = z0Var3;
        this.f3429e = z0Var4;
        this.f3430f = z0Var5;
        this.h = z10;
        this.f3431n = z0Var6;
        this.f3432r = z0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3426a;
        org.telegram.ui.ActionBar.z0 z0Var = this.f3432r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f3431n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f3430f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f3429e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f3428c;
        Object obj = this.f3433s;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f3427b;
        switch (i13) {
            case 0:
                m8 m8Var = ((d6) obj).f3445c.U1;
                if (m8Var.f9045e) {
                    i7 = 2131750197;
                } else {
                    i7 = 2131750198;
                }
                String M0 = hd.M0(i7, null);
                if (m8Var.f9045e) {
                    i10 = 2131231890;
                } else {
                    i10 = 2131231888;
                }
                z0Var7.j(M0, i10, null);
                z0Var6.setChecked(TLObject.hasFlag(m8Var.f9047g, 1));
                z0Var5.setChecked(TLObject.hasFlag(m8Var.f9047g, 2));
                z0Var4.setChecked(TLObject.hasFlag(m8Var.f9047g, 4));
                z0Var3.setChecked(TLObject.hasFlag(m8Var.f9047g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(m8Var.f9047g, 256));
                    z0Var.setChecked(TLObject.hasFlag(m8Var.f9047g, 512));
                    return;
                }
                return;
            default:
                m8 m8Var2 = (m8) obj;
                if (z0Var7 != null) {
                    if (m8Var2.f9045e) {
                        i11 = 2131750197;
                    } else {
                        i11 = 2131750198;
                    }
                    String M02 = hd.M0(i11, null);
                    if (m8Var2.f9045e) {
                        i12 = 2131231890;
                    } else {
                        i12 = 2131231888;
                    }
                    z0Var7.j(M02, i12, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(m8Var2.f9047g, 1));
                z0Var5.setChecked(TLObject.hasFlag(m8Var2.f9047g, 2));
                z0Var4.setChecked(TLObject.hasFlag(m8Var2.f9047g, 4));
                z0Var3.setChecked(TLObject.hasFlag(m8Var2.f9047g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(m8Var2.f9047g, 256));
                    z0Var.setChecked(TLObject.hasFlag(m8Var2.f9047g, 512));
                    return;
                }
                return;
        }
    }

    public c6(org.telegram.ui.ActionBar.z0 z0Var, m8 m8Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f3427b = z0Var;
        this.f3433s = m8Var;
        this.f3428c = z0Var2;
        this.d = z0Var3;
        this.f3429e = z0Var4;
        this.f3430f = z0Var5;
        this.h = z10;
        this.f3431n = z0Var6;
        this.f3432r = z0Var7;
    }
}
