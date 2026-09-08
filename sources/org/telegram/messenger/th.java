package org.telegram.messenger;
public final class th implements Runnable {
    public final int f19118a;
    public final String f19119b;
    public final String f19120c;
    public final long d;

    public th(int i10, long j3, String str, String str2) {
        this.f19118a = i10;
        this.f19119b = str;
        this.f19120c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19118a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19119b, this.f19120c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19119b, this.f19120c, this.d);
                return;
        }
    }
}
