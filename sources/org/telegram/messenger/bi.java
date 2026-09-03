package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f18290a;
    public final SavedMessagesController f18291b;

    public bi(SavedMessagesController savedMessagesController, int i10) {
        this.f18290a = i10;
        this.f18291b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18290a) {
            case 0:
                this.f18291b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18291b);
                return;
            case 2:
                SavedMessagesController.h(this.f18291b);
                return;
            case 3:
                SavedMessagesController.j(this.f18291b);
                return;
            default:
                SavedMessagesController.b(this.f18291b);
                return;
        }
    }
}
