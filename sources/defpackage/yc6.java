package defpackage;
public final class yc6 implements Runnable {
    public final byte a;
    public final dd6 b;
    public final Integer c;

    public yc6(dd6 dd6Var, Integer num, byte b) {
        this.a = b;
        this.b = dd6Var;
        this.c = num;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Integer num = this.c;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                if (!dd6Var.b.isEmpty()) {
                    gm.c3(new yc6(dd6Var, num, (byte) 1));
                    return;
                }
                return;
            default:
                dd6Var.getNotificationCenter().k(77, num);
                return;
        }
    }
}
