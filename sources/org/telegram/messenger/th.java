package org.telegram.messenger;
public final class th implements Runnable {
    public final int f19091a;
    public final String f19092b;
    public final String f19093c;
    public final long d;

    public th(int i10, long j3, String str, String str2) {
        this.f19091a = i10;
        this.f19092b = str;
        this.f19093c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19091a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19092b, this.f19093c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19092b, this.f19093c, this.d);
                return;
        }
    }
}
