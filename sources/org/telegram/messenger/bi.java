package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f16871a;
    public final SavedMessagesController f16872b;

    public bi(SavedMessagesController savedMessagesController, int i10) {
        this.f16871a = i10;
        this.f16872b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f16871a) {
            case 0:
                this.f16872b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f16872b);
                return;
            case 2:
                SavedMessagesController.h(this.f16872b);
                return;
            case 3:
                SavedMessagesController.j(this.f16872b);
                return;
            default:
                SavedMessagesController.b(this.f16872b);
                return;
        }
    }
}
