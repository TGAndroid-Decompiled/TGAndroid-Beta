package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18893a;
    public final MessagesStorage f18894b;
    public final boolean f18895c;

    public lf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18893a = i10;
        this.f18894b = messagesStorage;
        this.f18895c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18893a) {
            case 0:
                this.f18894b.lambda$getCachedPhoneBook$150(this.f18895c);
                return;
            default:
                this.f18894b.lambda$cleanup$6(this.f18895c);
                return;
        }
    }
}
