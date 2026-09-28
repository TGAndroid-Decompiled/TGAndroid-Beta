package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f17548a;
    public final String f17549b;
    public final String f17550c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f17548a = i10;
        this.f17549b = str;
        this.f17550c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17548a) {
            case 0:
                PushListenerController.c(this.d, this.f17549b, this.f17550c);
                return;
            default:
                PushListenerController.h(this.d, this.f17549b, this.f17550c);
                return;
        }
    }
}
