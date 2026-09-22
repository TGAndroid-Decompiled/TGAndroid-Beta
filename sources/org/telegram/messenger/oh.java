package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oh implements Utilities.Callback2 {
    public final int f17205a = 0;
    public final int f17206b;
    public final Object f17207c;
    public final Object d;

    public oh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f17207c = callback2;
        this.d = context;
        this.f17206b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17205a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f17207c, (Context) this.d, this.f17206b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f17207c).lambda$pushToSummarize$19(this.f17206b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f17207c = translateController;
        this.f17206b = i10;
        this.d = callback;
    }
}
