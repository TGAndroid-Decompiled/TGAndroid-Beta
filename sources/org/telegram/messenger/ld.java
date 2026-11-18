package org.telegram.messenger;
public final class ld implements Runnable {
    public final int f25364a;
    public final qd f25365b;
    public final Integer f25366c;

    public ld(qd qdVar, Integer num, int i7) {
        this.f25364a = i7;
        this.f25365b = qdVar;
        this.f25366c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f25364a;
        Integer num = this.f25366c;
        qd qdVar = this.f25365b;
        switch (i7) {
            case 0:
                if (!qdVar.f26380b.isEmpty()) {
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
