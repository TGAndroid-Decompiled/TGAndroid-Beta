package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f22704a;
    public final ld f22705b;
    public final Integer f22706c;

    public gd(ld ldVar, Integer num, int i3) {
        this.f22704a = i3;
        this.f22705b = ldVar;
        this.f22706c = num;
    }

    @Override
    public final void run() {
        int i3 = this.f22704a;
        Integer num = this.f22706c;
        ld ldVar = this.f22705b;
        switch (i3) {
            case 0:
                if (!ldVar.f23975b.isEmpty()) {
                    g0.h3(new gd(ldVar, num, 1));
                    return;
                }
                return;
            default:
                ldVar.getNotificationCenter().k(76, num);
                return;
        }
    }
}
