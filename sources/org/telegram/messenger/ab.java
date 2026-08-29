package org.telegram.messenger;
public final class ab implements Runnable {
    public final int f19695a;
    public final q0.a f19696b;
    public final int f19697c;

    public ab(q0.a aVar, int i10, int i11) {
        this.f19695a = i11;
        this.f19696b = aVar;
        this.f19697c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19695a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19696b, this.f19697c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19696b, this.f19697c);
                return;
        }
    }
}
