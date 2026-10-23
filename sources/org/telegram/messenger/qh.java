package org.telegram.messenger;
public final class qh implements Runnable {
    public final int f19407a;
    public final String f19408b;
    public final String f19409c;
    public final long d;

    public qh(int i10, long j10, String str, String str2) {
        this.f19407a = i10;
        this.f19408b = str;
        this.f19409c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19407a) {
            case 0:
                PushListenerController.c(this.d, this.f19408b, this.f19409c);
                return;
            default:
                PushListenerController.h(this.d, this.f19408b, this.f19409c);
                return;
        }
    }
}
