package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f19721a;
    public final SavedMessagesController f19722b;

    public bi(SavedMessagesController savedMessagesController, int i10) {
        this.f19721a = i10;
        this.f19722b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19721a) {
            case 0:
                this.f19722b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19722b);
                return;
            case 2:
                SavedMessagesController.h(this.f19722b);
                return;
            case 3:
                SavedMessagesController.j(this.f19722b);
                return;
            default:
                SavedMessagesController.b(this.f19722b);
                return;
        }
    }
}
