package org.telegram.messenger;

import android.content.DialogInterface;
public final class ab implements DialogInterface.OnCancelListener {
    public final int f17861a;
    public final BaseController f17862b;
    public final int f17863c;

    public ab(BaseController baseController, int i10, int i11) {
        this.f17861a = i11;
        this.f17862b = baseController;
        this.f17863c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17861a) {
            case 0:
                ((MessagesController) this.f17862b).lambda$convertToGigaGroup$270(this.f17863c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17862b).lambda$convertToMegaGroup$265(this.f17863c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17862b).lambda$startSecretChat$31(this.f17863c, dialogInterface);
                return;
        }
    }
}
