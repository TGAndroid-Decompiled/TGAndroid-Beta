package org.telegram.messenger;
public final class i1 implements Runnable {
    public final int f18570a;
    public final ContactsController f18571b;

    public i1(ContactsController contactsController, int i10) {
        this.f18570a = i10;
        this.f18571b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f18570a) {
            case 0:
                ContactsController.e0(this.f18571b);
                return;
            case 1:
                ContactsController.G(this.f18571b);
                return;
            case 2:
                ContactsController.n(this.f18571b);
                return;
            case 3:
                ContactsController.N(this.f18571b);
                return;
            case 4:
                ContactsController.b(this.f18571b);
                return;
            case 5:
                ContactsController.B(this.f18571b);
                return;
            case 6:
                ContactsController.k(this.f18571b);
                return;
            case 7:
                ContactsController.a(this.f18571b);
                return;
            case 8:
                ContactsController.s(this.f18571b);
                return;
            default:
                ContactsController.t(this.f18571b);
                return;
        }
    }
}
