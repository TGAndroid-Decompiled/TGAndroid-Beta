package org.telegram.messenger;

import android.content.DialogInterface;
public final class cb implements DialogInterface.OnCancelListener {
    public final int f18081a;
    public final BaseController f18082b;
    public final int f18083c;

    public cb(BaseController baseController, int i10, int i11) {
        this.f18081a = i11;
        this.f18082b = baseController;
        this.f18083c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18081a) {
            case 0:
                ((MessagesController) this.f18082b).lambda$convertToGigaGroup$270(this.f18083c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f18082b).lambda$convertToMegaGroup$265(this.f18083c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f18082b).lambda$startSecretChat$31(this.f18083c, dialogInterface);
                return;
        }
    }
}
