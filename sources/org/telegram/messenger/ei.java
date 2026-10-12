package org.telegram.messenger;
public final class ei implements Runnable {
    public final int f17535a;
    public final SavedMessagesController f17536b;

    public ei(SavedMessagesController savedMessagesController, int i10) {
        this.f17535a = i10;
        this.f17536b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f17535a) {
            case 0:
                this.f17536b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f17536b);
                return;
            case 2:
                SavedMessagesController.h(this.f17536b);
                return;
            case 3:
                SavedMessagesController.j(this.f17536b);
                return;
            default:
                SavedMessagesController.b(this.f17536b);
                return;
        }
    }
}
