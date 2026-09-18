package org.telegram.messenger;
public final class ai implements Runnable {
    public final int f15876a;
    public final SavedMessagesController f15877b;

    public ai(SavedMessagesController savedMessagesController, int i10) {
        this.f15876a = i10;
        this.f15877b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f15876a) {
            case 0:
                this.f15877b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f15877b);
                return;
            case 2:
                SavedMessagesController.h(this.f15877b);
                return;
            case 3:
                SavedMessagesController.j(this.f15877b);
                return;
            default:
                SavedMessagesController.b(this.f15877b);
                return;
        }
    }
}
