package org.telegram.messenger;
public final class aa implements Runnable {
    public final int f19717a;
    public final MessagesController f19718b;
    public final int f19719c;

    public aa(MessagesController messagesController, int i9, int i10) {
        this.f19717a = i10;
        this.f19718b = messagesController;
        this.f19719c = i9;
    }

    @Override
    public final void run() {
        switch (this.f19717a) {
            case 0:
                MessagesController.B1(this.f19718b, this.f19719c);
                return;
            case 1:
                MessagesController.I3(this.f19718b, this.f19719c);
                return;
            case 2:
                MessagesController.z8(this.f19718b, this.f19719c);
                return;
            default:
                MessagesController.x4(this.f19718b, this.f19719c);
                return;
        }
    }
}
