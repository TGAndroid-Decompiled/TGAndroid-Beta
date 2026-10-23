package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f18613a;
    public final q0.a f18614b;
    public final int f18615c;

    public ib(q0.a aVar, int i10, int i11) {
        this.f18613a = i11;
        this.f18614b = aVar;
        this.f18615c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18613a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18614b, this.f18615c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18614b, this.f18615c);
                return;
        }
    }
}
