package org.telegram.messenger;
public final class mt implements Runnable {
    public final int f25838a;
    public final String f25839b;
    public final String f25840c;
    public final long d;

    public mt(long j3, String str, String str2, int i7) {
        this.f25838a = i7;
        this.f25839b = str;
        this.f25840c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25838a) {
            case 0:
                PushListenerController.c(this.d, this.f25839b, this.f25840c);
                return;
            default:
                PushListenerController.h(this.d, this.f25839b, this.f25840c);
                return;
        }
    }
}
