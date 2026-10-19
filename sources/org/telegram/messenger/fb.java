package org.telegram.messenger;
public final class fb implements Runnable {
    public final int f18359a;
    public final q0.a f18360b;
    public final int f18361c;

    public fb(q0.a aVar, int i10, int i11) {
        this.f18359a = i11;
        this.f18360b = aVar;
        this.f18361c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18359a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18360b, this.f18361c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18360b, this.f18361c);
                return;
        }
    }
}
