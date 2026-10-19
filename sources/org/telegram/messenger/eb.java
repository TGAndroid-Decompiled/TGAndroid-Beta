package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f18276a;
    public final q0.a f18277b;
    public final int f18278c;

    public eb(q0.a aVar, int i10, int i11) {
        this.f18276a = i11;
        this.f18277b = aVar;
        this.f18278c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18276a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18277b, this.f18278c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18277b, this.f18278c);
                return;
        }
    }
}
