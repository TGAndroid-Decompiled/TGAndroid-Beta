package org.telegram.messenger;

public final class TranslateController$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final TranslateController f$0;
    public final long f$1;

    public TranslateController$$ExternalSyntheticLambda8(TranslateController translateController, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = translateController;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkDialogMessageSure$11(this.f$1);
                break;
            default:
                this.f$0.lambda$checkDialogTranslatable$17(this.f$1);
                break;
        }
    }
}
