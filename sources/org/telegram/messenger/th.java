package org.telegram.messenger;
public final class th implements Runnable {
    public final int f17635a;
    public final String f17636b;
    public final String f17637c;
    public final long d;

    public th(int i10, long j3, String str, String str2) {
        this.f17635a = i10;
        this.f17636b = str;
        this.f17637c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17635a) {
            case 0:
                PushListenerController.c(this.d, this.f17636b, this.f17637c);
                return;
            default:
                PushListenerController.h(this.d, this.f17636b, this.f17637c);
                return;
        }
    }
}
