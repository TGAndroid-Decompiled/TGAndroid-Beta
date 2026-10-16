package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f18393a;
    public final String f18394b;
    public final String f18395c;
    public final long d;

    public vh(int i10, long j10, String str, String str2) {
        this.f18393a = i10;
        this.f18394b = str;
        this.f18395c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18393a) {
            case 0:
                PushListenerController.c(this.d, this.f18394b, this.f18395c);
                return;
            default:
                PushListenerController.h(this.d, this.f18394b, this.f18395c);
                return;
        }
    }
}
