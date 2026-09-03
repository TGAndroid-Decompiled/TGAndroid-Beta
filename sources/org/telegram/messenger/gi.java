package org.telegram.messenger;
public final class gi implements Runnable {
    public final int f17303a;
    public final SecretChatHelper f17304b;
    public final long f17305c;

    public gi(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f17303a = i10;
        this.f17304b = secretChatHelper;
        this.f17305c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17303a) {
            case 0:
                SecretChatHelper.x(this.f17304b, this.f17305c);
                return;
            case 1:
                SecretChatHelper.t(this.f17304b, this.f17305c);
                return;
            case 2:
                SecretChatHelper.j(this.f17304b, this.f17305c);
                return;
            default:
                SecretChatHelper.w(this.f17304b, this.f17305c);
                return;
        }
    }
}
