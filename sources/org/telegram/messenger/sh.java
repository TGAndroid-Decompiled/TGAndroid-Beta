package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f21259a;
    public final String f21260b;
    public final String f21261c;
    public final long d;

    public sh(int i10, long j10, String str, String str2) {
        this.f21259a = i10;
        this.f21260b = str;
        this.f21261c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21259a) {
            case 0:
                PushListenerController.c(this.d, this.f21260b, this.f21261c);
                return;
            default:
                PushListenerController.h(this.d, this.f21260b, this.f21261c);
                return;
        }
    }
}
