package org.telegram.messenger;
public final class mt implements Runnable {
    public final int f25864a;
    public final String f25865b;
    public final String f25866c;
    public final long d;

    public mt(long j3, String str, String str2, int i7) {
        this.f25864a = i7;
        this.f25865b = str;
        this.f25866c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25864a) {
            case 0:
                PushListenerController.c(this.d, this.f25865b, this.f25866c);
                return;
            default:
                PushListenerController.h(this.d, this.f25865b, this.f25866c);
                return;
        }
    }
}
