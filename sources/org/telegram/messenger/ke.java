package org.telegram.messenger;

public final class ke implements Runnable {

    public final int f20782a;

    public final int f20783b;

    public final Utilities.Callback2 f20784c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f20782a = i11;
        this.f20783b = i10;
        this.f20784c = callback2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20782a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f20783b, this.f20784c);
                break;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f20783b, this.f20784c);
                break;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f20783b, this.f20784c);
                break;
        }
    }
}
