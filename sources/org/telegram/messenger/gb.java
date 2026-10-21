package org.telegram.messenger;
public final class gb implements Runnable {
    public final int f18442a;
    public final q0.a f18443b;
    public final int f18444c;

    public gb(q0.a aVar, int i10, int i11) {
        this.f18442a = i11;
        this.f18443b = aVar;
        this.f18444c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18442a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18443b, this.f18444c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18443b, this.f18444c);
                return;
        }
    }
}
