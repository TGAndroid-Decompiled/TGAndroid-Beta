package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f16416a = 0;
    public final TranslateController f16417b;
    public final long f16418c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f16417b = translateController;
        this.f16418c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16416a) {
            case 0:
                this.f16417b.lambda$setDialogTranslateTo$0(this.f16418c, (String) this.d);
                return;
            default:
                long j3 = this.f16418c;
                this.f16417b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16417b = translateController;
        this.d = messageObject;
        this.f16418c = j3;
    }
}
