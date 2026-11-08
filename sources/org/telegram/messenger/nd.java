package org.telegram.messenger;
public final class nd implements Runnable {
    public final int f24184a;
    public final sd f24185b;
    public final Integer f24186c;

    public nd(sd sdVar, Integer num, int i7) {
        this.f24184a = i7;
        this.f24185b = sdVar;
        this.f24186c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f24184a;
        Integer num = this.f24186c;
        sd sdVar = this.f24185b;
        switch (i7) {
            case 0:
                if (!sdVar.f25456b.isEmpty()) {
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
