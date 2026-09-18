package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f16444a = 0;
    public final TranslateController f16445b;
    public final long f16446c;
    public final Object d;

    public gl(TranslateController translateController, long j3, String str) {
        this.f16445b = translateController;
        this.f16446c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16444a) {
            case 0:
                this.f16445b.lambda$setDialogTranslateTo$0(this.f16446c, (String) this.d);
                return;
            default:
                long j3 = this.f16446c;
                this.f16445b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16445b = translateController;
        this.d = messageObject;
        this.f16446c = j3;
    }
}
