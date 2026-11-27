package defpackage;
public final class w85 implements Runnable {
    public final byte a;
    public final x85 b;

    public w85(x85 x85Var, byte b) {
        this.a = b;
        this.b = x85Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x85 x85Var = this.b;
        switch (b) {
            case 0:
                tb tbVar = x85Var.b;
                if (tbVar != null) {
                    tbVar.setVisibility(0);
                }
                hl.d3(new w85(x85Var, (byte) 2), 16L);
                return;
            case 1:
                tb tbVar2 = x85Var.b;
                if (tbVar2 != null) {
                    tbVar2.setVisibility(4);
                    return;
                }
                return;
            default:
                x85Var.b();
                return;
        }
    }
}
