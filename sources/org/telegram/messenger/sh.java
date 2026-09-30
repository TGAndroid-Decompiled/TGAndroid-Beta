package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f17549a;
    public final String f17550b;
    public final String f17551c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f17549a = i10;
        this.f17550b = str;
        this.f17551c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17549a) {
            case 0:
                PushListenerController.c(this.d, this.f17550b, this.f17551c);
                return;
            default:
                PushListenerController.h(this.d, this.f17550b, this.f17551c);
                return;
        }
    }
}
