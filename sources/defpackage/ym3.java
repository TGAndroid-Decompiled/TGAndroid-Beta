package defpackage;
public final class ym3 implements Runnable {
    public final byte a = 1;
    public final String b;
    public final pcc c;

    public ym3(pcc pccVar, String str) {
        this.c = pccVar;
        this.b = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                pccVar.a(str);
                return;
            default:
                hl.c3(new yz8(pccVar, sy8.c(str, hl.L(240.0f), r44.M, 0.75f, null), (byte) 0));
                return;
        }
    }

    public ym3(String str, pcc pccVar) {
        this.b = str;
        this.c = pccVar;
    }
}
