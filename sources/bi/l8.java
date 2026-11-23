package bi;

import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
public final class l8 implements Runnable {
    public final int f3859a = 0;
    public final org.telegram.ui.ActionBar.y0 f3860b;
    public final org.telegram.ui.ActionBar.y0 f3861c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 f3862e;
    public final org.telegram.ui.ActionBar.y0 f3863f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.y0 f3864n;
    public final org.telegram.ui.ActionBar.y0 f3865r;
    public final Object f3866s;

    public l8(m8 m8Var, org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.f3866s = m8Var;
        this.f3860b = y0Var;
        this.f3861c = y0Var2;
        this.d = y0Var3;
        this.f3862e = y0Var4;
        this.f3863f = y0Var5;
        this.h = z10;
        this.f3864n = y0Var6;
        this.f3865r = y0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3859a;
        org.telegram.ui.ActionBar.y0 y0Var = this.f3865r;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f3864n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.f3863f;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f3862e;
        org.telegram.ui.ActionBar.y0 y0Var5 = this.d;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.f3861c;
        Object obj = this.f3866s;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.f3860b;
        switch (i13) {
            case 0:
                di.p8 p8Var = ((m8) obj).f3910c.U1;
                if (p8Var.f9546e) {
                    i7 = 2131750180;
                } else {
                    i7 = 2131750181;
                }
                String N0 = hd.N0(i7, null);
                if (p8Var.f9546e) {
                    i10 = 2131231891;
                } else {
                    i10 = 2131231889;
                }
                y0Var7.j(N0, i10, null);
                y0Var6.setChecked(TLObject.hasFlag(p8Var.f9548g, 1));
                y0Var5.setChecked(TLObject.hasFlag(p8Var.f9548g, 2));
                y0Var4.setChecked(TLObject.hasFlag(p8Var.f9548g, 4));
                y0Var3.setChecked(TLObject.hasFlag(p8Var.f9548g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(p8Var.f9548g, 256));
                    y0Var.setChecked(TLObject.hasFlag(p8Var.f9548g, 512));
                    return;
                }
                return;
            default:
                di.p8 p8Var2 = (di.p8) obj;
                if (y0Var7 != null) {
                    if (p8Var2.f9546e) {
                        i11 = 2131750180;
                    } else {
                        i11 = 2131750181;
                    }
                    String N02 = hd.N0(i11, null);
                    if (p8Var2.f9546e) {
                        i12 = 2131231891;
                    } else {
                        i12 = 2131231889;
                    }
                    y0Var7.j(N02, i12, null);
                }
                y0Var6.setChecked(TLObject.hasFlag(p8Var2.f9548g, 1));
                y0Var5.setChecked(TLObject.hasFlag(p8Var2.f9548g, 2));
                y0Var4.setChecked(TLObject.hasFlag(p8Var2.f9548g, 4));
                y0Var3.setChecked(TLObject.hasFlag(p8Var2.f9548g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(p8Var2.f9548g, 256));
                    y0Var.setChecked(TLObject.hasFlag(p8Var2.f9548g, 512));
                    return;
                }
                return;
        }
    }

    public l8(org.telegram.ui.ActionBar.y0 y0Var, di.p8 p8Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.f3860b = y0Var;
        this.f3866s = p8Var;
        this.f3861c = y0Var2;
        this.d = y0Var3;
        this.f3862e = y0Var4;
        this.f3863f = y0Var5;
        this.h = z10;
        this.f3864n = y0Var6;
        this.f3865r = y0Var7;
    }
}
