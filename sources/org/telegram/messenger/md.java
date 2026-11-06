package org.telegram.messenger;
public final class md implements Runnable {
    public final int f24003a;
    public final sd f24004b;
    public final Integer f24005c;

    public md(sd sdVar, Integer num, int i7) {
        this.f24003a = i7;
        this.f24004b = sdVar;
        this.f24005c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f24003a;
        Integer num = this.f24005c;
        sd sdVar = this.f24004b;
        switch (i7) {
            case 0:
                if (!sdVar.f25450b.isEmpty()) {
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
