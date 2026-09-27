package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f17123a = 0;
    public final int f17124b;
    public final Object f17125c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f17125c = callback2;
        this.d = context;
        this.f17124b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17123a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f17125c, (Context) this.d, this.f17124b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f17125c).lambda$pushToSummarize$19(this.f17124b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f17125c = translateController;
        this.f17124b = i10;
        this.d = callback;
    }
}
