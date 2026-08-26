package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda81 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage.IntCallback f$0;
    public final int f$1;

    public MessagesStorage$$ExternalSyntheticLambda81(MessagesStorage.IntCallback intCallback, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = intCallback;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(this.f$1);
                break;
            case 1:
                this.f$0.run(this.f$1);
                break;
            default:
                this.f$0.run(this.f$1);
                break;
        }
    }
}
