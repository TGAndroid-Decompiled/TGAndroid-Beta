package org.telegram.messenger;
public final class f1 implements Runnable {
    public final int f20234a;
    public final ContactsController f20235b;

    public f1(ContactsController contactsController, int i9) {
        this.f20234a = i9;
        this.f20235b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f20234a) {
            case 0:
                ContactsController.e0(this.f20235b);
                return;
            case 1:
                ContactsController.G(this.f20235b);
                return;
            case 2:
                ContactsController.n(this.f20235b);
                return;
            case 3:
                ContactsController.N(this.f20235b);
                return;
            case 4:
                ContactsController.b(this.f20235b);
                return;
            case 5:
                ContactsController.B(this.f20235b);
                return;
            case 6:
                ContactsController.k(this.f20235b);
                return;
            case 7:
                ContactsController.a(this.f20235b);
                return;
            case 8:
                ContactsController.s(this.f20235b);
                return;
            default:
                ContactsController.t(this.f20235b);
                return;
        }
    }
}
