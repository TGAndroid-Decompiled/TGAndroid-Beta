package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19163a;
    public final String f19164b;
    public final String f19165c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19163a = i10;
        this.f19164b = str;
        this.f19165c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19163a) {
            case 0:
                PushListenerController.c(this.d, this.f19164b, this.f19165c);
                return;
            default:
                PushListenerController.h(this.d, this.f19164b, this.f19165c);
                return;
        }
    }
}
