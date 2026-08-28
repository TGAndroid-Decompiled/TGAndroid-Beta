package org.telegram.messenger;
public final class rh implements Runnable {
    public final int f21420a;
    public final SavedMessagesController f21421b;

    public rh(SavedMessagesController savedMessagesController, int i9) {
        this.f21420a = i9;
        this.f21421b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f21420a) {
            case 0:
                this.f21421b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f21421b);
                return;
            case 2:
                SavedMessagesController.h(this.f21421b);
                return;
            case 3:
                SavedMessagesController.j(this.f21421b);
                return;
            default:
                SavedMessagesController.b(this.f21421b);
                return;
        }
    }
}
