package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f16826a;
    public final q0.a f16827b;
    public final int f16828c;

    public bb(q0.a aVar, int i10, int i11) {
        this.f16826a = i11;
        this.f16827b = aVar;
        this.f16828c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16826a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f16827b, this.f16828c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f16827b, this.f16828c);
                return;
        }
    }
}
