package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f20678a;
    public final q0.a f20679b;
    public final int f20680c;

    public mb(q0.a aVar, int i10, int i11) {
        this.f20678a = i11;
        this.f20679b = aVar;
        this.f20680c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20678a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f20679b, this.f20680c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f20679b, this.f20680c);
                return;
        }
    }
}
