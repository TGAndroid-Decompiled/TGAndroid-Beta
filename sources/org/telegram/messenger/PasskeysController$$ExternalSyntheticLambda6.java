package org.telegram.messenger;

public final class PasskeysController$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback2 f$0;
    public final Exception f$1;

    public PasskeysController$$ExternalSyntheticLambda6(Utilities.Callback2 callback2, Exception exc, int i) {
        this.$r8$classId = i;
        this.f$0 = callback2;
        this.f$1 = exc;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PasskeysController.lambda$create$3(this.f$0, this.f$1);
                break;
            default:
                PasskeysController.lambda$create$8(this.f$0, this.f$1);
                break;
        }
    }
}
