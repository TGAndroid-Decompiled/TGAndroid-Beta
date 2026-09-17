package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19034a;
    public final String f19035b;
    public final String f19036c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19034a = i10;
        this.f19035b = str;
        this.f19036c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19034a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19035b, this.f19036c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19035b, this.f19036c, this.d);
                return;
        }
    }
}
