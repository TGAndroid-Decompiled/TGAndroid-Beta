package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f19830a;
    public final SecretChatHelper f19831b;
    public final long f19832c;

    public bi(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f19830a = i10;
        this.f19831b = secretChatHelper;
        this.f19832c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19830a) {
            case 0:
                SecretChatHelper.x(this.f19831b, this.f19832c);
                return;
            case 1:
                SecretChatHelper.t(this.f19831b, this.f19832c);
                return;
            case 2:
                SecretChatHelper.j(this.f19831b, this.f19832c);
                return;
            default:
                SecretChatHelper.w(this.f19831b, this.f19832c);
                return;
        }
    }
}
