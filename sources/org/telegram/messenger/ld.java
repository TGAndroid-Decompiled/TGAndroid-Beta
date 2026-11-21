package org.telegram.messenger;
public final class ld implements Runnable {
    public final int f25392a;
    public final qd f25393b;
    public final Integer f25394c;

    public ld(qd qdVar, Integer num, int i7) {
        this.f25392a = i7;
        this.f25393b = qdVar;
        this.f25394c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f25392a;
        Integer num = this.f25394c;
        qd qdVar = this.f25393b;
        switch (i7) {
            case 0:
                if (!qdVar.f26408b.isEmpty()) {
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
