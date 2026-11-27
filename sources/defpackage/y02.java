package defpackage;
public final class y02 extends rn {
    public final byte b;
    public final n12 c;

    public y02(n12 n12Var, byte b) {
        super("translation", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = n12Var;
                super("openProgress", (byte) 0);
                return;
            default:
                this.c = n12Var;
                return;
        }
    }

    @Override
    public final void c(java.lang.Object r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y02.c(java.lang.Object, float):void");
    }

    @Override
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                f12 f12Var = (f12) obj;
                return Float.valueOf(this.c.X1);
            default:
                n12 n12Var = (n12) obj;
                return Float.valueOf(0.0f);
        }
    }
}
