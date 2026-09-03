package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qh implements Utilities.Callback2 {
    public final int f19789a = 0;
    public final int f19790b;
    public final Object f19791c;
    public final Object d;

    public qh(Context context, int i10, Utilities.Callback2 callback2) {
        this.f19791c = callback2;
        this.d = context;
        this.f19790b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19789a) {
            case 0:
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f19791c, (Context) this.d, this.f19790b, (v0.c) obj, (Throwable) obj2);
                return;
            default:
                ((TranslateController) this.f19791c).lambda$pushToSummarize$19(this.f19790b, (Utilities.Callback) this.d, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public qh(TranslateController translateController, int i10, Utilities.Callback callback) {
        this.f19791c = translateController;
        this.f19790b = i10;
        this.d = callback;
    }
}
