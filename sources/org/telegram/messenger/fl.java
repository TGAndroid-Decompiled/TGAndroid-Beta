package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f16150a = 0;
    public final TranslateController f16151b;
    public final long f16152c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f16151b = translateController;
        this.f16152c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16150a) {
            case 0:
                this.f16151b.lambda$setDialogTranslateTo$0(this.f16152c, (String) this.d);
                return;
            default:
                long j3 = this.f16152c;
                this.f16151b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16151b = translateController;
        this.d = messageObject;
        this.f16152c = j3;
    }
}
