package org.telegram.messenger;

public final class PasskeysController$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final boolean[] f$0;
    public final Runnable[] f$1;

    public PasskeysController$$ExternalSyntheticLambda2(boolean[] zArr, Runnable[] runnableArr, int i) {
        this.$r8$classId = i;
        this.f$0 = zArr;
        this.f$1 = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PasskeysController.lambda$login$12(this.f$0, this.f$1);
                break;
            default:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f$0, this.f$1);
                break;
        }
    }
}
