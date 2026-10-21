package org.telegram.messenger;
public final class ph implements Runnable {
    public final int f19273a;
    public final String f19274b;
    public final String f19275c;
    public final long d;

    public ph(int i10, long j10, String str, String str2) {
        this.f19273a = i10;
        this.f19274b = str;
        this.f19275c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19273a) {
            case 0:
                PushListenerController.c(this.d, this.f19274b, this.f19275c);
                return;
            default:
                PushListenerController.h(this.d, this.f19274b, this.f19275c);
                return;
        }
    }
}
