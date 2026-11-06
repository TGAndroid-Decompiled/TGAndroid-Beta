package org.telegram.messenger;
public final class st implements Runnable {
    public final int f25505a;
    public final String f25506b;
    public final String f25507c;
    public final long d;

    public st(int i7, long j3, String str, String str2) {
        this.f25505a = i7;
        this.f25506b = str;
        this.f25507c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25505a) {
            case 0:
                PushListenerController.c(this.d, this.f25506b, this.f25507c);
                return;
            default:
                PushListenerController.h(this.d, this.f25506b, this.f25507c);
                return;
        }
    }
}
