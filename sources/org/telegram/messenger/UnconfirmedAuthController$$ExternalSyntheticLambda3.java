package org.telegram.messenger;

public final class UnconfirmedAuthController$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final UnconfirmedAuthController f$0;

    public UnconfirmedAuthController$$ExternalSyntheticLambda3(UnconfirmedAuthController unconfirmedAuthController, int i) {
        this.$r8$classId = i;
        this.f$0 = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$readCache$1();
                break;
            case 1:
                this.f$0.lambda$saveCache$3();
                break;
            case 2:
                this.f$0.lambda$new$2();
                break;
            default:
                this.f$0.lambda$saveCache$4();
                break;
        }
    }
}
