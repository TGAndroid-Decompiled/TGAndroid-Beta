package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f16870a = 0;
    public final int f16871b;
    public final Object f16872c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f16872c = callback2;
        this.d = context;
        this.f16871b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16870a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f16872c, (Context) this.d, this.f16871b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f16872c).lambda$pushToSummarize$19(this.f16871b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f16872c = translateController;
        this.f16871b = i10;
        this.d = callback;
    }
}
