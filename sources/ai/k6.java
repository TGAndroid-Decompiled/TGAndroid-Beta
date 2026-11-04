package ai;

import ci.v8;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
public final class k6 implements Runnable {
    public final int f767a = 0;
    public final org.telegram.ui.ActionBar.y0 f768b;
    public final org.telegram.ui.ActionBar.y0 f769c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 f770e;
    public final org.telegram.ui.ActionBar.y0 f771f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.y0 f772n;
    public final org.telegram.ui.ActionBar.y0 f773r;
    public final Object f774s;

    public k6(l6 l6Var, org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.f774s = l6Var;
        this.f768b = y0Var;
        this.f769c = y0Var2;
        this.d = y0Var3;
        this.f770e = y0Var4;
        this.f771f = y0Var5;
        this.h = z10;
        this.f772n = y0Var6;
        this.f773r = y0Var7;
    }

    @Override
    public final void run() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.f767a;
        org.telegram.ui.ActionBar.y0 y0Var = this.f773r;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f772n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.f771f;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f770e;
        org.telegram.ui.ActionBar.y0 y0Var5 = this.d;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.f769c;
        Object obj = this.f774s;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.f768b;
        switch (i13) {
            case 0:
                v8 v8Var = ((l6) obj).f788c.R1;
                if (v8Var.f6197e) {
                    i3 = 2131750205;
                } else {
                    i3 = 2131750206;
                }
                String M0 = bd.M0(i3, null);
                if (v8Var.f6197e) {
                    i10 = 2131231890;
                } else {
                    i10 = 2131231888;
                }
                y0Var7.j(M0, i10, null);
                y0Var6.setChecked(TLObject.hasFlag(v8Var.f6199g, 1));
                y0Var5.setChecked(TLObject.hasFlag(v8Var.f6199g, 2));
                y0Var4.setChecked(TLObject.hasFlag(v8Var.f6199g, 4));
                y0Var3.setChecked(TLObject.hasFlag(v8Var.f6199g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(v8Var.f6199g, 256));
                    y0Var.setChecked(TLObject.hasFlag(v8Var.f6199g, 512));
                    return;
                }
                return;
            default:
                v8 v8Var2 = (v8) obj;
                if (y0Var7 != null) {
                    if (v8Var2.f6197e) {
                        i11 = 2131750205;
                    } else {
                        i11 = 2131750206;
                    }
                    String M02 = bd.M0(i11, null);
                    if (v8Var2.f6197e) {
                        i12 = 2131231890;
                    } else {
                        i12 = 2131231888;
                    }
                    y0Var7.j(M02, i12, null);
                }
                y0Var6.setChecked(TLObject.hasFlag(v8Var2.f6199g, 1));
                y0Var5.setChecked(TLObject.hasFlag(v8Var2.f6199g, 2));
                y0Var4.setChecked(TLObject.hasFlag(v8Var2.f6199g, 4));
                y0Var3.setChecked(TLObject.hasFlag(v8Var2.f6199g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(v8Var2.f6199g, 256));
                    y0Var.setChecked(TLObject.hasFlag(v8Var2.f6199g, 512));
                    return;
                }
                return;
        }
    }

    public k6(org.telegram.ui.ActionBar.y0 y0Var, v8 v8Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.f768b = y0Var;
        this.f774s = v8Var;
        this.f769c = y0Var2;
        this.d = y0Var3;
        this.f770e = y0Var4;
        this.f771f = y0Var5;
        this.h = z10;
        this.f772n = y0Var6;
        this.f773r = y0Var7;
    }
}
