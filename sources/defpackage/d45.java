package defpackage;
public final class d45 implements qac {
    public final byte a = 1;
    public final b61 b;
    public final b61 c;
    public final mk7 d;
    public final ylb e;
    public final s45 f;
    public final Object g;
    public final Object h;

    public d45(b61 b61Var, b61 b61Var2, w45 w45Var, s45 s45Var, mk7 mk7Var, ylb ylbVar, if4 if4Var) {
        this.b = b61Var;
        this.c = b61Var2;
        this.g = w45Var;
        this.f = s45Var;
        this.d = mk7Var;
        this.e = ylbVar;
        this.h = if4Var;
    }

    @Override
    public final void a(Object obj) {
        b61 b61Var;
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                w45 w45Var = (w45) obj3;
                if4 if4Var = (if4) obj2;
                Boolean bool = (Boolean) obj;
                b61 b61Var2 = this.b;
                b61Var2.setEnabled(false);
                b61 b61Var3 = this.c;
                b61Var3.setEnabled(false);
                if (bool.booleanValue()) {
                    b61Var = b61Var3;
                } else {
                    b61Var = b61Var2;
                }
                b61Var.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                mk7 mk7Var = this.d;
                ylb ylbVar = this.e;
                s45 s45Var = this.f;
                w45Var.e(s45Var, booleanValue, new f45(b61Var2, b61Var3, mk7Var, ylbVar, if4Var, s45Var, (byte) 0));
                return;
            default:
                boolean[] zArr = (boolean[]) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                String str = (String) obj;
                b61 b61Var4 = this.b;
                b61Var4.setLoading(false);
                b61 b61Var5 = this.c;
                b61Var5.setLoading(false);
                mk7 mk7Var2 = this.d;
                if (str == null) {
                    mk7Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    c41.c0(str);
                    return;
                } else {
                    c41.d0(str, mk7Var2.F, this.e);
                    s45 s45Var2 = this.f;
                    if (!s45Var2.n && zArr2[0]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b61Var4.setEnabled(z);
                    if (!s45Var2.n && !s45Var2.o) {
                        z2 = true;
                    }
                    b61Var5.setEnabled(z2);
                    return;
                }
        }
    }

    public d45(b61 b61Var, b61 b61Var2, mk7 mk7Var, boolean[] zArr, ylb ylbVar, s45 s45Var, boolean[] zArr2) {
        this.b = b61Var;
        this.c = b61Var2;
        this.d = mk7Var;
        this.g = zArr;
        this.e = ylbVar;
        this.f = s45Var;
        this.h = zArr2;
    }
}
