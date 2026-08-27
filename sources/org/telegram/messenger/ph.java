package org.telegram.messenger;

public final class ph implements Runnable {

    public final int f21281a;

    public final String f21282b;

    public final String f21283c;
    public final long d;

    public ph(int i10, long j10, String str, String str2) {
        this.f21281a = i10;
        this.f21282b = str;
        this.f21283c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21281a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f21282b, this.f21283c, this.d);
                break;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f21282b, this.f21283c, this.d);
                break;
        }
    }
}
