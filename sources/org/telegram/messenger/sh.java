package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f17530a;
    public final String f17531b;
    public final String f17532c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f17530a = i10;
        this.f17531b = str;
        this.f17532c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17530a) {
            case 0:
                PushListenerController.c(this.d, this.f17531b, this.f17532c);
                return;
            default:
                PushListenerController.h(this.d, this.f17531b, this.f17532c);
                return;
        }
    }
}
