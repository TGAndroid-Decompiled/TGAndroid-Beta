package defpackage;

import org.telegram.tgnet.TLObject;
public final class n0a implements Runnable {
    public final byte a = 1;
    public final a8 b;
    public final a8 c;
    public final a8 d;
    public final a8 e;
    public final a8 f;
    public final boolean h;
    public final a8 n;
    public final a8 r;
    public final Object s;

    public n0a(a8 a8Var, ava avaVar, a8 a8Var2, a8 a8Var3, a8 a8Var4, a8 a8Var5, boolean z, a8 a8Var6, a8 a8Var7) {
        this.b = a8Var;
        this.s = avaVar;
        this.c = a8Var2;
        this.d = a8Var3;
        this.e = a8Var4;
        this.f = a8Var5;
        this.h = z;
        this.n = a8Var6;
        this.r = a8Var7;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        a8 a8Var = this.r;
        a8 a8Var2 = this.n;
        boolean z = this.h;
        a8 a8Var3 = this.f;
        a8 a8Var4 = this.e;
        a8 a8Var5 = this.d;
        a8 a8Var6 = this.c;
        Object obj = this.s;
        a8 a8Var7 = this.b;
        switch (b) {
            case 0:
                ava avaVar = ((o0a) obj).c.T1;
                if (avaVar.e) {
                    i = 2131750130;
                } else {
                    i = 2131750131;
                }
                String M0 = jb6.M0(i, null);
                if (avaVar.e) {
                    i2 = 2131231895;
                } else {
                    i2 = 2131231893;
                }
                a8Var7.j(M0, i2, null);
                a8Var6.setChecked(TLObject.hasFlag(avaVar.g, 1));
                a8Var5.setChecked(TLObject.hasFlag(avaVar.g, 2));
                a8Var4.setChecked(TLObject.hasFlag(avaVar.g, 4));
                a8Var3.setChecked(TLObject.hasFlag(avaVar.g, 8));
                if (z) {
                    a8Var2.setChecked(TLObject.hasFlag(avaVar.g, 256));
                    a8Var.setChecked(TLObject.hasFlag(avaVar.g, 512));
                    return;
                }
                return;
            default:
                ava avaVar2 = (ava) obj;
                if (a8Var7 != null) {
                    if (avaVar2.e) {
                        i3 = 2131750130;
                    } else {
                        i3 = 2131750131;
                    }
                    String M02 = jb6.M0(i3, null);
                    if (avaVar2.e) {
                        i4 = 2131231895;
                    } else {
                        i4 = 2131231893;
                    }
                    a8Var7.j(M02, i4, null);
                }
                a8Var6.setChecked(TLObject.hasFlag(avaVar2.g, 1));
                a8Var5.setChecked(TLObject.hasFlag(avaVar2.g, 2));
                a8Var4.setChecked(TLObject.hasFlag(avaVar2.g, 4));
                a8Var3.setChecked(TLObject.hasFlag(avaVar2.g, 8));
                if (z) {
                    a8Var2.setChecked(TLObject.hasFlag(avaVar2.g, 256));
                    a8Var.setChecked(TLObject.hasFlag(avaVar2.g, 512));
                    return;
                }
                return;
        }
    }

    public n0a(o0a o0aVar, a8 a8Var, a8 a8Var2, a8 a8Var3, a8 a8Var4, a8 a8Var5, boolean z, a8 a8Var6, a8 a8Var7) {
        this.s = o0aVar;
        this.b = a8Var;
        this.c = a8Var2;
        this.d = a8Var3;
        this.e = a8Var4;
        this.f = a8Var5;
        this.h = z;
        this.n = a8Var6;
        this.r = a8Var7;
    }
}
