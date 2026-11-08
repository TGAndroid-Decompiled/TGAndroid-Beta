package org.telegram.messenger;
public final class st implements Runnable {
    public final int f25519a;
    public final String f25520b;
    public final String f25521c;
    public final long d;

    public st(int i7, long j3, String str, String str2) {
        this.f25519a = i7;
        this.f25520b = str;
        this.f25521c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25519a) {
            case 0:
                PushListenerController.c(this.d, this.f25520b, this.f25521c);
                return;
            default:
                PushListenerController.h(this.d, this.f25520b, this.f25521c);
                return;
        }
    }
}
