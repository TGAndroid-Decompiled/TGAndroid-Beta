package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f20085a;
    public final ContactsController f20086b;

    public e1(ContactsController contactsController, int i10) {
        this.f20085a = i10;
        this.f20086b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f20085a) {
            case 0:
                ContactsController.e0(this.f20086b);
                return;
            case 1:
                ContactsController.G(this.f20086b);
                return;
            case 2:
                ContactsController.n(this.f20086b);
                return;
            case 3:
                ContactsController.N(this.f20086b);
                return;
            case 4:
                ContactsController.b(this.f20086b);
                return;
            case 5:
                ContactsController.B(this.f20086b);
                return;
            case 6:
                ContactsController.k(this.f20086b);
                return;
            case 7:
                ContactsController.a(this.f20086b);
                return;
            case 8:
                ContactsController.s(this.f20086b);
                return;
            default:
                ContactsController.t(this.f20086b);
                return;
        }
    }
}
