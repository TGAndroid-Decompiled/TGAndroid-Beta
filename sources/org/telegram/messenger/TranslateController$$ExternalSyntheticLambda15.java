package org.telegram.messenger;

public final class TranslateController$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final TranslateController f$0;
    public final String f$1;
    public final MessageObject f$2;
    public final long f$3;
    public final int f$4;

    public TranslateController$$ExternalSyntheticLambda15(TranslateController translateController, String str, MessageObject messageObject, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = translateController;
        this.f$1 = str;
        this.f$2 = messageObject;
        this.f$3 = j;
        this.f$4 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkLanguage$16(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$checkLanguage$12(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
