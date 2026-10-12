package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f19220a;
    public final String f19221b;
    public final String f19222c;
    public final long d;

    public vh(int i10, long j3, String str, String str2) {
        this.f19220a = i10;
        this.f19221b = str;
        this.f19222c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19220a) {
            case 0:
                PushListenerController.c(this.d, this.f19221b, this.f19222c);
                return;
            default:
                PushListenerController.h(this.d, this.f19221b, this.f19222c);
                return;
        }
    }
}
