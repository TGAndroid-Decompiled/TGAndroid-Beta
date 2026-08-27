package org.telegram.messenger;

public final class jf implements Runnable {

    public final int f20678a;

    public final MessagesStorage f20679b;

    public final boolean f20680c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f20678a = i10;
        this.f20679b = messagesStorage;
        this.f20680c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20678a) {
            case 0:
                this.f20679b.lambda$getCachedPhoneBook$150(this.f20680c);
                break;
            default:
                this.f20679b.lambda$cleanup$6(this.f20680c);
                break;
        }
    }
}
