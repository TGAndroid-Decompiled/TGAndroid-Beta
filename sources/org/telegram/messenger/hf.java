package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18543a;
    public final MessagesStorage f18544b;
    public final boolean f18545c;

    public hf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18543a = i10;
        this.f18544b = messagesStorage;
        this.f18545c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                this.f18544b.lambda$getCachedPhoneBook$150(this.f18545c);
                return;
            default:
                this.f18544b.lambda$cleanup$6(this.f18545c);
                return;
        }
    }
}
