package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oh implements Utilities.Callback2 {
    public final int f20876a = 0;
    public final int f20877b;
    public final Object f20878c;
    public final Object d;

    public oh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f20878c = callback2;
        this.d = context;
        this.f20877b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20876a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f20878c, (Context) this.d, this.f20877b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f20878c).lambda$pushToSummarize$19(this.f20877b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f20878c = translateController;
        this.f20877b = i10;
        this.d = callback;
    }
}
