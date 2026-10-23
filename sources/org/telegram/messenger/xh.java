package org.telegram.messenger;
public final class xh implements Runnable {
    public final int f20155a;
    public final SavedMessagesController f20156b;

    public xh(SavedMessagesController savedMessagesController, int i10) {
        this.f20155a = i10;
        this.f20156b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f20155a) {
            case 0:
                this.f20156b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f20156b);
                return;
            case 2:
                SavedMessagesController.h(this.f20156b);
                return;
            case 3:
                SavedMessagesController.j(this.f20156b);
                return;
            default:
                SavedMessagesController.b(this.f20156b);
                return;
        }
    }
}
