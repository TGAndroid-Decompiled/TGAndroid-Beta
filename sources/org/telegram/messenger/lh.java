package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class lh implements Utilities.Callback2 {
    public final int f18901a = 0;
    public final int f18902b;
    public final Object f18903c;
    public final Object d;

    public lh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18903c = callback2;
        this.d = context;
        this.f18902b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18901a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18903c, (Context) this.d, this.f18902b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18903c).lambda$pushToSummarize$19(this.f18902b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public lh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18903c = translateController;
        this.f18902b = i10;
        this.d = callback;
    }
}
