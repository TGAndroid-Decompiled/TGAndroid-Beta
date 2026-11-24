package defpackage;
public final class hx9 implements Runnable {
    public final byte a;
    public final py b;

    public hx9(py pyVar, byte b) {
        this.a = b;
        this.b = pyVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        py pyVar = this.b;
        switch (b) {
            case 0:
                gl.E3(((lw9) pyVar.f2).h);
                return;
            default:
                pyVar.requestFocus();
                return;
        }
    }
}
