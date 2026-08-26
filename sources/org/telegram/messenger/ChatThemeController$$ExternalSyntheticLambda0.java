package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

public final class ChatThemeController$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ResultCallback f$0;
    public final TLRPC.TL_error f$1;

    public ChatThemeController$$ExternalSyntheticLambda0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = resultCallback;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onError(this.f$1);
                break;
            default:
                this.f$0.onError(this.f$1);
                break;
        }
    }
}
