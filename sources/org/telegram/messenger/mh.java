package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class mh implements Utilities.Callback2 {
    public final int f18977a = 0;
    public final int f18978b;
    public final Object f18979c;
    public final Object d;

    public mh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18979c = callback2;
        this.d = context;
        this.f18978b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18977a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18979c, (Context) this.d, this.f18978b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18979c).lambda$pushToSummarize$19(this.f18978b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public mh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18979c = translateController;
        this.f18978b = i10;
        this.d = callback;
    }
}
