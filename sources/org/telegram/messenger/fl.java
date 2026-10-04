package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f17896a = 0;
    public final TranslateController f17897b;
    public final long f17898c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f17897b = translateController;
        this.f17898c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17896a) {
            case 0:
                this.f17897b.lambda$setDialogTranslateTo$0(this.f17898c, (String) this.d);
                return;
            default:
                long j3 = this.f17898c;
                this.f17897b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17897b = translateController;
        this.d = messageObject;
        this.f17898c = j3;
    }
}
