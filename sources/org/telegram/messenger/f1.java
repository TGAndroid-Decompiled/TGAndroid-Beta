package org.telegram.messenger;
public final class f1 implements Runnable {
    public final int f16261a;
    public final ContactsController f16262b;

    public f1(ContactsController contactsController, int i10) {
        this.f16261a = i10;
        this.f16262b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f16261a) {
            case 0:
                ContactsController.e0(this.f16262b);
                return;
            case 1:
                ContactsController.G(this.f16262b);
                return;
            case 2:
                ContactsController.n(this.f16262b);
                return;
            case 3:
                ContactsController.N(this.f16262b);
                return;
            case 4:
                ContactsController.b(this.f16262b);
                return;
            case 5:
                ContactsController.B(this.f16262b);
                return;
            case 6:
                ContactsController.k(this.f16262b);
                return;
            case 7:
                ContactsController.a(this.f16262b);
                return;
            case 8:
                ContactsController.s(this.f16262b);
                return;
            default:
                ContactsController.t(this.f16262b);
                return;
        }
    }
}
