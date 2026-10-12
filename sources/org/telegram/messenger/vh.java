package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f19219a;
    public final String f19220b;
    public final String f19221c;
    public final long d;

    public vh(int i10, long j3, String str, String str2) {
        this.f19219a = i10;
        this.f19220b = str;
        this.f19221c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19219a) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f19220b, this.f19221c, this.d);
                return;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f19220b, this.f19221c, this.d);
                return;
        }
    }
}
