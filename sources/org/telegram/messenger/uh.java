package org.telegram.messenger;
public final class uh implements Runnable {
    public final int f19684a;
    public final SavedMessagesController f19685b;

    public uh(SavedMessagesController savedMessagesController, int i10) {
        this.f19684a = i10;
        this.f19685b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19684a) {
            case 0:
                this.f19685b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19685b);
                return;
            case 2:
                SavedMessagesController.h(this.f19685b);
                return;
            case 3:
                SavedMessagesController.j(this.f19685b);
                return;
            default:
                SavedMessagesController.b(this.f19685b);
                return;
        }
    }
}
