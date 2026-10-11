package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19209a;
    public final String f19210b;
    public final String f19211c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19209a = i10;
        this.f19210b = str;
        this.f19211c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19209a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19210b, this.f19211c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19210b, this.f19211c, this.d);
                return;
        }
    }
}
