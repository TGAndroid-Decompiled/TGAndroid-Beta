package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f17545a;
    public final String f17546b;
    public final String f17547c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f17545a = i10;
        this.f17546b = str;
        this.f17547c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17545a) {
            case 0:
                PushListenerController.c(this.d, this.f17546b, this.f17547c);
                return;
            default:
                PushListenerController.h(this.d, this.f17546b, this.f17547c);
                return;
        }
    }
}
