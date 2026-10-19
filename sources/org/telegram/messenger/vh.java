package org.telegram.messenger;
public final class vh implements Runnable {
    public final int f19762a;
    public final SavedMessagesController f19763b;

    public vh(SavedMessagesController savedMessagesController, int i10) {
        this.f19762a = i10;
        this.f19763b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19762a) {
            case 0:
                this.f19763b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19763b);
                return;
            case 2:
                SavedMessagesController.h(this.f19763b);
                return;
            case 3:
                SavedMessagesController.j(this.f19763b);
                return;
            default:
                SavedMessagesController.b(this.f19763b);
                return;
        }
    }
}
