package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f16504a = 0;
    public final TranslateController f16505b;
    public final long f16506c;
    public final Object d;

    public gl(TranslateController translateController, long j3, String str) {
        this.f16505b = translateController;
        this.f16506c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16504a) {
            case 0:
                this.f16505b.lambda$setDialogTranslateTo$0(this.f16506c, (String) this.d);
                return;
            default:
                long j3 = this.f16506c;
                this.f16505b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16505b = translateController;
        this.d = messageObject;
        this.f16506c = j3;
    }
}
