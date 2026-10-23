package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class lh implements Utilities.Callback2 {
    public final int f18969a = 0;
    public final int f18970b;
    public final Object f18971c;
    public final Object d;

    public lh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18971c = callback2;
        this.d = context;
        this.f18970b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18969a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18971c, (Context) this.d, this.f18970b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18971c).lambda$pushToSummarize$19(this.f18970b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public lh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18971c = translateController;
        this.f18970b = i10;
        this.d = callback;
    }
}
