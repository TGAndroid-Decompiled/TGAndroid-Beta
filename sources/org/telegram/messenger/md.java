package org.telegram.messenger;
public final class md implements Runnable {
    public final int f25022a;
    public final rd f25023b;
    public final Integer f25024c;

    public md(rd rdVar, Integer num, int i7) {
        this.f25022a = i7;
        this.f25023b = rdVar;
        this.f25024c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f25022a;
        Integer num = this.f25024c;
        rd rdVar = this.f25023b;
        switch (i7) {
            case 0:
                if (!rdVar.f26270b.isEmpty()) {
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
