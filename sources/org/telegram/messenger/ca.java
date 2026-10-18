package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f18045a;
    public final MessagesController f18046b;
    public final int f18047c;

    public ca(MessagesController messagesController, int i10, int i11) {
        this.f18045a = i11;
        this.f18046b = messagesController;
        this.f18047c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18045a) {
            case 0:
                MessagesController.V2(this.f18046b, this.f18047c);
                return;
            case 1:
                MessagesController.f8(this.f18046b, this.f18047c);
                return;
            case 2:
                MessagesController.O(this.f18046b, this.f18047c);
                return;
            default:
                MessagesController.j3(this.f18046b, this.f18047c);
                return;
        }
    }
}
