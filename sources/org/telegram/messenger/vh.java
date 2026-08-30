package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f18678a;
    public final String f18679b;
    public final String f18680c;
    public final long d;

    public vh(int i10, long j10, String str, String str2) {
        this.f18678a = i10;
        this.f18679b = str;
        this.f18680c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18678a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f18679b, this.f18680c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f18679b, this.f18680c, this.d);
                return;
        }
    }
}
