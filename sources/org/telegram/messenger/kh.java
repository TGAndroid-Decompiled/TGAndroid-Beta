package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class kh implements Utilities.Callback2 {
    public final int f18806a = 0;
    public final int f18807b;
    public final Object f18808c;
    public final Object d;

    public kh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18808c = callback2;
        this.d = context;
        this.f18807b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18806a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18808c, (Context) this.d, this.f18807b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18808c).lambda$pushToSummarize$19(this.f18807b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public kh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18808c = translateController;
        this.f18807b = i10;
        this.d = callback;
    }
}
