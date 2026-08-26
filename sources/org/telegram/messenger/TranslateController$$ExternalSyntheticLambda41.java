package org.telegram.messenger;

public final class TranslateController$$ExternalSyntheticLambda41 implements Runnable {
    public final int $r8$classId = 1;
    public final TranslateController f$0;
    public final Object f$1;
    public final long f$2;

    public TranslateController$$ExternalSyntheticLambda41(TranslateController translateController, long j, String str) {
        this.f$0 = translateController;
        this.f$2 = j;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$invalidateTranslation$9((MessageObject) this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$setDialogTranslateTo$0(this.f$2, (String) this.f$1);
                break;
        }
    }

    public TranslateController$$ExternalSyntheticLambda41(TranslateController translateController, MessageObject messageObject, long j) {
        this.f$0 = translateController;
        this.f$1 = messageObject;
        this.f$2 = j;
    }
}
