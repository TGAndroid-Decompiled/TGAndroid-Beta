package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18961a;
    public final MessagesStorage f18962b;
    public final boolean f18963c;

    public lf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18961a = i10;
        this.f18962b = messagesStorage;
        this.f18963c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18961a) {
            case 0:
                this.f18962b.lambda$getCachedPhoneBook$150(this.f18963c);
                return;
            default:
                this.f18962b.lambda$cleanup$6(this.f18963c);
                return;
        }
    }
}
