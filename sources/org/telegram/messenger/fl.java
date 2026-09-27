package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f16405a = 0;
    public final TranslateController f16406b;
    public final long f16407c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f16406b = translateController;
        this.f16407c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16405a) {
            case 0:
                this.f16406b.lambda$setDialogTranslateTo$0(this.f16407c, (String) this.d);
                return;
            default:
                long j3 = this.f16407c;
                this.f16406b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16406b = translateController;
        this.d = messageObject;
        this.f16407c = j3;
    }
}
