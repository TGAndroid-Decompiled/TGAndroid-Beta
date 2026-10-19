package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ih implements Utilities.Callback2 {
    public final int f18631a = 0;
    public final int f18632b;
    public final Object f18633c;
    public final Object d;

    public ih(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18633c = callback2;
        this.d = context;
        this.f18632b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18631a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18633c, (Context) this.d, this.f18632b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18633c).lambda$pushToSummarize$19(this.f18632b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public ih(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18633c = translateController;
        this.f18632b = i10;
        this.d = callback;
    }
}
