package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f20302a;
    public final String f20303b;
    public final String f20304c;
    public final long d;

    public vh(int i10, long j10, String str, String str2) {
        this.f20302a = i10;
        this.f20303b = str;
        this.f20304c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20302a) {
            case 0:
                PushListenerController.c(this.d, this.f20303b, this.f20304c);
                return;
            default:
                PushListenerController.h(this.d, this.f20303b, this.f20304c);
                return;
        }
    }
}
