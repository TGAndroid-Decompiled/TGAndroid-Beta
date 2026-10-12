package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f17864a;
    public final q0.a f17865b;
    public final int f17866c;

    public ib(q0.a aVar, int i10, int i11) {
        this.f17864a = i11;
        this.f17865b = aVar;
        this.f17866c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17864a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17865b, this.f17866c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17865b, this.f17866c);
                return;
        }
    }
}
