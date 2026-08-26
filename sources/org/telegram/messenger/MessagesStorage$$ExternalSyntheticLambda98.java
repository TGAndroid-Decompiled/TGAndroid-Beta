package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda98 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final long f$1;
    public final long f$2;
    public final String f$3;

    public MessagesStorage$$ExternalSyntheticLambda98(MessagesStorage messagesStorage, long j, long j2, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateRanksInLastMessages$46(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$updateRanksInLastMessages$45(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
