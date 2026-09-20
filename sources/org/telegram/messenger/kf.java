package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16812a;
    public final MessagesStorage f16813b;
    public final boolean f16814c;

    public kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16812a = i10;
        this.f16813b = messagesStorage;
        this.f16814c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16812a) {
            case 0:
                this.f16813b.lambda$getCachedPhoneBook$150(this.f16814c);
                return;
            default:
                this.f16813b.lambda$cleanup$6(this.f16814c);
                return;
        }
    }
}
