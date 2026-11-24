package defpackage;
public final class za6 implements Runnable {
    public final byte a;
    public final eb6 b;
    public final Integer c;

    public za6(eb6 eb6Var, Integer num, byte b) {
        this.a = b;
        this.b = eb6Var;
        this.c = num;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Integer num = this.c;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                if (!eb6Var.b.isEmpty()) {
                    gl.c3(new za6(eb6Var, num, (byte) 1));
                    return;
                }
                return;
            default:
                eb6Var.getNotificationCenter().k(76, num);
                return;
        }
    }
}
