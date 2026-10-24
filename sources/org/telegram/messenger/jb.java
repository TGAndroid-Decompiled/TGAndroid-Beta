package org.telegram.messenger;
public final class jb implements Runnable {
    public final int f18748a;
    public final q0.a f18749b;
    public final int f18750c;

    public jb(q0.a aVar, int i10, int i11) {
        this.f18748a = i11;
        this.f18749b = aVar;
        this.f18750c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18748a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18749b, this.f18750c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18749b, this.f18750c);
                return;
        }
    }
}
