package org.telegram.messenger;
public final class gi implements Runnable {
    public final int f18782a;
    public final SecretChatHelper f18783b;
    public final long f18784c;

    public gi(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f18782a = i10;
        this.f18783b = secretChatHelper;
        this.f18784c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18782a) {
            case 0:
                SecretChatHelper.x(this.f18783b, this.f18784c);
                return;
            case 1:
                SecretChatHelper.t(this.f18783b, this.f18784c);
                return;
            case 2:
                SecretChatHelper.j(this.f18783b, this.f18784c);
                return;
            default:
                SecretChatHelper.w(this.f18783b, this.f18784c);
                return;
        }
    }
}
