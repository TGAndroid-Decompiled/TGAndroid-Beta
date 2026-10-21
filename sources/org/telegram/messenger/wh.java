package org.telegram.messenger;
public final class wh implements Runnable {
    public final int f20004a;
    public final SavedMessagesController f20005b;

    public wh(SavedMessagesController savedMessagesController, int i10) {
        this.f20004a = i10;
        this.f20005b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f20004a) {
            case 0:
                this.f20005b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f20005b);
                return;
            case 2:
                SavedMessagesController.h(this.f20005b);
                return;
            case 3:
                SavedMessagesController.j(this.f20005b);
                return;
            default:
                SavedMessagesController.b(this.f20005b);
                return;
        }
    }
}
