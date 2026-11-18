package org.telegram.messenger;
public final class ld implements Runnable {
    public final int f25366a;
    public final qd f25367b;
    public final Integer f25368c;

    public ld(qd qdVar, Integer num, int i7) {
        this.f25366a = i7;
        this.f25367b = qdVar;
        this.f25368c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f25366a;
        Integer num = this.f25368c;
        qd qdVar = this.f25367b;
        switch (i7) {
            case 0:
                if (!qdVar.f26382b.isEmpty()) {
                    g0.g3(new ld(qdVar, num, 1));
                    return;
                }
                return;
            default:
                qdVar.getNotificationCenter().k(76, num);
                return;
        }
    }
}
