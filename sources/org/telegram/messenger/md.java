package org.telegram.messenger;
public final class md implements Runnable {
    public final int f25028a;
    public final rd f25029b;
    public final Integer f25030c;

    public md(rd rdVar, Integer num, int i7) {
        this.f25028a = i7;
        this.f25029b = rdVar;
        this.f25030c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f25028a;
        Integer num = this.f25030c;
        rd rdVar = this.f25029b;
        switch (i7) {
            case 0:
                if (!rdVar.f26278b.isEmpty()) {
                    g0.h3(new md(rdVar, num, 1));
                    return;
                }
                return;
            default:
                rdVar.getNotificationCenter().k(76, num);
                return;
        }
    }
}
