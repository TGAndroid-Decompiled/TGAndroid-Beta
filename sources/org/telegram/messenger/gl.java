package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f16258a = 0;
    public final TranslateController f16259b;
    public final long f16260c;
    public final Object d;

    public gl(TranslateController translateController, long j3, String str) {
        this.f16259b = translateController;
        this.f16260c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16258a) {
            case 0:
                this.f16259b.lambda$setDialogTranslateTo$0(this.f16260c, (String) this.d);
                return;
            default:
                long j3 = this.f16260c;
                this.f16259b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16259b = translateController;
        this.d = messageObject;
        this.f16260c = j3;
    }
}
