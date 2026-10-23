package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f19822a;
    public final boolean[] f19823b;

    public vc(int i10, boolean[] zArr) {
        this.f19822a = i10;
        this.f19823b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19822a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.f19823b);
                return;
            default:
                MessagesController.lambda$openApp$500(this.f19823b);
                return;
        }
    }
}
