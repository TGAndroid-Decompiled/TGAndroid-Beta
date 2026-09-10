package org.telegram.messenger;
public final class h1 implements Runnable {
    public final int f15322a;
    public final ContactsController f15323b;

    public h1(ContactsController contactsController, int i10) {
        this.f15322a = i10;
        this.f15323b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f15322a) {
            case 0:
                ContactsController.e0(this.f15323b);
                return;
            case 1:
                ContactsController.G(this.f15323b);
                return;
            case 2:
                ContactsController.n(this.f15323b);
                return;
            case 3:
                ContactsController.N(this.f15323b);
                return;
            case 4:
                ContactsController.b(this.f15323b);
                return;
            case 5:
                ContactsController.B(this.f15323b);
                return;
            case 6:
                ContactsController.k(this.f15323b);
                return;
            case 7:
                ContactsController.a(this.f15323b);
                return;
            case 8:
                ContactsController.s(this.f15323b);
                return;
            default:
                ContactsController.t(this.f15323b);
                return;
        }
    }
}
