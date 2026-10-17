package org.telegram.messenger;
public final class gf implements Runnable {
    public final int f18466a;
    public final MessagesStorage f18467b;
    public final boolean f18468c;

    public gf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18466a = i10;
        this.f18467b = messagesStorage;
        this.f18468c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18466a) {
            case 0:
                this.f18467b.lambda$getCachedPhoneBook$150(this.f18468c);
                return;
            default:
                this.f18467b.lambda$cleanup$6(this.f18468c);
                return;
        }
    }
}
