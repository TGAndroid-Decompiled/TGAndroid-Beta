package org.telegram.messenger;
public final class eu implements Runnable {
    public final int f15644a;
    public final String f15645b;
    public final String f15646c;
    public final long d;

    public eu(int i10, long j10, String str, String str2) {
        this.f15644a = i10;
        this.f15645b = str;
        this.f15646c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15644a) {
            case 0:
                PushListenerController.c(this.d, this.f15645b, this.f15646c);
                return;
            default:
                PushListenerController.h(this.d, this.f15645b, this.f15646c);
                return;
        }
    }
}
