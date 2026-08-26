package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda114 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final Utilities.Callback f$1;
    public final long f$2;
    public final long f$3;

    public MessagesStorage$$ExternalSyntheticLambda114(MessagesStorage messagesStorage, Utilities.Callback callback, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = callback;
        this.f$2 = j;
        this.f$3 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getEphemeralMessages$208(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$getEphemeralMessages$207(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
