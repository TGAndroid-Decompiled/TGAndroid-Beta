package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19007a;
    public final String f19008b;
    public final String f19009c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19007a = i10;
        this.f19008b = str;
        this.f19009c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19007a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19008b, this.f19009c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19008b, this.f19009c, this.d);
                return;
        }
    }
}
