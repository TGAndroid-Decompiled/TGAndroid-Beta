package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oh implements Utilities.Callback2 {
    public final int f18599a = 0;
    public final int f18600b;
    public final Object f18601c;
    public final Object d;

    public oh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18601c = callback2;
        this.d = context;
        this.f18600b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18599a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18601c, (Context) this.d, this.f18600b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18601c).lambda$pushToSummarize$19(this.f18600b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18601c = translateController;
        this.f18600b = i10;
        this.d = callback;
    }
}
