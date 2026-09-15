package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oh implements Utilities.Callback2 {
    public final int f16967a = 0;
    public final int f16968b;
    public final Object f16969c;
    public final Object d;

    public oh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f16969c = callback2;
        this.d = context;
        this.f16968b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16967a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f16969c, (Context) this.d, this.f16968b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f16969c).lambda$pushToSummarize$19(this.f16968b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f16969c = translateController;
        this.f16968b = i10;
        this.d = callback;
    }
}
