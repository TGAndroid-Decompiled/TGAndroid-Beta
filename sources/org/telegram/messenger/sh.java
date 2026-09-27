package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f17539a;
    public final String f17540b;
    public final String f17541c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f17539a = i10;
        this.f17540b = str;
        this.f17541c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17539a) {
            case 0:
                PushListenerController.c(this.d, this.f17540b, this.f17541c);
                return;
            default:
                PushListenerController.h(this.d, this.f17540b, this.f17541c);
                return;
        }
    }
}
