package org.telegram.messenger;
public final class nh implements Runnable {
    public final int f19110a;
    public final String f19111b;
    public final String f19112c;
    public final long d;

    public nh(int i10, long j10, String str, String str2) {
        this.f19110a = i10;
        this.f19111b = str;
        this.f19112c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19110a) {
            case 0:
                PushListenerController.c(this.d, this.f19111b, this.f19112c);
                return;
            default:
                PushListenerController.h(this.d, this.f19111b, this.f19112c);
                return;
        }
    }
}
