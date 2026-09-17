package org.telegram.messenger;
public final class xa implements Runnable {
    public final int f19622a;
    public final q0.a f19623b;
    public final int f19624c;

    public xa(q0.a aVar, int i10, int i11) {
        this.f19622a = i11;
        this.f19623b = aVar;
        this.f19624c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19622a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19623b, this.f19624c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19623b, this.f19624c);
                return;
        }
    }
}
