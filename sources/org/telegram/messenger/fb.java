package org.telegram.messenger;
public final class fb implements Runnable {
    public final int f18356a;
    public final q0.a f18357b;
    public final int f18358c;

    public fb(q0.a aVar, int i10, int i11) {
        this.f18356a = i11;
        this.f18357b = aVar;
        this.f18358c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18356a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18357b, this.f18358c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18357b, this.f18358c);
                return;
        }
    }
}
