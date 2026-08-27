package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

public final class kh implements Utilities.Callback2 {

    public final int f20793a = 0;

    public final int f20794b;

    public final Object f20795c;
    public final Object d;

    public kh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f20795c = callback2;
        this.d = context;
        this.f20794b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20793a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f20795c, (Context) this.d, this.f20794b, (v0.c) obj, (Throwable) obj2);
                break;
            default:
                ((TranslateController) this.f20795c).lambda$pushToSummarize$19(this.f20794b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public kh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f20795c = translateController;
        this.f20794b = i10;
        this.d = callback;
    }
}
