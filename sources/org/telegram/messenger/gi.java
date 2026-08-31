package org.telegram.messenger;
public final class gi implements Runnable {
    public final int f18780a;
    public final SecretChatHelper f18781b;
    public final long f18782c;

    public gi(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f18780a = i10;
        this.f18781b = secretChatHelper;
        this.f18782c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18780a) {
            case 0:
                SecretChatHelper.x(this.f18781b, this.f18782c);
                return;
            case 1:
                SecretChatHelper.t(this.f18781b, this.f18782c);
                return;
            case 2:
                SecretChatHelper.j(this.f18781b, this.f18782c);
                return;
            default:
                SecretChatHelper.w(this.f18781b, this.f18782c);
                return;
        }
    }
}
