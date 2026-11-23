package org.telegram.messenger;
public final class nt implements Runnable {
    public final int f25999a;
    public final String f26000b;
    public final String f26001c;
    public final long d;

    public nt(long j3, String str, String str2, int i7) {
        this.f25999a = i7;
        this.f26000b = str;
        this.f26001c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f25999a) {
            case 0:
                PushListenerController.c(this.d, this.f26000b, this.f26001c);
                return;
            default:
                PushListenerController.h(this.d, this.f26000b, this.f26001c);
                return;
        }
    }
}
