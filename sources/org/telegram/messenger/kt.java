package org.telegram.messenger;
public final class kt implements Runnable {
    public final int f23869a;
    public final String f23870b;
    public final String f23871c;
    public final long d;

    public kt(int i3, long j10, String str, String str2) {
        this.f23869a = i3;
        this.f23870b = str;
        this.f23871c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f23869a) {
            case 0:
                PushListenerController.c(this.d, this.f23870b, this.f23871c);
                return;
            default:
                PushListenerController.h(this.d, this.f23870b, this.f23871c);
                return;
        }
    }
}
