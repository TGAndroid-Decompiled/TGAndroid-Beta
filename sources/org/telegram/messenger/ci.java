package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f17443a;
    public final SecretChatHelper f17444b;
    public final long f17445c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17443a = i10;
        this.f17444b = secretChatHelper;
        this.f17445c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17443a) {
            case 0:
                SecretChatHelper.x(this.f17444b, this.f17445c);
                return;
            case 1:
                SecretChatHelper.t(this.f17444b, this.f17445c);
                return;
            case 2:
                SecretChatHelper.j(this.f17444b, this.f17445c);
                return;
            default:
                SecretChatHelper.w(this.f17444b, this.f17445c);
                return;
        }
    }
}
