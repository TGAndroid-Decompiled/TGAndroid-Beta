package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f18030a;
    public final MessagesController f18031b;
    public final int f18032c;

    public ca(MessagesController messagesController, int i10, int i11) {
        this.f18030a = i11;
        this.f18031b = messagesController;
        this.f18032c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18030a) {
            case 0:
                MessagesController.V2(this.f18031b, this.f18032c);
                return;
            case 1:
                MessagesController.f8(this.f18031b, this.f18032c);
                return;
            case 2:
                MessagesController.O(this.f18031b, this.f18032c);
                return;
            default:
                MessagesController.j3(this.f18031b, this.f18032c);
                return;
        }
    }
}
