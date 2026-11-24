package defpackage;
public final class t12 extends ro {
    public final byte b;
    public final i22 c;

    public t12(i22 i22Var, byte b) {
        super("translation", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = i22Var;
                super("openProgress", (byte) 0);
                return;
            default:
                this.c = i22Var;
                return;
        }
    }

    @Override
    public final void c(java.lang.Object r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t12.c(java.lang.Object, float):void");
    }

    @Override
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                a22 a22Var = (a22) obj;
                return Float.valueOf(this.c.X1);
            default:
                i22 i22Var = (i22) obj;
                return Float.valueOf(0.0f);
        }
    }
}
