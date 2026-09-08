package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oh implements Utilities.Callback2 {
    public final int f18626a = 0;
    public final int f18627b;
    public final Object f18628c;
    public final Object d;

    public oh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18628c = callback2;
        this.d = context;
        this.f18627b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18626a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18628c, (Context) this.d, this.f18627b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18628c).lambda$pushToSummarize$19(this.f18627b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18628c = translateController;
        this.f18627b = i10;
        this.d = callback;
    }
}
