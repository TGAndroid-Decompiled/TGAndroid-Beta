package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oh implements Utilities.Callback2 {
    public final int f16963a = 0;
    public final int f16964b;
    public final Object f16965c;
    public final Object d;

    public oh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f16965c = callback2;
        this.d = context;
        this.f16964b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16963a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f16965c, (Context) this.d, this.f16964b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f16965c).lambda$pushToSummarize$19(this.f16964b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f16965c = translateController;
        this.f16964b = i10;
        this.d = callback;
    }
}
