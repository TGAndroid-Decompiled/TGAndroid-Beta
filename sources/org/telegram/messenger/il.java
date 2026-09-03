package org.telegram.messenger;
public final class il implements Runnable {
    public final int f19008a = 0;
    public final TranslateController f19009b;
    public final long f19010c;
    public final Object d;

    public il(TranslateController translateController, long j10, String str) {
        this.f19009b = translateController;
        this.f19010c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19008a) {
            case 0:
                this.f19009b.lambda$setDialogTranslateTo$0(this.f19010c, (String) this.d);
                return;
            default:
                long j10 = this.f19010c;
                this.f19009b.lambda$invalidateTranslation$9((MessageObject) this.d, j10);
                return;
        }
    }

    public il(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f19009b = translateController;
        this.d = messageObject;
        this.f19010c = j10;
    }
}
