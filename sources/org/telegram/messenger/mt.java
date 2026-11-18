package org.telegram.messenger;
public final class mt implements Runnable {
    public final int f25836a;
    public final String f25837b;
    public final String f25838c;
    public final long d;

    public mt(long j3, String str, String str2, int i7) {
        this.f25836a = i7;
        this.f25837b = str;
        this.f25838c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25836a) {
            case 0:
                PushListenerController.c(this.d, this.f25837b, this.f25838c);
                return;
            default:
                PushListenerController.h(this.d, this.f25837b, this.f25838c);
                return;
        }
    }
}
