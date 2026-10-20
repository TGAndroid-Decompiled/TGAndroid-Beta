package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class kh implements Utilities.Callback2 {
    public final int f18813a = 0;
    public final int f18814b;
    public final Object f18815c;
    public final Object d;

    public kh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18815c = callback2;
        this.d = context;
        this.f18814b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18813a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18815c, (Context) this.d, this.f18814b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18815c).lambda$pushToSummarize$19(this.f18814b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public kh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18815c = translateController;
        this.f18814b = i10;
        this.d = callback;
    }
}
