package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda320 implements Runnable {
    public final int $r8$classId;
    public final boolean[] f$0;

    public MessagesController$$ExternalSyntheticLambda320(int i, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$0 = zArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagesController.lambda$openByUserName$456(this.f$0);
                break;
            default:
                MessagesController.lambda$openApp$497(this.f$0);
                break;
        }
    }
}
