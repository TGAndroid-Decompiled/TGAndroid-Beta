package defpackage;
public final class rn3 implements Runnable {
    public final byte a = 1;
    public final String b;
    public final qac c;

    public rn3(qac qacVar, String str) {
        this.c = qacVar;
        this.b = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qac qacVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                qacVar.a(str);
                return;
            default:
                gm.c3(new ey8(qacVar, ix8.c(str, gm.L(240.0f), g54.M, 0.75f, null), (byte) 3));
                return;
        }
    }

    public rn3(String str, qac qacVar) {
        this.b = str;
        this.c = qacVar;
    }
}
