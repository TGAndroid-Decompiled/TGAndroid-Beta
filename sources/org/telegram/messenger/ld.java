package org.telegram.messenger;
public final class ld implements Runnable {
    public final int f25483a;
    public final qd f25484b;
    public final Integer f25485c;

    public ld(qd qdVar, Integer num, int i7) {
        this.f25483a = i7;
        this.f25484b = qdVar;
        this.f25485c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f25483a;
        Integer num = this.f25485c;
        qd qdVar = this.f25484b;
        switch (i7) {
            case 0:
                if (!qdVar.f26492b.isEmpty()) {
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
