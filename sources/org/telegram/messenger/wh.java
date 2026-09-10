package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wh implements Utilities.Callback2 {
    public final int f16896a = 0;
    public final int f16897b;
    public final Object f16898c;
    public final Object d;

    public wh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f16898c = callback2;
        this.d = context;
        this.f16897b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16896a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f16898c, (Context) this.d, this.f16897b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f16898c).lambda$pushToSummarize$19(this.f16897b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public wh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f16898c = translateController;
        this.f16897b = i10;
        this.d = callback;
    }
}
