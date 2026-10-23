package org.telegram.messenger;
public final class j1 implements Runnable {
    public final int f18665a;
    public final ContactsController f18666b;

    public j1(ContactsController contactsController, int i10) {
        this.f18665a = i10;
        this.f18666b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f18665a) {
            case 0:
                ContactsController.e0(this.f18666b);
                return;
            case 1:
                ContactsController.G(this.f18666b);
                return;
            case 2:
                ContactsController.n(this.f18666b);
                return;
            case 3:
                ContactsController.N(this.f18666b);
                return;
            case 4:
                ContactsController.b(this.f18666b);
                return;
            case 5:
                ContactsController.B(this.f18666b);
                return;
            case 6:
                ContactsController.k(this.f18666b);
                return;
            case 7:
                ContactsController.a(this.f18666b);
                return;
            case 8:
                ContactsController.s(this.f18666b);
                return;
            default:
                ContactsController.t(this.f18666b);
                return;
        }
    }
}
