package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19170a;
    public final String f19171b;
    public final String f19172c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19170a = i10;
        this.f19171b = str;
        this.f19172c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19170a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19171b, this.f19172c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19171b, this.f19172c, this.d);
                return;
        }
    }
}
