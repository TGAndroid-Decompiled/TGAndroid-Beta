package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f18660a;
    public final String f18661b;
    public final String f18662c;
    public final long d;

    public vh(int i10, long j10, String str, String str2) {
        this.f18660a = i10;
        this.f18661b = str;
        this.f18662c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18660a) {
            case 0:
                PushListenerController.c(this.d, this.f18661b, this.f18662c);
                return;
            default:
                PushListenerController.h(this.d, this.f18661b, this.f18662c);
                return;
        }
    }
}
