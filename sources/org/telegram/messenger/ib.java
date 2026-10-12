package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f17863a;
    public final q0.a f17864b;
    public final int f17865c;

    public ib(q0.a aVar, int i10, int i11) {
        this.f17863a = i11;
        this.f17864b = aVar;
        this.f17865c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17863a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17864b, this.f17865c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17864b, this.f17865c);
                return;
        }
    }
}
