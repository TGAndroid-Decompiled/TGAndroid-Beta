package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f17892a = 0;
    public final TranslateController f17893b;
    public final long f17894c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f17893b = translateController;
        this.f17894c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17892a) {
            case 0:
                this.f17893b.lambda$setDialogTranslateTo$0(this.f17894c, (String) this.d);
                return;
            default:
                long j3 = this.f17894c;
                this.f17893b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17893b = translateController;
        this.d = messageObject;
        this.f17894c = j3;
    }
}
