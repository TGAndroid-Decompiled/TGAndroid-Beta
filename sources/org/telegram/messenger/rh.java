package org.telegram.messenger;
public final class rh implements Runnable {
    public final int f19409a;
    public final String f19410b;
    public final String f19411c;
    public final long d;

    public rh(int i10, long j10, String str, String str2) {
        this.f19409a = i10;
        this.f19410b = str;
        this.f19411c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19409a) {
            case 0:
                PushListenerController.c(this.d, this.f19410b, this.f19411c);
                return;
            default:
                PushListenerController.h(this.d, this.f19410b, this.f19411c);
                return;
        }
    }
}
