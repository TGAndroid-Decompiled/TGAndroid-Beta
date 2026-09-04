package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18167a;
    public final MessagesStorage f18168b;
    public final boolean f18169c;

    public kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18167a = i10;
        this.f18168b = messagesStorage;
        this.f18169c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18167a) {
            case 0:
                this.f18168b.lambda$getCachedPhoneBook$150(this.f18169c);
                return;
            default:
                this.f18168b.lambda$cleanup$6(this.f18169c);
                return;
        }
    }
}
