package org.telegram.messenger;
public final class nh implements Runnable {
    public final int f19106a;
    public final String f19107b;
    public final String f19108c;
    public final long d;

    public nh(int i10, long j10, String str, String str2) {
        this.f19106a = i10;
        this.f19107b = str;
        this.f19108c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19106a) {
            case 0:
                PushListenerController.c(this.d, this.f19107b, this.f19108c);
                return;
            default:
                PushListenerController.h(this.d, this.f19107b, this.f19108c);
                return;
        }
    }
}
