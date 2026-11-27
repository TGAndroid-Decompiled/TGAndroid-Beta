package defpackage;
public final class fl4 implements Runnable {
    public final byte a;
    public final znb b;

    public fl4(znb znbVar, byte b) {
        this.a = b;
        this.b = znbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        znb znbVar = this.b;
        switch (b) {
            case 0:
                jn7.e().k(274, znbVar, Boolean.TRUE, null, -1);
                return;
            default:
                znbVar.r();
                return;
        }
    }
}
