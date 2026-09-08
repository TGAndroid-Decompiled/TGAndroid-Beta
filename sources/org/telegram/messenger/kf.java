package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18194a;
    public final MessagesStorage f18195b;
    public final boolean f18196c;

    public kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18194a = i10;
        this.f18195b = messagesStorage;
        this.f18196c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18194a) {
            case 0:
                this.f18195b.lambda$getCachedPhoneBook$150(this.f18196c);
                return;
            default:
                this.f18195b.lambda$cleanup$6(this.f18196c);
                return;
        }
    }
}
