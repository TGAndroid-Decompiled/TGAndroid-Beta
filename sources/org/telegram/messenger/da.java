package org.telegram.messenger;
public final class da implements Runnable {
    public final int f17675a;
    public final MessagesController f17676b;
    public final int f17677c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f17675a = i11;
        this.f17676b = messagesController;
        this.f17677c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17675a) {
            case 0:
                MessagesController.V2(this.f17676b, this.f17677c);
                return;
            case 1:
                MessagesController.f8(this.f17676b, this.f17677c);
                return;
            case 2:
                MessagesController.O(this.f17676b, this.f17677c);
                return;
            default:
                MessagesController.j3(this.f17676b, this.f17677c);
                return;
        }
    }
}
