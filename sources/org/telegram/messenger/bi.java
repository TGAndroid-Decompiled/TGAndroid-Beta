package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f16857a;
    public final SavedMessagesController f16858b;

    public bi(SavedMessagesController savedMessagesController, int i10) {
        this.f16857a = i10;
        this.f16858b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f16857a) {
            case 0:
                this.f16858b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f16858b);
                return;
            case 2:
                SavedMessagesController.h(this.f16858b);
                return;
            case 3:
                SavedMessagesController.j(this.f16858b);
                return;
            default:
                SavedMessagesController.b(this.f16858b);
                return;
        }
    }
}
