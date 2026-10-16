package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f16588a;
    public final SavedMessagesController f16589b;

    public bi(SavedMessagesController savedMessagesController, int i10) {
        this.f16588a = i10;
        this.f16589b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f16588a) {
            case 0:
                this.f16589b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f16589b);
                return;
            case 2:
                SavedMessagesController.h(this.f16589b);
                return;
            case 3:
                SavedMessagesController.j(this.f16589b);
                return;
            default:
                SavedMessagesController.b(this.f16589b);
                return;
        }
    }
}
