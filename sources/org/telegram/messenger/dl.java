package org.telegram.messenger;

public final class dl implements Runnable {

    public final int f20088a = 1;

    public final TranslateController f20089b;

    public final long f20090c;
    public final Object d;

    public dl(TranslateController translateController, long j10, String str) {
        this.f20089b = translateController;
        this.f20090c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20088a) {
            case 0:
                this.f20089b.lambda$invalidateTranslation$9((MessageObject) this.d, this.f20090c);
                break;
            default:
                this.f20089b.lambda$setDialogTranslateTo$0(this.f20090c, (String) this.d);
                break;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f20089b = translateController;
        this.d = messageObject;
        this.f20090c = j10;
    }
}
