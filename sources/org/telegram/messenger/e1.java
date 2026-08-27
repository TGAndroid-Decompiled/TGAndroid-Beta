package org.telegram.messenger;

public final class e1 implements Runnable {

    public final int f20095a;

    public final ContactsController f20096b;

    public e1(ContactsController contactsController, int i10) {
        this.f20095a = i10;
        this.f20096b = contactsController;
    }

    @Override
    public final void run() {
        switch (this.f20095a) {
            case 0:
                this.f20096b.lambda$loadContacts$27();
                break;
            case 1:
                this.f20096b.lambda$performSyncPhoneBook$18();
                break;
            case 2:
                this.f20096b.lambda$processLoadedContacts$29();
                break;
            case 3:
                this.f20096b.lambda$applyContactsUpdates$47();
                break;
            case 4:
                this.f20096b.lambda$checkAppAccount$4();
                break;
            case 5:
                this.f20096b.lambda$cleanup$1();
                break;
            case 6:
                this.f20096b.lambda$new$0();
                break;
            case 7:
                this.f20096b.lambda$forceImportContacts$6();
                break;
            case 8:
                this.f20096b.lambda$readContacts$11();
                break;
            default:
                this.f20096b.lambda$checkContacts$5();
                break;
        }
    }
}
