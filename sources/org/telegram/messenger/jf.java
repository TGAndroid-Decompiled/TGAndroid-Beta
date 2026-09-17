package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18095a;
    public final MessagesStorage f18096b;
    public final boolean f18097c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18095a = i10;
        this.f18096b = messagesStorage;
        this.f18097c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18095a) {
            case 0:
                this.f18096b.lambda$getCachedPhoneBook$150(this.f18097c);
                return;
            default:
                this.f18096b.lambda$cleanup$6(this.f18097c);
                return;
        }
    }
}
