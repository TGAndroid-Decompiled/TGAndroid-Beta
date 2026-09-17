package org.telegram.messenger;
public final class xa implements Runnable {
    public final int f19649a;
    public final q0.a f19650b;
    public final int f19651c;

    public xa(q0.a aVar, int i10, int i11) {
        this.f19649a = i11;
        this.f19650b = aVar;
        this.f19651c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19649a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19650b, this.f19651c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19650b, this.f19651c);
                return;
        }
    }
}
