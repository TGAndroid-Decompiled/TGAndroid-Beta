package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f18661a = 0;
    public final int f18662b;
    public final Object f18663c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18663c = callback2;
        this.d = context;
        this.f18662b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18661a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18663c, (Context) this.d, this.f18662b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18663c).lambda$pushToSummarize$19(this.f18662b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18663c = translateController;
        this.f18662b = i10;
        this.d = callback;
    }
}
