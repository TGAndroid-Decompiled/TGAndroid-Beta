package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16768a;
    public final MessagesStorage f16769b;
    public final boolean f16770c;

    public kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16768a = i10;
        this.f16769b = messagesStorage;
        this.f16770c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16768a) {
            case 0:
                this.f16769b.lambda$getCachedPhoneBook$150(this.f16770c);
                return;
            default:
                this.f16769b.lambda$cleanup$6(this.f16770c);
                return;
        }
    }
}
