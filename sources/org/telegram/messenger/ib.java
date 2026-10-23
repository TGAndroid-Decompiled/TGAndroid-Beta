package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f18681a;
    public final q0.a f18682b;
    public final int f18683c;

    public ib(q0.a aVar, int i10, int i11) {
        this.f18681a = i11;
        this.f18682b = aVar;
        this.f18683c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18681a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18682b, this.f18683c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18682b, this.f18683c);
                return;
        }
    }
}
