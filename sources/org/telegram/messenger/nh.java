package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f18704a = 0;
    public final int f18705b;
    public final Object f18706c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18706c = callback2;
        this.d = context;
        this.f18705b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18704a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18706c, (Context) this.d, this.f18705b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18706c).lambda$pushToSummarize$19(this.f18705b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18706c = translateController;
        this.f18705b = i10;
        this.d = callback;
    }
}
