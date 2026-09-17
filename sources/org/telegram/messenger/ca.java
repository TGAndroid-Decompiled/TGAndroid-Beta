package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f17372a;
    public final MessagesController f17373b;
    public final int f17374c;

    public ca(MessagesController messagesController, int i10, int i11) {
        this.f17372a = i11;
        this.f17373b = messagesController;
        this.f17374c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17372a) {
            case 0:
                MessagesController.A1(this.f17373b, this.f17374c);
                return;
            case 1:
                MessagesController.H3(this.f17373b, this.f17374c);
                return;
            case 2:
                MessagesController.z8(this.f17373b, this.f17374c);
                return;
            default:
                MessagesController.w4(this.f17373b, this.f17374c);
                return;
        }
    }
}
