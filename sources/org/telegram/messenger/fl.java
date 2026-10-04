package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f17897a = 0;
    public final TranslateController f17898b;
    public final long f17899c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f17898b = translateController;
        this.f17899c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17897a) {
            case 0:
                this.f17898b.lambda$setDialogTranslateTo$0(this.f17899c, (String) this.d);
                return;
            default:
                long j3 = this.f17899c;
                this.f17898b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17898b = translateController;
        this.d = messageObject;
        this.f17899c = j3;
    }
}
