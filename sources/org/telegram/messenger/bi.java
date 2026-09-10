package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f14805a;
    public final String f14806b;
    public final String f14807c;
    public final long d;

    public bi(int i10, long j3, String str, String str2) {
        this.f14805a = i10;
        this.f14806b = str;
        this.f14807c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f14805a) {
            case 0:
                PushListenerController.c(this.d, this.f14806b, this.f14807c);
                return;
            default:
                PushListenerController.h(this.d, this.f14806b, this.f14807c);
                return;
        }
    }
}
