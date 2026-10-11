package org.telegram.messenger;
public final class fb implements Runnable {
    public final int f17866a;
    public final q0.a f17867b;
    public final int f17868c;

    public fb(q0.a aVar, int i10, int i11) {
        this.f17866a = i11;
        this.f17867b = aVar;
        this.f17868c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17866a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17867b, this.f17868c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17867b, this.f17868c);
                return;
        }
    }
}
