package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f17152a = 0;
    public final int f17153b;
    public final Object f17154c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f17154c = callback2;
        this.d = context;
        this.f17153b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17152a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f17154c, (Context) this.d, this.f17153b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f17154c).lambda$pushToSummarize$19(this.f17153b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f17154c = translateController;
        this.f17153b = i10;
        this.d = callback;
    }
}
