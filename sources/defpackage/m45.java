package defpackage;
public final class m45 implements pcc {
    public final byte a = 0;
    public final c51 b;
    public final c51 c;
    public final tk7 d;
    public final vnb e;
    public final w45 f;
    public final Object g;
    public final Object h;

    public m45(c51 c51Var, c51 c51Var2, a55 a55Var, w45 w45Var, tk7 tk7Var, vnb vnbVar, re4 re4Var) {
        this.b = c51Var;
        this.c = c51Var2;
        this.g = a55Var;
        this.f = w45Var;
        this.d = tk7Var;
        this.e = vnbVar;
        this.h = re4Var;
    }

    @Override
    public final void a(Object obj) {
        c51 c51Var;
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                a55 a55Var = (a55) obj3;
                re4 re4Var = (re4) obj2;
                Boolean bool = (Boolean) obj;
                c51 c51Var2 = this.b;
                c51Var2.setEnabled(false);
                c51 c51Var3 = this.c;
                c51Var3.setEnabled(false);
                if (bool.booleanValue()) {
                    c51Var = c51Var3;
                } else {
                    c51Var = c51Var2;
                }
                c51Var.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                tk7 tk7Var = this.d;
                vnb vnbVar = this.e;
                w45 w45Var = this.f;
                a55Var.e(w45Var, booleanValue, new o45(c51Var2, c51Var3, tk7Var, vnbVar, re4Var, w45Var));
                return;
            default:
                boolean[] zArr = (boolean[]) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                String str = (String) obj;
                c51 c51Var4 = this.b;
                c51Var4.setLoading(false);
                c51 c51Var5 = this.c;
                c51Var5.setLoading(false);
                tk7 tk7Var2 = this.d;
                if (str == null) {
                    tk7Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    d31.c0(str);
                    return;
                } else {
                    d31.d0(str, tk7Var2.F, this.e);
                    w45 w45Var2 = this.f;
                    if (!w45Var2.n && zArr2[0]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c51Var4.setEnabled(z);
                    if (!w45Var2.n && !w45Var2.o) {
                        z2 = true;
                    }
                    c51Var5.setEnabled(z2);
                    return;
                }
        }
    }

    public m45(c51 c51Var, c51 c51Var2, tk7 tk7Var, boolean[] zArr, vnb vnbVar, w45 w45Var, boolean[] zArr2) {
        this.b = c51Var;
        this.c = c51Var2;
        this.d = tk7Var;
        this.g = zArr;
        this.e = vnbVar;
        this.f = w45Var;
        this.h = zArr2;
    }
}
