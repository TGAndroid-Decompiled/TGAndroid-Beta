package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f16408a = 0;
    public final TranslateController f16409b;
    public final long f16410c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f16409b = translateController;
        this.f16410c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16408a) {
            case 0:
                this.f16409b.lambda$setDialogTranslateTo$0(this.f16410c, (String) this.d);
                return;
            default:
                long j3 = this.f16410c;
                this.f16409b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16409b = translateController;
        this.d = messageObject;
        this.f16410c = j3;
    }
}
