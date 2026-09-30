package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f17565a;
    public final String f17566b;
    public final String f17567c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f17565a = i10;
        this.f17566b = str;
        this.f17567c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17565a) {
            case 0:
                PushListenerController.c(this.d, this.f17566b, this.f17567c);
                return;
            default:
                PushListenerController.h(this.d, this.f17566b, this.f17567c);
                return;
        }
    }
}
