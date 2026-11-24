package defpackage;
public final class u65 implements Runnable {
    public final byte a;
    public final v65 b;

    public u65(v65 v65Var, byte b) {
        this.a = b;
        this.b = v65Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v65 v65Var = this.b;
        switch (b) {
            case 0:
                sb sbVar = v65Var.b;
                if (sbVar != null) {
                    sbVar.setVisibility(0);
                }
                gl.d3(new u65(v65Var, (byte) 2), 16L);
                return;
            case 1:
                sb sbVar2 = v65Var.b;
                if (sbVar2 != null) {
                    sbVar2.setVisibility(4);
                    return;
                }
                return;
            default:
                v65Var.b();
                return;
        }
    }
}
