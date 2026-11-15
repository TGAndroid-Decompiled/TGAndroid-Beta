package org.telegram.messenger;
public final class pt implements Runnable {
    public final int f25973a;
    public final String f25974b;
    public final String f25975c;
    public final long d;

    public pt(int i7, long j3, String str, String str2) {
        this.f25973a = i7;
        this.f25974b = str;
        this.f25975c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25973a) {
            case 0:
                PushListenerController.c(this.d, this.f25974b, this.f25975c);
                return;
            default:
                PushListenerController.h(this.d, this.f25974b, this.f25975c);
                return;
        }
    }
}
