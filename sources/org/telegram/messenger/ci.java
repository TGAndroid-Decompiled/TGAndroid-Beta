package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f17015a;
    public final SavedMessagesController f17016b;

    public ci(SavedMessagesController savedMessagesController, int i10) {
        this.f17015a = i10;
        this.f17016b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f17015a) {
            case 0:
                this.f17016b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f17016b);
                return;
            case 2:
                SavedMessagesController.h(this.f17016b);
                return;
            case 3:
                SavedMessagesController.j(this.f17016b);
                return;
            default:
                SavedMessagesController.b(this.f17016b);
                return;
        }
    }
}
