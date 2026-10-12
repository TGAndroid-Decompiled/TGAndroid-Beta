package org.telegram.messenger;
public final class j1 implements Runnable {
    public final int f17914a;
    public final ContactsController f17915b;

    public j1(ContactsController contactsController, int i10) {
        this.f17914a = i10;
        this.f17915b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f17914a) {
            case 0:
                ContactsController.e0(this.f17915b);
                return;
            case 1:
                ContactsController.G(this.f17915b);
                return;
            case 2:
                ContactsController.n(this.f17915b);
                return;
            case 3:
                ContactsController.N(this.f17915b);
                return;
            case 4:
                ContactsController.b(this.f17915b);
                return;
            case 5:
                ContactsController.B(this.f17915b);
                return;
            case 6:
                ContactsController.k(this.f17915b);
                return;
            case 7:
                ContactsController.a(this.f17915b);
                return;
            case 8:
                ContactsController.s(this.f17915b);
                return;
            default:
                ContactsController.t(this.f17915b);
                return;
        }
    }
}
