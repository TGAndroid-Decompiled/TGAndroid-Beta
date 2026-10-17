package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f18265a;
    public final q0.a f18266b;
    public final int f18267c;

    public eb(q0.a aVar, int i10, int i11) {
        this.f18265a = i11;
        this.f18266b = aVar;
        this.f18267c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18266b, this.f18267c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18266b, this.f18267c);
                return;
        }
    }
}
