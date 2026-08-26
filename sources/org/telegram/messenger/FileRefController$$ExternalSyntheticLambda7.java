package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;

public final class FileRefController$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final FileRefController f$0;
    public final TL_ephemeral.TL_sendMessage f$1;
    public final Object[] f$2;

    public FileRefController$$ExternalSyntheticLambda7(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i) {
        this.$r8$classId = i;
        this.f$0 = fileRefController;
        this.f$1 = tL_sendMessage;
        this.f$2 = objArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendErrorToObject$43(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$onUpdateObjectReference$32(this.f$1, this.f$2);
                break;
        }
    }
}
