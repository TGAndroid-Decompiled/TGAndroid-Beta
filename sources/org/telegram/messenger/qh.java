package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qh implements Utilities.Callback2 {
    public final int f18717a = 0;
    public final int f18718b;
    public final Object f18719c;
    public final Object d;

    public qh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18719c = callback2;
        this.d = context;
        this.f18718b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18717a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18719c, (Context) this.d, this.f18718b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18719c).lambda$pushToSummarize$19(this.f18718b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public qh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18719c = translateController;
        this.f18718b = i10;
        this.d = callback;
    }
}
