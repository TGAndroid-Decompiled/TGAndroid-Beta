package org.telegram.messenger;

public final class SavedMessagesController$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final SavedMessagesController f$0;

    public SavedMessagesController$$ExternalSyntheticLambda5(SavedMessagesController savedMessagesController, int i) {
        this.$r8$classId = i;
        this.f$0 = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteCache$12();
                break;
            case 1:
                this.f$0.update();
                break;
            case 2:
                this.f$0.saveCache();
                break;
            case 3:
                this.f$0.lambda$saveCache$10();
                break;
            default:
                this.f$0.lambda$loadDialogs$1();
                break;
        }
    }
}
