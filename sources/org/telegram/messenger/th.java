package org.telegram.messenger;
public final class th implements Runnable {
    public final int f17403a;
    public final String f17404b;
    public final String f17405c;
    public final long d;

    public th(int i10, long j3, String str, String str2) {
        this.f17403a = i10;
        this.f17404b = str;
        this.f17405c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17403a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f17404b, this.f17405c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f17404b, this.f17405c, this.d);
                return;
        }
    }
}
