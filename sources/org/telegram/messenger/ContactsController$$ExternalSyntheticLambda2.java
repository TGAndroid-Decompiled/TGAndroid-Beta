package org.telegram.messenger;

public final class ContactsController$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ContactsController f$0;

    public ContactsController$$ExternalSyntheticLambda2(ContactsController contactsController, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadContacts$27();
                break;
            case 1:
                this.f$0.lambda$performSyncPhoneBook$18();
                break;
            case 2:
                this.f$0.lambda$processLoadedContacts$29();
                break;
            case 3:
                this.f$0.lambda$checkAppAccount$4();
                break;
            case 4:
                this.f$0.lambda$cleanup$1();
                break;
            case 5:
                this.f$0.lambda$new$0();
                break;
            case 6:
                this.f$0.lambda$applyContactsUpdates$47();
                break;
            case 7:
                this.f$0.lambda$readContacts$11();
                break;
            case 8:
                this.f$0.lambda$forceImportContacts$6();
                break;
            default:
                this.f$0.lambda$checkContacts$5();
                break;
        }
    }
}
