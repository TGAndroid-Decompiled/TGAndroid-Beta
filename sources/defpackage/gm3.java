package defpackage;
public final class gm3 implements Runnable {
    public final byte a = 1;
    public final String b;
    public final p8c c;

    public gm3(p8c p8cVar, String str) {
        this.c = p8cVar;
        this.b = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                p8cVar.a(str);
                return;
            default:
                gl.d3(new lw8(p8cVar, hv8.c(str, gl.L(240.0f), w34.M, 0.75f, null), (byte) 1));
                return;
        }
    }

    public gm3(String str, p8c p8cVar) {
        this.b = str;
        this.c = p8cVar;
    }
}
