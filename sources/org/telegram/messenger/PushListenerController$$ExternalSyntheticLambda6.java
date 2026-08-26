package org.telegram.messenger;

public final class PushListenerController$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final String f$0;
    public final String f$1;
    public final long f$2;

    public PushListenerController$$ExternalSyntheticLambda6(int i, long j, String str, String str2) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(this.f$0, this.f$1, this.f$2);
                break;
            default:
                PushListenerController.lambda$processRemoteMessage$7(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
