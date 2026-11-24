package defpackage;
public final class wn5 implements Runnable {
    public final byte a;
    public final yn5 b;
    public final dy7 c;

    public wn5(yn5 yn5Var, dy7 dy7Var, byte b) {
        this.a = b;
        this.b = yn5Var;
        this.c = dy7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dy7 dy7Var = this.c;
        yn5 yn5Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new wn5(yn5Var, dy7Var, (byte) 1));
                return;
            default:
                yn5Var.i = dy7Var.a;
                return;
        }
    }
}
