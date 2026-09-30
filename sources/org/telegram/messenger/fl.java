package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f16433a = 0;
    public final TranslateController f16434b;
    public final long f16435c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f16434b = translateController;
        this.f16435c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16433a) {
            case 0:
                this.f16434b.lambda$setDialogTranslateTo$0(this.f16435c, (String) this.d);
                return;
            default:
                long j3 = this.f16435c;
                this.f16434b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16434b = translateController;
        this.d = messageObject;
        this.f16435c = j3;
    }
}
