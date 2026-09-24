package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16725a;
    public final MessagesStorage f16726b;
    public final boolean f16727c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16725a = i10;
        this.f16726b = messagesStorage;
        this.f16727c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16725a) {
            case 0:
                this.f16726b.lambda$getCachedPhoneBook$150(this.f16727c);
                return;
            default:
                this.f16726b.lambda$cleanup$6(this.f16727c);
                return;
        }
    }
}
