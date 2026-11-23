package org.telegram.messenger;
public final class mt implements Runnable {
    public final int f25931a;
    public final String f25932b;
    public final String f25933c;
    public final long d;

    public mt(long j3, String str, String str2, int i7) {
        this.f25931a = i7;
        this.f25932b = str;
        this.f25933c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25931a) {
            case 0:
                PushListenerController.c(this.d, this.f25932b, this.f25933c);
                return;
            default:
                PushListenerController.h(this.d, this.f25932b, this.f25933c);
                return;
        }
    }
}
