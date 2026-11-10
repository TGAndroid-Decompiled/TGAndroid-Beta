package org.telegram.messenger;
public final class st implements Runnable {
    public final int f25523a;
    public final String f25524b;
    public final String f25525c;
    public final long d;

    public st(int i7, long j3, String str, String str2) {
        this.f25523a = i7;
        this.f25524b = str;
        this.f25525c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25523a) {
            case 0:
                PushListenerController.c(this.d, this.f25524b, this.f25525c);
                return;
            default:
                PushListenerController.h(this.d, this.f25524b, this.f25525c);
                return;
        }
    }
}
