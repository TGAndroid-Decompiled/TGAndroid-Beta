package defpackage;
public final class s85 implements Runnable {
    public final byte a;
    public final t85 b;

    public s85(t85 t85Var, byte b) {
        this.a = b;
        this.b = t85Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t85 t85Var = this.b;
        switch (b) {
            case 0:
                sb sbVar = t85Var.b;
                if (sbVar != null) {
                    sbVar.setVisibility(0);
                }
                gm.d3(new s85(t85Var, (byte) 2), 16L);
                return;
            case 1:
                sb sbVar2 = t85Var.b;
                if (sbVar2 != null) {
                    sbVar2.setVisibility(4);
                    return;
                }
                return;
            default:
                t85Var.b();
                return;
        }
    }
}
