package org.telegram.messenger;

import android.content.Context;
import androidx.credentials.CreateCredentialResponse;
import org.telegram.tgnet.TLRPC;

public final class PasskeysController$$ExternalSyntheticLambda8 implements Utilities.Callback2 {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public PasskeysController$$ExternalSyntheticLambda8(Context context, int i, Utilities.Callback2 callback2) {
        this.f$0 = callback2;
        this.f$1 = context;
        this.f$2 = i;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Context context = (Context) this.f$1;
                int i = this.f$2;
                PasskeysController.lambda$create$7((Utilities.Callback2) this.f$0, context, i, (CreateCredentialResponse) obj, (Throwable) obj2);
                break;
            default:
                ((TranslateController) this.f$0).lambda$pushToSummarize$19(this.f$2, (Utilities.Callback) this.f$1, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public PasskeysController$$ExternalSyntheticLambda8(TranslateController translateController, int i, Utilities.Callback callback) {
        this.f$0 = translateController;
        this.f$2 = i;
        this.f$1 = callback;
    }
}
