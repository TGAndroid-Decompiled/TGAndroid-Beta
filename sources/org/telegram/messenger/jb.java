package org.telegram.messenger;
public final class jb implements Runnable {
    public final int f18680a;
    public final q0.a f18681b;
    public final int f18682c;

    public jb(q0.a aVar, int i10, int i11) {
        this.f18680a = i11;
        this.f18681b = aVar;
        this.f18682c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18680a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18681b, this.f18682c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18681b, this.f18682c);
                return;
        }
    }
}
