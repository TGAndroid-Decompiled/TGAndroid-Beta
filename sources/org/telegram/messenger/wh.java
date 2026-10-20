package org.telegram.messenger;
public final class wh implements Runnable {
    public final int f20006a;
    public final SavedMessagesController f20007b;

    public wh(SavedMessagesController savedMessagesController, int i10) {
        this.f20006a = i10;
        this.f20007b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f20006a) {
            case 0:
                this.f20007b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f20007b);
                return;
            case 2:
                SavedMessagesController.h(this.f20007b);
                return;
            case 3:
                SavedMessagesController.j(this.f20007b);
                return;
            default:
                SavedMessagesController.b(this.f20007b);
                return;
        }
    }
}
