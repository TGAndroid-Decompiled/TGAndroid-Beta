package org.telegram.messenger;
public final class ei implements Runnable {
    public final int f16238a;
    public final SecretChatHelper f16239b;
    public final long f16240c;

    public ei(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f16238a = i10;
        this.f16239b = secretChatHelper;
        this.f16240c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16238a) {
            case 0:
                SecretChatHelper.y(this.f16239b, this.f16240c);
                return;
            case 1:
                SecretChatHelper.u(this.f16239b, this.f16240c);
                return;
            case 2:
                SecretChatHelper.j(this.f16239b, this.f16240c);
                return;
            default:
                SecretChatHelper.x(this.f16239b, this.f16240c);
                return;
        }
    }
}
