package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18692a;
    public final MessagesStorage f18693b;
    public final boolean f18694c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18692a = i10;
        this.f18693b = messagesStorage;
        this.f18694c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18692a) {
            case 0:
                this.f18693b.lambda$getCachedPhoneBook$150(this.f18694c);
                return;
            default:
                this.f18693b.lambda$cleanup$6(this.f18694c);
                return;
        }
    }
}
