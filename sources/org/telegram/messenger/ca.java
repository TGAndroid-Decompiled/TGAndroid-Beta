package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f18042a;
    public final MessagesController f18043b;
    public final int f18044c;

    public ca(MessagesController messagesController, int i10, int i11) {
        this.f18042a = i11;
        this.f18043b = messagesController;
        this.f18044c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18042a) {
            case 0:
                MessagesController.V2(this.f18043b, this.f18044c);
                return;
            case 1:
                MessagesController.f8(this.f18043b, this.f18044c);
                return;
            case 2:
                MessagesController.O(this.f18043b, this.f18044c);
                return;
            default:
                MessagesController.j3(this.f18043b, this.f18044c);
                return;
        }
    }
}
