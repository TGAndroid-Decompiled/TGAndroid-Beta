package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f18709a = 0;
    public final int f18710b;
    public final Object f18711c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18711c = callback2;
        this.d = context;
        this.f18710b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18709a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18711c, (Context) this.d, this.f18710b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18711c).lambda$pushToSummarize$19(this.f18710b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18711c = translateController;
        this.f18710b = i10;
        this.d = callback;
    }
}
