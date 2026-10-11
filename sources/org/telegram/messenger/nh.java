package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f18669a = 0;
    public final int f18670b;
    public final Object f18671c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18671c = callback2;
        this.d = context;
        this.f18670b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18669a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18671c, (Context) this.d, this.f18670b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18671c).lambda$pushToSummarize$19(this.f18670b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18671c = translateController;
        this.f18670b = i10;
        this.d = callback;
    }
}
