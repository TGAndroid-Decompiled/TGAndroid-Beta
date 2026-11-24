package defpackage;
public final class uy implements Runnable {
    public final byte a;
    public final ez b;

    public uy(ez ezVar, byte b) {
        this.a = b;
        this.b = ezVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ez ezVar = this.b;
        switch (b) {
            case 0:
                ezVar.onBackPressed();
                return;
            default:
                ezVar.a1();
                return;
        }
    }
}
