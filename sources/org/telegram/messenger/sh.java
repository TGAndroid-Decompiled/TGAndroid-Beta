package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19171a;
    public final String f19172b;
    public final String f19173c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19171a = i10;
        this.f19172b = str;
        this.f19173c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19171a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19172b, this.f19173c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19172b, this.f19173c, this.d);
                return;
        }
    }
}
