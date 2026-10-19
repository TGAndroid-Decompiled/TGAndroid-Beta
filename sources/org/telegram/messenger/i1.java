package org.telegram.messenger;
public final class i1 implements Runnable {
    public final int f18568a;
    public final ContactsController f18569b;

    public i1(ContactsController contactsController, int i10) {
        this.f18568a = i10;
        this.f18569b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f18568a) {
            case 0:
                ContactsController.e0(this.f18569b);
                return;
            case 1:
                ContactsController.G(this.f18569b);
                return;
            case 2:
                ContactsController.n(this.f18569b);
                return;
            case 3:
                ContactsController.N(this.f18569b);
                return;
            case 4:
                ContactsController.b(this.f18569b);
                return;
            case 5:
                ContactsController.B(this.f18569b);
                return;
            case 6:
                ContactsController.k(this.f18569b);
                return;
            case 7:
                ContactsController.a(this.f18569b);
                return;
            case 8:
                ContactsController.s(this.f18569b);
                return;
            default:
                ContactsController.t(this.f18569b);
                return;
        }
    }
}
