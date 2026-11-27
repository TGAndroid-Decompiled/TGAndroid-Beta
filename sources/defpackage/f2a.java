package defpackage;

import org.telegram.tgnet.TLObject;
public final class f2a implements Runnable {
    public final byte a = 1;
    public final b8 b;
    public final b8 c;
    public final b8 d;
    public final b8 e;
    public final b8 f;
    public final boolean h;
    public final b8 n;
    public final b8 r;
    public final Object s;

    public f2a(b8 b8Var, axa axaVar, b8 b8Var2, b8 b8Var3, b8 b8Var4, b8 b8Var5, boolean z, b8 b8Var6, b8 b8Var7) {
        this.b = b8Var;
        this.s = axaVar;
        this.c = b8Var2;
        this.d = b8Var3;
        this.e = b8Var4;
        this.f = b8Var5;
        this.h = z;
        this.n = b8Var6;
        this.r = b8Var7;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        b8 b8Var = this.r;
        b8 b8Var2 = this.n;
        boolean z = this.h;
        b8 b8Var3 = this.f;
        b8 b8Var4 = this.e;
        b8 b8Var5 = this.d;
        b8 b8Var6 = this.c;
        Object obj = this.s;
        b8 b8Var7 = this.b;
        switch (b) {
            case 0:
                axa axaVar = ((g2a) obj).c.T1;
                if (axaVar.e) {
                    i = 2131750156;
                } else {
                    i = 2131750157;
                }
                String M0 = ob6.M0(i, null);
                if (axaVar.e) {
                    i2 = 2131231894;
                } else {
                    i2 = 2131231892;
                }
                b8Var7.j(M0, i2, null);
                b8Var6.setChecked(TLObject.hasFlag(axaVar.g, 1));
                b8Var5.setChecked(TLObject.hasFlag(axaVar.g, 2));
                b8Var4.setChecked(TLObject.hasFlag(axaVar.g, 4));
                b8Var3.setChecked(TLObject.hasFlag(axaVar.g, 8));
                if (z) {
                    b8Var2.setChecked(TLObject.hasFlag(axaVar.g, 256));
                    b8Var.setChecked(TLObject.hasFlag(axaVar.g, 512));
                    return;
                }
                return;
            default:
                axa axaVar2 = (axa) obj;
                if (b8Var7 != null) {
                    if (axaVar2.e) {
                        i3 = 2131750156;
                    } else {
                        i3 = 2131750157;
                    }
                    String M02 = ob6.M0(i3, null);
                    if (axaVar2.e) {
                        i4 = 2131231894;
                    } else {
                        i4 = 2131231892;
                    }
                    b8Var7.j(M02, i4, null);
                }
                b8Var6.setChecked(TLObject.hasFlag(axaVar2.g, 1));
                b8Var5.setChecked(TLObject.hasFlag(axaVar2.g, 2));
                b8Var4.setChecked(TLObject.hasFlag(axaVar2.g, 4));
                b8Var3.setChecked(TLObject.hasFlag(axaVar2.g, 8));
                if (z) {
                    b8Var2.setChecked(TLObject.hasFlag(axaVar2.g, 256));
                    b8Var.setChecked(TLObject.hasFlag(axaVar2.g, 512));
                    return;
                }
                return;
        }
    }

    public f2a(g2a g2aVar, b8 b8Var, b8 b8Var2, b8 b8Var3, b8 b8Var4, b8 b8Var5, boolean z, b8 b8Var6, b8 b8Var7) {
        this.s = g2aVar;
        this.b = b8Var;
        this.c = b8Var2;
        this.d = b8Var3;
        this.e = b8Var4;
        this.f = b8Var5;
        this.h = z;
        this.n = b8Var6;
        this.r = b8Var7;
    }
}
