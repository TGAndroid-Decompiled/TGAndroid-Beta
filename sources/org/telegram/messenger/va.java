package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17762a;
    public final BaseController f17763b;
    public final int f17764c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17762a = i11;
        this.f17763b = baseController;
        this.f17764c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17762a) {
            case 0:
                ((MessagesController) this.f17763b).lambda$convertToGigaGroup$271(this.f17764c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17763b).lambda$convertToMegaGroup$266(this.f17764c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17763b).lambda$startSecretChat$31(this.f17764c, dialogInterface);
                return;
        }
    }
}
