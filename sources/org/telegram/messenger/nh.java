package org.telegram.messenger;
public final class nh implements Runnable {
    public final int f19107a;
    public final String f19108b;
    public final String f19109c;
    public final long d;

    public nh(int i10, long j10, String str, String str2) {
        this.f19107a = i10;
        this.f19108b = str;
        this.f19109c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19107a) {
            case 0:
                PushListenerController.c(this.d, this.f19108b, this.f19109c);
                return;
            default:
                PushListenerController.h(this.d, this.f19108b, this.f19109c);
                return;
        }
    }
}
