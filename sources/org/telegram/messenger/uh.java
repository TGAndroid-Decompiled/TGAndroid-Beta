package org.telegram.messenger;
public final class uh implements Runnable {
    public final int f19681a;
    public final SavedMessagesController f19682b;

    public uh(SavedMessagesController savedMessagesController, int i10) {
        this.f19681a = i10;
        this.f19682b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19681a) {
            case 0:
                this.f19682b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19682b);
                return;
            case 2:
                SavedMessagesController.h(this.f19682b);
                return;
            case 3:
                SavedMessagesController.j(this.f19682b);
                return;
            default:
                SavedMessagesController.b(this.f19682b);
                return;
        }
    }
}
