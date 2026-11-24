package defpackage;
public class p86 extends odc {
    public static final pd5 d = new pd5((byte) 21);
    public final qka b = new qka();
    public boolean c = false;

    @Override
    public final void b() {
        qka qkaVar = this.b;
        int i = qkaVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            o86 o86Var = (o86) qkaVar.b[i2];
            v3d v3dVar = o86Var.l;
            v3dVar.b();
            v3dVar.c = true;
            e31 e31Var = o86Var.n;
            if (e31Var != null) {
                o86Var.h(e31Var);
            }
            o86 o86Var2 = v3dVar.a;
            if (o86Var2 != null) {
                if (o86Var2 == o86Var) {
                    v3dVar.a = null;
                    v3dVar.d = true;
                    v3dVar.b = false;
                    v3dVar.c = false;
                    v3dVar.e = false;
                } else {
                    w26.j("Attempting to unregister the wrong listener");
                    return;
                }
            } else {
                sc8.j("No listener register");
                return;
            }
        }
        int i3 = qkaVar.c;
        Object[] objArr = qkaVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        qkaVar.c = 0;
    }
}
