package org.telegram.messenger;
public final class hi implements Runnable {
    public final int f15391a;
    public final SavedMessagesController f15392b;

    public hi(SavedMessagesController savedMessagesController, int i10) {
        this.f15391a = i10;
        this.f15392b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f15391a) {
            case 0:
                this.f15392b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f15392b);
                return;
            case 2:
                SavedMessagesController.h(this.f15392b);
                return;
            case 3:
                SavedMessagesController.j(this.f15392b);
                return;
            default:
                SavedMessagesController.b(this.f15392b);
                return;
        }
    }
}
