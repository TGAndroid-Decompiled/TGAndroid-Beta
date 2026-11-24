package defpackage;
public final class da2 implements Runnable {
    public final byte a;
    public final qa2 b;

    public da2(qa2 qa2Var, byte b) {
        this.a = b;
        this.b = qa2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qa2 qa2Var = this.b;
        switch (b) {
            case 0:
                qa2Var.d0 = true;
                qa2Var.h0();
                return;
            case 1:
                qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(qa2Var.a0));
                qa2Var.e0();
                return;
            case 2:
                qa2Var.g0(false);
                return;
            case 3:
                qa2Var.d0 = true;
                if (qa2Var.b.length() > 0) {
                    qa2Var.c0(qa2Var.b.getText().toString());
                }
                qa2Var.h0();
                return;
            case 4:
                qa2Var.e0();
                return;
            default:
                qa2Var.g0(true);
                return;
        }
    }
}
