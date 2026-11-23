package bi;

import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
public final class o8 implements Runnable {
    public final int f3916a = 0;
    public final org.telegram.ui.ActionBar.y0 f3917b;
    public final org.telegram.ui.ActionBar.y0 f3918c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 f3919e;
    public final org.telegram.ui.ActionBar.y0 f3920f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.y0 f3921n;
    public final org.telegram.ui.ActionBar.y0 f3922r;
    public final Object f3923s;

    public o8(p8 p8Var, org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.f3923s = p8Var;
        this.f3917b = y0Var;
        this.f3918c = y0Var2;
        this.d = y0Var3;
        this.f3919e = y0Var4;
        this.f3920f = y0Var5;
        this.h = z10;
        this.f3921n = y0Var6;
        this.f3922r = y0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3916a;
        org.telegram.ui.ActionBar.y0 y0Var = this.f3922r;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f3921n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.f3920f;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f3919e;
        org.telegram.ui.ActionBar.y0 y0Var5 = this.d;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.f3918c;
        Object obj = this.f3923s;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.f3917b;
        switch (i13) {
            case 0:
                di.p8 p8Var = ((p8) obj).f3979c.U1;
                if (p8Var.f9509e) {
                    i7 = 2131750180;
                } else {
                    i7 = 2131750181;
                }
                String N0 = hd.N0(i7, null);
                if (p8Var.f9509e) {
                    i10 = 2131231891;
                } else {
                    i10 = 2131231889;
                }
                y0Var7.j(N0, i10, null);
                y0Var6.setChecked(TLObject.hasFlag(p8Var.f9511g, 1));
                y0Var5.setChecked(TLObject.hasFlag(p8Var.f9511g, 2));
                y0Var4.setChecked(TLObject.hasFlag(p8Var.f9511g, 4));
                y0Var3.setChecked(TLObject.hasFlag(p8Var.f9511g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(p8Var.f9511g, 256));
                    y0Var.setChecked(TLObject.hasFlag(p8Var.f9511g, 512));
                    return;
                }
                return;
            default:
                di.p8 p8Var2 = (di.p8) obj;
                if (y0Var7 != null) {
                    if (p8Var2.f9509e) {
                        i11 = 2131750180;
                    } else {
                        i11 = 2131750181;
                    }
                    String N02 = hd.N0(i11, null);
                    if (p8Var2.f9509e) {
                        i12 = 2131231891;
                    } else {
                        i12 = 2131231889;
                    }
                    y0Var7.j(N02, i12, null);
                }
                y0Var6.setChecked(TLObject.hasFlag(p8Var2.f9511g, 1));
                y0Var5.setChecked(TLObject.hasFlag(p8Var2.f9511g, 2));
                y0Var4.setChecked(TLObject.hasFlag(p8Var2.f9511g, 4));
                y0Var3.setChecked(TLObject.hasFlag(p8Var2.f9511g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(p8Var2.f9511g, 256));
                    y0Var.setChecked(TLObject.hasFlag(p8Var2.f9511g, 512));
                    return;
                }
                return;
        }
    }

    public o8(org.telegram.ui.ActionBar.y0 y0Var, di.p8 p8Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.f3917b = y0Var;
        this.f3923s = p8Var;
        this.f3918c = y0Var2;
        this.d = y0Var3;
        this.f3919e = y0Var4;
        this.f3920f = y0Var5;
        this.h = z10;
        this.f3921n = y0Var6;
        this.f3922r = y0Var7;
    }
}
