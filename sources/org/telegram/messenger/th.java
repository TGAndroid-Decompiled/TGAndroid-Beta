package org.telegram.messenger;
public final class th implements Runnable {
    public final int f21336a;
    public final String f21337b;
    public final String f21338c;
    public final long d;

    public th(int i10, long j10, String str, String str2) {
        this.f21336a = i10;
        this.f21337b = str;
        this.f21338c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21336a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f21337b, this.f21338c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f21337b, this.f21338c, this.d);
                return;
        }
    }
}
