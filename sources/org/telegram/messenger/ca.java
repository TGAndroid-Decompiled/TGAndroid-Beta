package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f17345a;
    public final MessagesController f17346b;
    public final int f17347c;

    public ca(MessagesController messagesController, int i10, int i11) {
        this.f17345a = i11;
        this.f17346b = messagesController;
        this.f17347c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17345a) {
            case 0:
                MessagesController.A1(this.f17346b, this.f17347c);
                return;
            case 1:
                MessagesController.H3(this.f17346b, this.f17347c);
                return;
            case 2:
                MessagesController.z8(this.f17346b, this.f17347c);
                return;
            default:
                MessagesController.w4(this.f17346b, this.f17347c);
                return;
        }
    }
}
