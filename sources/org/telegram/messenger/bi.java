package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f18288a;
    public final SavedMessagesController f18289b;

    public bi(SavedMessagesController savedMessagesController, int i10) {
        this.f18288a = i10;
        this.f18289b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18288a) {
            case 0:
                this.f18289b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18289b);
                return;
            case 2:
                SavedMessagesController.h(this.f18289b);
                return;
            case 3:
                SavedMessagesController.j(this.f18289b);
                return;
            default:
                SavedMessagesController.b(this.f18289b);
                return;
        }
    }
}
