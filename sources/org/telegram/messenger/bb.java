package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f18254a;
    public final q0.a f18255b;
    public final int f18256c;

    public bb(q0.a aVar, int i10, int i11) {
        this.f18254a = i11;
        this.f18255b = aVar;
        this.f18256c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18254a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18255b, this.f18256c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18255b, this.f18256c);
                return;
        }
    }
}
