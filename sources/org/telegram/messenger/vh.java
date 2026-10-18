package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f19759a;
    public final SavedMessagesController f19760b;

    public vh(SavedMessagesController savedMessagesController, int i10) {
        this.f19759a = i10;
        this.f19760b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19759a) {
            case 0:
                this.f19760b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19760b);
                return;
            case 2:
                SavedMessagesController.h(this.f19760b);
                return;
            case 3:
                SavedMessagesController.j(this.f19760b);
                return;
            default:
                SavedMessagesController.b(this.f19760b);
                return;
        }
    }
}
