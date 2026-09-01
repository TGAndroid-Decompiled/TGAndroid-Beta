package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f20300a;
    public final String f20301b;
    public final String f20302c;
    public final long d;

    public vh(int i10, long j10, String str, String str2) {
        this.f20300a = i10;
        this.f20301b = str;
        this.f20302c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20300a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f20301b, this.f20302c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f20301b, this.f20302c, this.d);
                return;
        }
    }
}
