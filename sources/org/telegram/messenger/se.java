package org.telegram.messenger;

public final class se implements Runnable {

    public final int f21540a;

    public final MessagesStorage.IntCallback f21541b;

    public final int f21542c;

    public se(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f21540a = i11;
        this.f21541b = intCallback;
        this.f21542c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21540a) {
            case 0:
                this.f21541b.run(this.f21542c);
                break;
            case 1:
                this.f21541b.run(this.f21542c);
                break;
            default:
                this.f21541b.run(this.f21542c);
                break;
        }
    }
}
