package org.telegram.messenger;
public final class md implements Runnable {
    public final int f23996a;
    public final sd f23997b;
    public final Integer f23998c;

    public md(sd sdVar, Integer num, int i7) {
        this.f23996a = i7;
        this.f23997b = sdVar;
        this.f23998c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f23996a;
        Integer num = this.f23998c;
        sd sdVar = this.f23997b;
        switch (i7) {
            case 0:
                if (!sdVar.f25442b.isEmpty()) {
                    g0.h3(new md(sdVar, num, 1));
                    return;
                }
                return;
            default:
                sdVar.getNotificationCenter().k(76, num);
                return;
        }
    }
}
