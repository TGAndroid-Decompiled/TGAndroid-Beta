package org.telegram.messenger;
public final class ef implements Runnable {
    public final int f20189a;
    public final MessagesStorage f20190b;
    public final boolean f20191c;

    public ef(MessagesStorage messagesStorage, boolean z10, int i9) {
        this.f20189a = i9;
        this.f20190b = messagesStorage;
        this.f20191c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20189a) {
            case 0:
                this.f20190b.lambda$getCachedPhoneBook$150(this.f20191c);
                return;
            default:
                this.f20190b.lambda$cleanup$6(this.f20191c);
                return;
        }
    }
}
