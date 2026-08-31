package org.telegram.messenger;
public final class il implements Runnable {
    public final int f19006a = 0;
    public final TranslateController f19007b;
    public final long f19008c;
    public final Object d;

    public il(TranslateController translateController, long j10, String str) {
        this.f19007b = translateController;
        this.f19008c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19006a) {
            case 0:
                this.f19007b.lambda$setDialogTranslateTo$0(this.f19008c, (String) this.d);
                return;
            default:
                long j10 = this.f19008c;
                this.f19007b.lambda$invalidateTranslation$9((MessageObject) this.d, j10);
                return;
        }
    }

    public il(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f19007b = translateController;
        this.d = messageObject;
        this.f19008c = j10;
    }
}
