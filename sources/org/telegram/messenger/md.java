package org.telegram.messenger;
public final class md implements Runnable {
    public final int f25534a;
    public final rd f25535b;
    public final Integer f25536c;

    public md(rd rdVar, Integer num, int i7) {
        this.f25534a = i7;
        this.f25535b = rdVar;
        this.f25536c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f25534a;
        Integer num = this.f25536c;
        rd rdVar = this.f25535b;
        switch (i7) {
            case 0:
                if (!rdVar.f26555b.isEmpty()) {
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
