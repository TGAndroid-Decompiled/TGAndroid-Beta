package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda120 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;
    public final int f$2;
    public final boolean f$3;
    public final int f$4;
    public final int f$5;

    public MessagesController$$ExternalSyntheticLambda120(MessagesController messagesController, long j, int i, boolean z, int i2, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = z;
        this.f$4 = i2;
        this.f$5 = i3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$markDialogAsRead$243(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
            default:
                this.f$0.lambda$markDialogAsRead$244(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
        }
    }
}
