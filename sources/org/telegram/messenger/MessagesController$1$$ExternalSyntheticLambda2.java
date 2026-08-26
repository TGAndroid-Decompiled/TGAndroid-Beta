package org.telegram.messenger;

public final class MessagesController$1$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final Utilities.Callback2 f$1;

    public MessagesController$1$$ExternalSyntheticLambda2(int i, int i2, Utilities.Callback2 callback2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = callback2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f$0, this.f$1);
                break;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f$0, this.f$1);
                break;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f$0, this.f$1);
                break;
        }
    }
}
