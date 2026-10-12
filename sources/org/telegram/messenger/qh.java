package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qh implements Utilities.Callback2 {
    public final int f18233a = 0;
    public final int f18234b;
    public final Object f18235c;
    public final Object d;

    public qh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18235c = callback2;
        this.d = context;
        this.f18234b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18233a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18235c, (Context) this.d, this.f18234b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18235c).lambda$pushToSummarize$19(this.f18234b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public qh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18235c = translateController;
        this.f18234b = i10;
        this.d = callback;
    }
}
