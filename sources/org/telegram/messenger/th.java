package org.telegram.messenger;
public final class th implements Runnable {
    public final int f17416a;
    public final String f17417b;
    public final String f17418c;
    public final long d;

    public th(int i10, long j3, String str, String str2) {
        this.f17416a = i10;
        this.f17417b = str;
        this.f17418c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17416a) {
            case 0:
                PushListenerController.c(this.d, this.f17417b, this.f17418c);
                return;
            default:
                PushListenerController.h(this.d, this.f17417b, this.f17418c);
                return;
        }
    }
}
