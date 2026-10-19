package org.telegram.messenger;

import android.content.DialogInterface;
public final class ab implements DialogInterface.OnCancelListener {
    public final int f17858a;
    public final BaseController f17859b;
    public final int f17860c;

    public ab(BaseController baseController, int i10, int i11) {
        this.f17858a = i11;
        this.f17859b = baseController;
        this.f17860c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17858a) {
            case 0:
                ((MessagesController) this.f17859b).lambda$convertToGigaGroup$270(this.f17860c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17859b).lambda$convertToMegaGroup$265(this.f17860c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17859b).lambda$startSecretChat$31(this.f17860c, dialogInterface);
                return;
        }
    }
}
