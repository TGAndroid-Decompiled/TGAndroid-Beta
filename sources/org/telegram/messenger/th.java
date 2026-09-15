package org.telegram.messenger;
public final class th implements Runnable {
    public final int f17407a;
    public final String f17408b;
    public final String f17409c;
    public final long d;

    public th(int i10, long j3, String str, String str2) {
        this.f17407a = i10;
        this.f17408b = str;
        this.f17409c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17407a) {
            case 0:
                PushListenerController.c(this.d, this.f17408b, this.f17409c);
                return;
            default:
                PushListenerController.h(this.d, this.f17408b, this.f17409c);
                return;
        }
    }
}
