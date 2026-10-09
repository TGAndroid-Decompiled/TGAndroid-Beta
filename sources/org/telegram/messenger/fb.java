package org.telegram.messenger;
public final class fb implements Runnable {
    public final int f17827a;
    public final q0.a f17828b;
    public final int f17829c;

    public fb(q0.a aVar, int i10, int i11) {
        this.f17827a = i11;
        this.f17828b = aVar;
        this.f17829c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17827a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17828b, this.f17829c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17828b, this.f17829c);
                return;
        }
    }
}
