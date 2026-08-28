package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class gh implements Utilities.Callback2 {
    public final int f20405a = 0;
    public final int f20406b;
    public final Object f20407c;
    public final Object d;

    public gh(Context context, int i9, Utilities.Callback2 callback2) {
        this.f20407c = callback2;
        this.d = context;
        this.f20406b = i9;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20405a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f20407c, (Context) this.d, this.f20406b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f20407c).lambda$pushToSummarize$19(this.f20406b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public gh(TranslateController translateController, int i9, Utilities.Callback callback) {
        this.f20407c = translateController;
        this.f20406b = i9;
        this.d = callback;
    }
}
