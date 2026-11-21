package bi;

import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
public final class m8 implements Runnable {
    public final int f3891a = 0;
    public final org.telegram.ui.ActionBar.y0 f3892b;
    public final org.telegram.ui.ActionBar.y0 f3893c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 f3894e;
    public final org.telegram.ui.ActionBar.y0 f3895f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.y0 f3896n;
    public final org.telegram.ui.ActionBar.y0 f3897r;
    public final Object f3898s;

    public m8(n8 n8Var, org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.f3898s = n8Var;
        this.f3892b = y0Var;
        this.f3893c = y0Var2;
        this.d = y0Var3;
        this.f3894e = y0Var4;
        this.f3895f = y0Var5;
        this.h = z10;
        this.f3896n = y0Var6;
        this.f3897r = y0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3891a;
        org.telegram.ui.ActionBar.y0 y0Var = this.f3897r;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f3896n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.f3895f;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f3894e;
        org.telegram.ui.ActionBar.y0 y0Var5 = this.d;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.f3893c;
        Object obj = this.f3898s;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.f3892b;
        switch (i13) {
            case 0:
                di.p8 p8Var = ((n8) obj).f3957c.U1;
                if (p8Var.f9543e) {
                    i7 = 2131750180;
                } else {
                    i7 = 2131750181;
                }
                String N0 = gd.N0(i7, null);
                if (p8Var.f9543e) {
                    i10 = 2131231891;
                } else {
                    i10 = 2131231889;
                }
                y0Var7.j(N0, i10, null);
                y0Var6.setChecked(TLObject.hasFlag(p8Var.f9545g, 1));
                y0Var5.setChecked(TLObject.hasFlag(p8Var.f9545g, 2));
                y0Var4.setChecked(TLObject.hasFlag(p8Var.f9545g, 4));
                y0Var3.setChecked(TLObject.hasFlag(p8Var.f9545g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(p8Var.f9545g, 256));
                    y0Var.setChecked(TLObject.hasFlag(p8Var.f9545g, 512));
                    return;
                }
                return;
            default:
                di.p8 p8Var2 = (di.p8) obj;
                if (y0Var7 != null) {
                    if (p8Var2.f9543e) {
                        i11 = 2131750180;
                    } else {
                        i11 = 2131750181;
                    }
                    String N02 = gd.N0(i11, null);
                    if (p8Var2.f9543e) {
                        i12 = 2131231891;
                    } else {
                        i12 = 2131231889;
                    }
                    y0Var7.j(N02, i12, null);
                }
                y0Var6.setChecked(TLObject.hasFlag(p8Var2.f9545g, 1));
                y0Var5.setChecked(TLObject.hasFlag(p8Var2.f9545g, 2));
                y0Var4.setChecked(TLObject.hasFlag(p8Var2.f9545g, 4));
                y0Var3.setChecked(TLObject.hasFlag(p8Var2.f9545g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(p8Var2.f9545g, 256));
                    y0Var.setChecked(TLObject.hasFlag(p8Var2.f9545g, 512));
                    return;
                }
                return;
        }
    }

    public m8(org.telegram.ui.ActionBar.y0 y0Var, di.p8 p8Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.f3892b = y0Var;
        this.f3898s = p8Var;
        this.f3893c = y0Var2;
        this.d = y0Var3;
        this.f3894e = y0Var4;
        this.f3895f = y0Var5;
        this.h = z10;
        this.f3896n = y0Var6;
        this.f3897r = y0Var7;
    }
}
