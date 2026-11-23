package org.telegram.messenger;
public final class md implements Runnable {
    public final int f25570a;
    public final rd f25571b;
    public final Integer f25572c;

    public md(rd rdVar, Integer num, int i7) {
        this.f25570a = i7;
        this.f25571b = rdVar;
        this.f25572c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f25570a;
        Integer num = this.f25572c;
        rd rdVar = this.f25571b;
        switch (i7) {
            case 0:
                if (!rdVar.f26591b.isEmpty()) {
                    g0.g3(new md(rdVar, num, 1));
                    return;
                }
                return;
            default:
                rdVar.getNotificationCenter().k(76, num);
                return;
        }
    }
}
