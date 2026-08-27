package org.telegram.messenger;

public final class wk implements Runnable {

    public final int f22080a;

    public final TranslateController f22081b;

    public final long f22082c;

    public wk(TranslateController translateController, long j10, int i10) {
        this.f22080a = i10;
        this.f22081b = translateController;
        this.f22082c = j10;
    }

    @Override
    public final void run() {
        switch (this.f22080a) {
            case 0:
                this.f22081b.lambda$checkDialogTranslatable$17(this.f22082c);
                break;
            default:
                this.f22081b.lambda$checkDialogMessageSure$11(this.f22082c);
                break;
        }
    }
}
