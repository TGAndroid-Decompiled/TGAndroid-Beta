package org.telegram.messenger;

public final class SecretChatHelper$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final SecretChatHelper f$0;
    public final long f$1;

    public SecretChatHelper$$ExternalSyntheticLambda3(SecretChatHelper secretChatHelper, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = secretChatHelper;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processUpdateEncryption$3(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processDecryptedObject$12(this.f$1);
                break;
            case 2:
                this.f$0.lambda$processDecryptedObject$10(this.f$1);
                break;
            default:
                this.f$0.lambda$processDecryptedObject$11(this.f$1);
                break;
        }
    }
}
