package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f16840a;
    public final q0.a f16841b;
    public final int f16842c;

    public bb(q0.a aVar, int i10, int i11) {
        this.f16840a = i11;
        this.f16841b = aVar;
        this.f16842c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16840a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f16841b, this.f16842c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f16841b, this.f16842c);
                return;
        }
    }
}
