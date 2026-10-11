package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19173a;
    public final String f19174b;
    public final String f19175c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19173a = i10;
        this.f19174b = str;
        this.f19175c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19173a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19174b, this.f19175c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19174b, this.f19175c, this.d);
                return;
        }
    }
}
