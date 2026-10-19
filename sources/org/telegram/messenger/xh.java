package org.telegram.messenger;
public final class xh implements Runnable {
    public final int f20087a;
    public final SecretChatHelper f20088b;
    public final long f20089c;

    public xh(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f20087a = i10;
        this.f20088b = secretChatHelper;
        this.f20089c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20087a) {
            case 0:
                this.f20088b.lambda$processDecryptedObject$12(this.f20089c);
                return;
            case 1:
                this.f20088b.lambda$processDecryptedObject$10(this.f20089c);
                return;
            case 2:
                this.f20088b.lambda$processDecryptedObject$11(this.f20089c);
                return;
            default:
                this.f20088b.lambda$processUpdateEncryption$3(this.f20089c);
                return;
        }
    }
}
