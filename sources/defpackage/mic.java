package defpackage;
public final class mic implements Runnable {
    public final byte a;
    public final ric b;
    public final int c;

    public mic(ric ricVar, int i, byte b) {
        this.a = b;
        this.b = ricVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ric ricVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new mic(ricVar, i, (byte) 2));
                return;
            case 1:
                gl.d3(new mic(ricVar, i, (byte) 3));
                return;
            case 2:
                ricVar.c(i);
                return;
            default:
                ricVar.a(i);
                return;
        }
    }
}
