package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f17178a;
    public final q0.a f17179b;
    public final int f17180c;

    public ib(q0.a aVar, int i10, int i11) {
        this.f17178a = i11;
        this.f17179b = aVar;
        this.f17180c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17178a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17179b, this.f17180c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17179b, this.f17180c);
                return;
        }
    }
}
