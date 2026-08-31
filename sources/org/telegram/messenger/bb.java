package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f18252a;
    public final q0.a f18253b;
    public final int f18254c;

    public bb(q0.a aVar, int i10, int i11) {
        this.f18252a = i11;
        this.f18253b = aVar;
        this.f18254c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18252a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18253b, this.f18254c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18253b, this.f18254c);
                return;
        }
    }
}
