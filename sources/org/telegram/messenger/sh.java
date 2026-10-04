package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19164a;
    public final String f19165b;
    public final String f19166c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19164a = i10;
        this.f19165b = str;
        this.f19166c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19164a) {
            case 0:
                PushListenerController.c(this.d, this.f19165b, this.f19166c);
                return;
            default:
                PushListenerController.h(this.d, this.f19165b, this.f19166c);
                return;
        }
    }
}
