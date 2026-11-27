package defpackage;
public final class cd6 implements Runnable {
    public final byte a;
    public final id6 b;
    public final Integer c;

    public cd6(id6 id6Var, Integer num, byte b) {
        this.a = b;
        this.b = id6Var;
        this.c = num;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Integer num = this.c;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                if (!id6Var.b.isEmpty()) {
                    hl.c3(new cd6(id6Var, num, (byte) 1));
                    return;
                }
                return;
            default:
                id6Var.getNotificationCenter().k(77, num);
                return;
        }
    }
}
