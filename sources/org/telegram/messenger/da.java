package org.telegram.messenger;
public final class da implements Runnable {
    public final int f17639a;
    public final MessagesController f17640b;
    public final int f17641c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f17639a = i11;
        this.f17640b = messagesController;
        this.f17641c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17639a) {
            case 0:
                MessagesController.V2(this.f17640b, this.f17641c);
                return;
            case 1:
                MessagesController.f8(this.f17640b, this.f17641c);
                return;
            case 2:
                MessagesController.O(this.f17640b, this.f17641c);
                return;
            default:
                MessagesController.j3(this.f17640b, this.f17641c);
                return;
        }
    }
}
