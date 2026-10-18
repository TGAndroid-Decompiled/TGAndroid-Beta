package org.telegram.messenger;
public final class xh implements Runnable {
    public final int f20093a;
    public final SecretChatHelper f20094b;
    public final long f20095c;

    public xh(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f20093a = i10;
        this.f20094b = secretChatHelper;
        this.f20095c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20093a) {
            case 0:
                this.f20094b.lambda$processDecryptedObject$12(this.f20095c);
                return;
            case 1:
                this.f20094b.lambda$processDecryptedObject$10(this.f20095c);
                return;
            case 2:
                this.f20094b.lambda$processDecryptedObject$11(this.f20095c);
                return;
            default:
                this.f20094b.lambda$processUpdateEncryption$3(this.f20095c);
                return;
        }
    }
}
