package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f21080a = 0;
    public final int f21081b;
    public final Object f21082c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f21082c = callback2;
        this.d = context;
        this.f21081b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21080a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f21082c, (Context) this.d, this.f21081b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f21082c).lambda$pushToSummarize$19(this.f21081b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f21082c = translateController;
        this.f21081b = i10;
        this.d = callback;
    }
}
