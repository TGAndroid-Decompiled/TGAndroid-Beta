package org.telegram.messenger;
public final class i1 implements Runnable {
    public final int f18559a;
    public final ContactsController f18560b;

    public i1(ContactsController contactsController, int i10) {
        this.f18559a = i10;
        this.f18560b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f18559a) {
            case 0:
                ContactsController.e0(this.f18560b);
                return;
            case 1:
                ContactsController.G(this.f18560b);
                return;
            case 2:
                ContactsController.n(this.f18560b);
                return;
            case 3:
                ContactsController.N(this.f18560b);
                return;
            case 4:
                ContactsController.b(this.f18560b);
                return;
            case 5:
                ContactsController.B(this.f18560b);
                return;
            case 6:
                ContactsController.k(this.f18560b);
                return;
            case 7:
                ContactsController.a(this.f18560b);
                return;
            case 8:
                ContactsController.s(this.f18560b);
                return;
            default:
                ContactsController.t(this.f18560b);
                return;
        }
    }
}
