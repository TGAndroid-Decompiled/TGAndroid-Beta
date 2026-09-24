package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f17114a = 0;
    public final int f17115b;
    public final Object f17116c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f17116c = callback2;
        this.d = context;
        this.f17115b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17114a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f17116c, (Context) this.d, this.f17115b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f17116c).lambda$pushToSummarize$19(this.f17115b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f17116c = translateController;
        this.f17115b = i10;
        this.d = callback;
    }
}
