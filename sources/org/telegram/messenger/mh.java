package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class mh implements Utilities.Callback2 {
    public final int f19043a = 0;
    public final int f19044b;
    public final Object f19045c;
    public final Object d;

    public mh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f19045c = callback2;
        this.d = context;
        this.f19044b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19043a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f19045c, (Context) this.d, this.f19044b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f19045c).lambda$pushToSummarize$19(this.f19044b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public mh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f19045c = translateController;
        this.f19044b = i10;
        this.d = callback;
    }
}
