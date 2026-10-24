package org.telegram.messenger;
public final class rh implements Runnable {
    public final int f19479a;
    public final String f19480b;
    public final String f19481c;
    public final long d;

    public rh(int i10, long j10, String str, String str2) {
        this.f19479a = i10;
        this.f19480b = str;
        this.f19481c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19479a) {
            case 0:
                PushListenerController.c(this.d, this.f19480b, this.f19481c);
                return;
            default:
                PushListenerController.h(this.d, this.f19480b, this.f19481c);
                return;
        }
    }
}
