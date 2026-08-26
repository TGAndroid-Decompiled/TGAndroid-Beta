package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda79 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final boolean f$1;

    public MessagesStorage$$ExternalSyntheticLambda79(MessagesStorage messagesStorage, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$cleanup$6(this.f$1);
                break;
            default:
                this.f$0.lambda$getCachedPhoneBook$150(this.f$1);
                break;
        }
    }
}
