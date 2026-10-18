package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f18279a;
    public final q0.a f18280b;
    public final int f18281c;

    public eb(q0.a aVar, int i10, int i11) {
        this.f18279a = i11;
        this.f18280b = aVar;
        this.f18281c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18279a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18280b, this.f18281c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18280b, this.f18281c);
                return;
        }
    }
}
