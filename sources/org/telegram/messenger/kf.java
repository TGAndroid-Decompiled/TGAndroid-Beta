package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16579a;
    public final MessagesStorage f16580b;
    public final boolean f16581c;

    public kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16579a = i10;
        this.f16580b = messagesStorage;
        this.f16581c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16579a) {
            case 0:
                this.f16580b.lambda$getCachedPhoneBook$150(this.f16581c);
                return;
            default:
                this.f16580b.lambda$cleanup$6(this.f16581c);
                return;
        }
    }
}
