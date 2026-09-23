package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f17298a;
    public final String f17299b;
    public final String f17300c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f17298a = i10;
        this.f17299b = str;
        this.f17300c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17298a) {
            case 0:
                PushListenerController.c(this.d, this.f17299b, this.f17300c);
                return;
            default:
                PushListenerController.h(this.d, this.f17299b, this.f17300c);
                return;
        }
    }
}
