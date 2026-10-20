package org.telegram.messenger;
public final class ph implements Runnable {
    public final int f19276a;
    public final String f19277b;
    public final String f19278c;
    public final long d;

    public ph(int i10, long j10, String str, String str2) {
        this.f19276a = i10;
        this.f19277b = str;
        this.f19278c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19276a) {
            case 0:
                PushListenerController.c(this.d, this.f19277b, this.f19278c);
                return;
            default:
                PushListenerController.h(this.d, this.f19277b, this.f19278c);
                return;
        }
    }
}
