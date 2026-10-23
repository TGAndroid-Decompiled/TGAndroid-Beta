package org.telegram.messenger;
public final class xh implements Runnable {
    public final int f20090a;
    public final SavedMessagesController f20091b;

    public xh(SavedMessagesController savedMessagesController, int i10) {
        this.f20090a = i10;
        this.f20091b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f20090a) {
            case 0:
                this.f20091b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f20091b);
                return;
            case 2:
                SavedMessagesController.h(this.f20091b);
                return;
            case 3:
                SavedMessagesController.j(this.f20091b);
                return;
            default:
                SavedMessagesController.b(this.f20091b);
                return;
        }
    }
}
