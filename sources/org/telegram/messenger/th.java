package org.telegram.messenger;
public final class th implements Runnable {
    public final int f17620a;
    public final String f17621b;
    public final String f17622c;
    public final long d;

    public th(int i10, long j3, String str, String str2) {
        this.f17620a = i10;
        this.f17621b = str;
        this.f17622c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17620a) {
            case 0:
                PushListenerController.c(this.d, this.f17621b, this.f17622c);
                return;
            default:
                PushListenerController.h(this.d, this.f17621b, this.f17622c);
                return;
        }
    }
}
