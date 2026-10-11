package org.telegram.messenger;
public final class fb implements Runnable {
    public final int f17830a;
    public final q0.a f17831b;
    public final int f17832c;

    public fb(q0.a aVar, int i10, int i11) {
        this.f17830a = i11;
        this.f17831b = aVar;
        this.f17832c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17830a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17831b, this.f17832c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17831b, this.f17832c);
                return;
        }
    }
}
