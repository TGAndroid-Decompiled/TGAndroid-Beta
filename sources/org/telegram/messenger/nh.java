package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nh implements Utilities.Callback2 {
    public final int f18705a = 0;
    public final int f18706b;
    public final Object f18707c;
    public final Object d;

    public nh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f18707c = callback2;
        this.d = context;
        this.f18706b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18705a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f18707c, (Context) this.d, this.f18706b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f18707c).lambda$pushToSummarize$19(this.f18706b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public nh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f18707c = translateController;
        this.f18706b = i10;
        this.d = callback;
    }
}
