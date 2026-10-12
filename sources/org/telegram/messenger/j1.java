package org.telegram.messenger;
public final class j1 implements Runnable {
    public final int f17913a;
    public final ContactsController f17914b;

    public j1(ContactsController contactsController, int i10) {
        this.f17913a = i10;
        this.f17914b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f17913a) {
            case 0:
                ContactsController.e0(this.f17914b);
                return;
            case 1:
                ContactsController.G(this.f17914b);
                return;
            case 2:
                ContactsController.n(this.f17914b);
                return;
            case 3:
                ContactsController.N(this.f17914b);
                return;
            case 4:
                ContactsController.b(this.f17914b);
                return;
            case 5:
                ContactsController.B(this.f17914b);
                return;
            case 6:
                ContactsController.k(this.f17914b);
                return;
            case 7:
                ContactsController.a(this.f17914b);
                return;
            case 8:
                ContactsController.s(this.f17914b);
                return;
            default:
                ContactsController.t(this.f17914b);
                return;
        }
    }
}
