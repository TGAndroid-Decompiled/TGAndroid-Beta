package org.telegram.messenger;
public final class ei implements Runnable {
    public final int f17534a;
    public final SavedMessagesController f17535b;

    public ei(SavedMessagesController savedMessagesController, int i10) {
        this.f17534a = i10;
        this.f17535b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f17534a) {
            case 0:
                this.f17535b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f17535b);
                return;
            case 2:
                SavedMessagesController.h(this.f17535b);
                return;
            case 3:
                SavedMessagesController.j(this.f17535b);
                return;
            default:
                SavedMessagesController.b(this.f17535b);
                return;
        }
    }
}
