package org.telegram.messenger;
public final class f1 implements Runnable {
    public final int f16301a;
    public final ContactsController f16302b;

    public f1(ContactsController contactsController, int i10) {
        this.f16301a = i10;
        this.f16302b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f16301a) {
            case 0:
                ContactsController.e0(this.f16302b);
                return;
            case 1:
                ContactsController.G(this.f16302b);
                return;
            case 2:
                ContactsController.n(this.f16302b);
                return;
            case 3:
                ContactsController.N(this.f16302b);
                return;
            case 4:
                ContactsController.b(this.f16302b);
                return;
            case 5:
                ContactsController.B(this.f16302b);
                return;
            case 6:
                ContactsController.k(this.f16302b);
                return;
            case 7:
                ContactsController.a(this.f16302b);
                return;
            case 8:
                ContactsController.s(this.f16302b);
                return;
            default:
                ContactsController.t(this.f16302b);
                return;
        }
    }
}
