package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f21569a;
    public final String f21570b;
    public final String f21571c;
    public final long d;

    public sh(int i10, long j10, String str, String str2) {
        this.f21569a = i10;
        this.f21570b = str;
        this.f21571c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21569a) {
            case 0:
                PushListenerController.c(this.d, this.f21570b, this.f21571c);
                return;
            default:
                PushListenerController.h(this.d, this.f21570b, this.f21571c);
                return;
        }
    }
}
