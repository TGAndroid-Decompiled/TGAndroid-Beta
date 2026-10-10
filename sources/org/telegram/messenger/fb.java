package org.telegram.messenger;
public final class fb implements Runnable {
    public final int f17831a;
    public final q0.a f17832b;
    public final int f17833c;

    public fb(q0.a aVar, int i10, int i11) {
        this.f17831a = i11;
        this.f17832b = aVar;
        this.f17833c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17831a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17832b, this.f17833c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17832b, this.f17833c);
                return;
        }
    }
}
