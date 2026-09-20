package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oh implements Utilities.Callback2 {
    public final int f17190a = 0;
    public final int f17191b;
    public final Object f17192c;
    public final Object d;

    public oh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f17192c = callback2;
        this.d = context;
        this.f17191b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17190a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f17192c, (Context) this.d, this.f17191b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f17192c).lambda$pushToSummarize$19(this.f17191b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f17192c = translateController;
        this.f17191b = i10;
        this.d = callback;
    }
}
