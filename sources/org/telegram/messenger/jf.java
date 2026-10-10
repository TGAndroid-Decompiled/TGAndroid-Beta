package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18264a;
    public final MessagesStorage f18265b;
    public final boolean f18266c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18264a = i10;
        this.f18265b = messagesStorage;
        this.f18266c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18264a) {
            case 0:
                this.f18265b.lambda$getCachedPhoneBook$150(this.f18266c);
                return;
            default:
                this.f18265b.lambda$cleanup$6(this.f18266c);
                return;
        }
    }
}
