package defpackage;
public final class d25 implements p8c {
    public final byte a = 1;
    public final u41 b;
    public final u41 c;
    public final ki7 d;
    public final wjb e;
    public final s25 f;
    public final Object g;
    public final Object h;

    public d25(u41 u41Var, u41 u41Var2, w25 w25Var, s25 s25Var, ki7 ki7Var, wjb wjbVar, jf4 jf4Var) {
        this.b = u41Var;
        this.c = u41Var2;
        this.g = w25Var;
        this.f = s25Var;
        this.d = ki7Var;
        this.e = wjbVar;
        this.h = jf4Var;
    }

    @Override
    public final void a(Object obj) {
        u41 u41Var;
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                w25 w25Var = (w25) obj3;
                jf4 jf4Var = (jf4) obj2;
                Boolean bool = (Boolean) obj;
                u41 u41Var2 = this.b;
                u41Var2.setEnabled(false);
                u41 u41Var3 = this.c;
                u41Var3.setEnabled(false);
                if (bool.booleanValue()) {
                    u41Var = u41Var3;
                } else {
                    u41Var = u41Var2;
                }
                u41Var.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                ki7 ki7Var = this.d;
                wjb wjbVar = this.e;
                s25 s25Var = this.f;
                w25Var.e(s25Var, booleanValue, new f25(u41Var2, u41Var3, ki7Var, wjbVar, jf4Var, s25Var, (byte) 0));
                return;
            default:
                boolean[] zArr = (boolean[]) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                String str = (String) obj;
                u41 u41Var4 = this.b;
                u41Var4.setLoading(false);
                u41 u41Var5 = this.c;
                u41Var5.setLoading(false);
                ki7 ki7Var2 = this.d;
                if (str == null) {
                    ki7Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    u21.c0(str);
                    return;
                } else {
                    u21.d0(str, ki7Var2.F, this.e);
                    s25 s25Var2 = this.f;
                    if (!s25Var2.n && zArr2[0]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    u41Var4.setEnabled(z);
                    if (!s25Var2.n && !s25Var2.o) {
                        z2 = true;
                    }
                    u41Var5.setEnabled(z2);
                    return;
                }
        }
    }

    public d25(u41 u41Var, u41 u41Var2, ki7 ki7Var, boolean[] zArr, wjb wjbVar, s25 s25Var, boolean[] zArr2) {
        this.b = u41Var;
        this.c = u41Var2;
        this.d = ki7Var;
        this.g = zArr;
        this.e = wjbVar;
        this.f = s25Var;
        this.h = zArr2;
    }
}
