package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f20687a;
    public final MessagesStorage f20688b;
    public final boolean f20689c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f20687a = i10;
        this.f20688b = messagesStorage;
        this.f20689c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20687a) {
            case 0:
                this.f20688b.lambda$getCachedPhoneBook$154(this.f20689c);
                return;
            default:
                this.f20688b.lambda$cleanup$6(this.f20689c);
                return;
        }
    }
}
