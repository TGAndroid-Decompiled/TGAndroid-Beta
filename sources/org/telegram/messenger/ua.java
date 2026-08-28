package org.telegram.messenger;
public final class ua implements Runnable {
    public final int f21648a;
    public final q0.a f21649b;
    public final int f21650c;

    public ua(q0.a aVar, int i9, int i10) {
        this.f21648a = i10;
        this.f21649b = aVar;
        this.f21650c = i9;
    }

    @Override
    public final void run() {
        switch (this.f21648a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f21649b, this.f21650c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f21649b, this.f21650c);
                return;
        }
    }
}
