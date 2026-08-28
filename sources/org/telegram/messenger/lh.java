package org.telegram.messenger;
public final class lh implements Runnable {
    public final int f20902a;
    public final String f20903b;
    public final String f20904c;
    public final long d;

    public lh(int i9, long j10, String str, String str2) {
        this.f20902a = i9;
        this.f20903b = str;
        this.f20904c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20902a) {
            case 0:
                PushListenerController.c(this.d, this.f20903b, this.f20904c);
                return;
            default:
                PushListenerController.h(this.d, this.f20903b, this.f20904c);
                return;
        }
    }
}
