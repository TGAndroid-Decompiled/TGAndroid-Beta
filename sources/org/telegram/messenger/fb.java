package org.telegram.messenger;
public final class fb implements Runnable {
    public final int f15163a;
    public final q0.a f15164b;
    public final int f15165c;

    public fb(q0.a aVar, int i10, int i11) {
        this.f15163a = i11;
        this.f15164b = aVar;
        this.f15165c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15163a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f15164b, this.f15165c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f15164b, this.f15165c);
                return;
        }
    }
}
