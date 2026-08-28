package org.telegram.messenger;
public final class uh implements Runnable {
    public final int f21689a;
    public final SecretChatHelper f21690b;
    public final long f21691c;

    public uh(SecretChatHelper secretChatHelper, long j10, int i9) {
        this.f21689a = i9;
        this.f21690b = secretChatHelper;
        this.f21691c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21689a) {
            case 0:
                SecretChatHelper.x(this.f21690b, this.f21691c);
                return;
            case 1:
                SecretChatHelper.t(this.f21690b, this.f21691c);
                return;
            case 2:
                SecretChatHelper.j(this.f21690b, this.f21691c);
                return;
            default:
                SecretChatHelper.w(this.f21690b, this.f21691c);
                return;
        }
    }
}
