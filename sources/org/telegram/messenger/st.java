package org.telegram.messenger;
public final class st implements Runnable {
    public final int f25513a;
    public final String f25514b;
    public final String f25515c;
    public final long d;

    public st(int i7, long j3, String str, String str2) {
        this.f25513a = i7;
        this.f25514b = str;
        this.f25515c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25513a) {
            case 0:
                PushListenerController.c(this.d, this.f25514b, this.f25515c);
                return;
            default:
                PushListenerController.h(this.d, this.f25514b, this.f25515c);
                return;
        }
    }
}
