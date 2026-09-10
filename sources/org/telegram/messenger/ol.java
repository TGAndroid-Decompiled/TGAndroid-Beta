package org.telegram.messenger;
public final class ol implements Runnable {
    public final int f16009a = 0;
    public final TranslateController f16010b;
    public final long f16011c;
    public final Object d;

    public ol(TranslateController translateController, long j3, String str) {
        this.f16010b = translateController;
        this.f16011c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16009a) {
            case 0:
                this.f16010b.lambda$setDialogTranslateTo$0(this.f16011c, (String) this.d);
                return;
            default:
                long j3 = this.f16011c;
                this.f16010b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public ol(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16010b = translateController;
        this.d = messageObject;
        this.f16011c = j3;
    }
}
