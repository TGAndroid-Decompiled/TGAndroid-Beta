package org.telegram.messenger;

import android.content.DialogInterface;
public final class cb implements DialogInterface.OnCancelListener {
    public final int f14905a;
    public final BaseController f14906b;
    public final int f14907c;

    public cb(BaseController baseController, int i10, int i11) {
        this.f14905a = i11;
        this.f14906b = baseController;
        this.f14907c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f14905a) {
            case 0:
                ((MessagesController) this.f14906b).lambda$convertToGigaGroup$271(this.f14907c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f14906b).lambda$convertToMegaGroup$266(this.f14907c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f14906b).lambda$startSecretChat$31(this.f14907c, dialogInterface);
                return;
        }
    }
}
