package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ih implements Utilities.Callback2 {
    public final int f18623a = 0;
    public final int f18624b;
    public final Object f18625c;
    public final Object d;

    public ih(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18625c = callback2;
        this.d = context;
        this.f18624b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18623a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18625c, (Context) this.d, this.f18624b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18625c).lambda$pushToSummarize$19(this.f18624b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public ih(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18625c = translateController;
        this.f18624b = i10;
        this.d = callback;
    }
}
