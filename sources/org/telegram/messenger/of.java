package org.telegram.messenger;
public final class of implements Runnable {
    public final int f19571a;
    public final MessagesStorage f19572b;
    public final boolean f19573c;

    public of(MessagesStorage messagesStorage, boolean z4, int i10) {
        this.f19571a = i10;
        this.f19572b = messagesStorage;
        this.f19573c = z4;
    }

    @Override
    public final void run() {
        switch (this.f19571a) {
            case 0:
                this.f19572b.lambda$getCachedPhoneBook$150(this.f19573c);
                return;
            default:
                this.f19572b.lambda$cleanup$6(this.f19573c);
                return;
        }
    }
}
