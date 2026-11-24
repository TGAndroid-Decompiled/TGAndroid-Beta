package defpackage;
public final class fl4 implements Runnable {
    public final byte a;
    public final bmb b;

    public fl4(bmb bmbVar, byte b) {
        this.a = b;
        this.b = bmbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bmb bmbVar = this.b;
        switch (b) {
            case 0:
                nm7.e().k(275, bmbVar, Boolean.TRUE, null, -1);
                return;
            default:
                bmbVar.r();
                return;
        }
    }
}
