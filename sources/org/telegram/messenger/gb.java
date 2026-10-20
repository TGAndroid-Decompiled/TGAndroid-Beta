package org.telegram.messenger;
public final class gb implements Runnable {
    public final int f18449a;
    public final q0.a f18450b;
    public final int f18451c;

    public gb(q0.a aVar, int i10, int i11) {
        this.f18449a = i11;
        this.f18450b = aVar;
        this.f18451c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18449a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18450b, this.f18451c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18450b, this.f18451c);
                return;
        }
    }
}
