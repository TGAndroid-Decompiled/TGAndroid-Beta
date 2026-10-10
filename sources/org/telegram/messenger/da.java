package org.telegram.messenger;
public final class da implements Runnable {
    public final int f17643a;
    public final MessagesController f17644b;
    public final int f17645c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f17643a = i11;
        this.f17644b = messagesController;
        this.f17645c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17643a) {
            case 0:
                MessagesController.V2(this.f17644b, this.f17645c);
                return;
            case 1:
                MessagesController.f8(this.f17644b, this.f17645c);
                return;
            case 2:
                MessagesController.O(this.f17644b, this.f17645c);
                return;
            default:
                MessagesController.j3(this.f17644b, this.f17645c);
                return;
        }
    }
}
