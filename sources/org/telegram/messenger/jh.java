package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class jh implements Utilities.Callback2 {
    public final int f18715a = 0;
    public final int f18716b;
    public final Object f18717c;
    public final Object d;

    public jh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18717c = callback2;
        this.d = context;
        this.f18716b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18715a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18717c, (Context) this.d, this.f18716b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18717c).lambda$pushToSummarize$19(this.f18716b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public jh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18717c = translateController;
        this.f18716b = i10;
        this.d = callback;
    }
}
