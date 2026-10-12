package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f17482a;
    public final q0.a f17483b;
    public final int f17484c;

    public ib(q0.a aVar, int i10, int i11) {
        this.f17482a = i11;
        this.f17483b = aVar;
        this.f17484c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17482a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17483b, this.f17484c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17483b, this.f17484c);
                return;
        }
    }
}
