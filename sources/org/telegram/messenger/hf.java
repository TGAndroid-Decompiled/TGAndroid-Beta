package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18540a;
    public final MessagesStorage f18541b;
    public final boolean f18542c;

    public hf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18540a = i10;
        this.f18541b = messagesStorage;
        this.f18542c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18540a) {
            case 0:
                this.f18541b.lambda$getCachedPhoneBook$150(this.f18542c);
                return;
            default:
                this.f18541b.lambda$cleanup$6(this.f18542c);
                return;
        }
    }
}
