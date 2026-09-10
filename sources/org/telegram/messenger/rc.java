package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f16227a;
    public final boolean[] f16228b;

    public rc(int i10, boolean[] zArr) {
        this.f16227a = i10;
        this.f16228b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16227a) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f16228b);
                return;
            default:
                MessagesController.lambda$openApp$497(this.f16228b);
                return;
        }
    }
}
