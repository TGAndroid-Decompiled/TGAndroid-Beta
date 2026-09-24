package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f16393a = 0;
    public final TranslateController f16394b;
    public final long f16395c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f16394b = translateController;
        this.f16395c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16393a) {
            case 0:
                this.f16394b.lambda$setDialogTranslateTo$0(this.f16395c, (String) this.d);
                return;
            default:
                long j3 = this.f16395c;
                this.f16394b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16394b = translateController;
        this.d = messageObject;
        this.f16395c = j3;
    }
}
