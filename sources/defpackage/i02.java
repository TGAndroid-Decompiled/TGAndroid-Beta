package defpackage;
public final class i02 extends qn {
    public final byte b;
    public final x02 c;

    public i02(x02 x02Var, byte b) {
        super("translation", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = x02Var;
                super("openProgress", (byte) 0);
                return;
            default:
                this.c = x02Var;
                return;
        }
    }

    @Override
    public final void c(java.lang.Object r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i02.c(java.lang.Object, float):void");
    }

    @Override
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                p02 p02Var = (p02) obj;
                return Float.valueOf(this.c.X1);
            default:
                x02 x02Var = (x02) obj;
                return Float.valueOf(0.0f);
        }
    }
}
