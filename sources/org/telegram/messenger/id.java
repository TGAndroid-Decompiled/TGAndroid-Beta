package org.telegram.messenger;
public final class id implements Runnable {
    public final int f16115a;
    public final nd f16116b;
    public final Integer f16117c;

    public id(nd ndVar, Integer num, int i10) {
        this.f16115a = i10;
        this.f16116b = ndVar;
        this.f16117c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f16115a;
        Integer num = this.f16117c;
        nd ndVar = this.f16116b;
        switch (i10) {
            case 0:
                if (!ndVar.f17083b.isEmpty()) {
                    i0.g3(new id(ndVar, num, 1));
                    return;
                }
                return;
            default:
                ndVar.getNotificationCenter().k(76, num);
                return;
        }
    }
}
