package org.telegram.messenger;
public final class g1 implements Runnable {
    public final int f17890a;
    public final ContactsController f17891b;

    public g1(ContactsController contactsController, int i10) {
        this.f17890a = i10;
        this.f17891b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f17890a) {
            case 0:
                ContactsController.e0(this.f17891b);
                return;
            case 1:
                ContactsController.G(this.f17891b);
                return;
            case 2:
                ContactsController.n(this.f17891b);
                return;
            case 3:
                ContactsController.N(this.f17891b);
                return;
            case 4:
                ContactsController.b(this.f17891b);
                return;
            case 5:
                ContactsController.B(this.f17891b);
                return;
            case 6:
                ContactsController.k(this.f17891b);
                return;
            case 7:
                ContactsController.a(this.f17891b);
                return;
            case 8:
                ContactsController.s(this.f17891b);
                return;
            default:
                ContactsController.t(this.f17891b);
                return;
        }
    }
}
