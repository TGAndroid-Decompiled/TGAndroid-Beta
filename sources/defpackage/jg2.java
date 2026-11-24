package defpackage;
public final class jg2 implements Runnable {
    public final byte a;
    public final kg2 b;

    public jg2(kg2 kg2Var, byte b) {
        this.a = b;
        this.b = kg2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kg2 kg2Var = this.b;
        switch (b) {
            case 0:
                va vaVar = kg2Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
            default:
                va vaVar2 = kg2Var.a;
                if (vaVar2 != null) {
                    vaVar2.g3.O(true);
                    return;
                }
                return;
        }
    }
}
