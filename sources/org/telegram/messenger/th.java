package org.telegram.messenger;
public final class th implements Runnable {
    public final int f17589a;
    public final String f17590b;
    public final String f17591c;
    public final long d;

    public th(int i10, long j3, String str, String str2) {
        this.f17589a = i10;
        this.f17590b = str;
        this.f17591c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17589a) {
            case 0:
                PushListenerController.c(this.d, this.f17590b, this.f17591c);
                return;
            default:
                PushListenerController.h(this.d, this.f17590b, this.f17591c);
                return;
        }
    }
}
