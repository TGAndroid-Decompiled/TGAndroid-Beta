package org.telegram.messenger;
public final class ai implements Runnable {
    public final int f19646a;
    public final SavedMessagesController f19647b;

    public ai(SavedMessagesController savedMessagesController, int i10) {
        this.f19646a = i10;
        this.f19647b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19646a) {
            case 0:
                this.f19647b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19647b);
                return;
            case 2:
                SavedMessagesController.h(this.f19647b);
                return;
            case 3:
                SavedMessagesController.j(this.f19647b);
                return;
            default:
                SavedMessagesController.b(this.f19647b);
                return;
        }
    }
}
