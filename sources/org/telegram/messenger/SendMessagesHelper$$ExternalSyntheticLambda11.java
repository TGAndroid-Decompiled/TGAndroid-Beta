package org.telegram.messenger;

public final class SendMessagesHelper$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final CharSequence f$0;
    public final AccountInstance f$1;
    public final long f$2;
    public final long f$3;
    public final boolean f$4;
    public final int f$5;
    public final int f$6;
    public final long f$7;

    public SendMessagesHelper$$ExternalSyntheticLambda11(CharSequence charSequence, AccountInstance accountInstance, long j, long j2, boolean z, int i, int i2, long j3, int i3) {
        this.$r8$classId = i3;
        this.f$0 = charSequence;
        this.f$1 = accountInstance;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = z;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$7 = j3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                break;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                break;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                break;
        }
    }
}
