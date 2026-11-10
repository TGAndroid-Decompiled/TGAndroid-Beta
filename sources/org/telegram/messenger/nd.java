package org.telegram.messenger;
public final class nd implements Runnable {
    public final int f24188a;
    public final sd f24189b;
    public final Integer f24190c;

    public nd(sd sdVar, Integer num, int i7) {
        this.f24188a = i7;
        this.f24189b = sdVar;
        this.f24190c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f24188a;
        Integer num = this.f24190c;
        sd sdVar = this.f24189b;
        switch (i7) {
            case 0:
                if (!sdVar.f25460b.isEmpty()) {
                    g0.h3(new nd(sdVar, num, 1));
                    return;
                }
                return;
            default:
                sdVar.getNotificationCenter().k(76, num);
                return;
        }
    }
}
