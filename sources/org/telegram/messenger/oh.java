package org.telegram.messenger;
public final class oh implements Runnable {
    public final int f19186a;
    public final String f19187b;
    public final String f19188c;
    public final long d;

    public oh(int i10, long j10, String str, String str2) {
        this.f19186a = i10;
        this.f19187b = str;
        this.f19188c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19186a) {
            case 0:
                PushListenerController.c(this.d, this.f19187b, this.f19188c);
                return;
            default:
                PushListenerController.h(this.d, this.f19187b, this.f19188c);
                return;
        }
    }
}
