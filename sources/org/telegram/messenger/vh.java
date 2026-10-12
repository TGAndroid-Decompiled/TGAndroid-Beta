package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f18695a;
    public final String f18696b;
    public final String f18697c;
    public final long d;

    public vh(int i10, long j10, String str, String str2) {
        this.f18695a = i10;
        this.f18696b = str;
        this.f18697c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18695a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f18696b, this.f18697c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f18696b, this.f18697c, this.d);
                return;
        }
    }
}
