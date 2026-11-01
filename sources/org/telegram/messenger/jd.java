package org.telegram.messenger;
public final class jd implements Runnable {
    public final int f16450a;
    public final od f16451b;
    public final Integer f16452c;

    public jd(od odVar, Integer num, int i10) {
        this.f16450a = i10;
        this.f16451b = odVar;
        this.f16452c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f16450a;
        Integer num = this.f16452c;
        od odVar = this.f16451b;
        switch (i10) {
            case 0:
                if (!odVar.f17420b.isEmpty()) {
                    i0.g3(new jd(odVar, num, 1));
                    return;
                }
                return;
            default:
                odVar.getNotificationCenter().k(76, num);
                return;
        }
    }
}
