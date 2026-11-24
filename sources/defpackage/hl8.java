package defpackage;
public final class hl8 implements Runnable {
    public final byte a;
    public final ml8 b;

    public hl8(ml8 ml8Var, byte b) {
        this.a = b;
        this.b = ml8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ml8 ml8Var = this.b;
        switch (b) {
            case 0:
                vk2 vk2Var = ml8Var.h;
                if (vk2Var != null) {
                    vk2Var.close();
                    return;
                }
                return;
            default:
                ml8Var.a();
                return;
        }
    }
}
