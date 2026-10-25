package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f20694a;
    public final MessagesStorage f20695b;
    public final boolean f20696c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f20694a = i10;
        this.f20695b = messagesStorage;
        this.f20696c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20694a) {
            case 0:
                this.f20695b.lambda$getCachedPhoneBook$153(this.f20696c);
                return;
            default:
                this.f20695b.lambda$cleanup$6(this.f20696c);
                return;
        }
    }
}
