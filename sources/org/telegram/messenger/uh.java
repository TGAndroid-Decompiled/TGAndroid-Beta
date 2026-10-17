package org.telegram.messenger;
public final class uh implements Runnable {
    public final int f19680a;
    public final SavedMessagesController f19681b;

    public uh(SavedMessagesController savedMessagesController, int i10) {
        this.f19680a = i10;
        this.f19681b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19680a) {
            case 0:
                this.f19681b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19681b);
                return;
            case 2:
                SavedMessagesController.h(this.f19681b);
                return;
            case 3:
                SavedMessagesController.j(this.f19681b);
                return;
            default:
                SavedMessagesController.b(this.f19681b);
                return;
        }
    }
}
