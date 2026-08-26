package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class FileRefController$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final FileRefController f$0;
    public final TLRPC.TL_messages_sendMedia f$1;
    public final Object[] f$2;

    public FileRefController$$ExternalSyntheticLambda6(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i) {
        this.$r8$classId = i;
        this.f$0 = fileRefController;
        this.f$1 = tL_messages_sendMedia;
        this.f$2 = objArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendErrorToObject$42(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$onUpdateObjectReference$31(this.f$1, this.f$2);
                break;
        }
    }
}
