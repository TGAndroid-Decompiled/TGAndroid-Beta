package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f20331a;
    public final q0.a f20332b;
    public final int f20333c;

    public ib(q0.a aVar, int i10, int i11) {
        this.f20331a = i11;
        this.f20332b = aVar;
        this.f20333c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20331a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f20332b, this.f20333c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f20332b, this.f20333c);
                return;
        }
    }
}
