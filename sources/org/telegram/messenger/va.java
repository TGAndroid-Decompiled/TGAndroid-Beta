package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17711a;
    public final BaseController f17712b;
    public final int f17713c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17711a = i11;
        this.f17712b = baseController;
        this.f17713c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17711a) {
            case 0:
                ((MessagesController) this.f17712b).lambda$convertToGigaGroup$271(this.f17713c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17712b).lambda$convertToMegaGroup$266(this.f17713c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17712b).lambda$startSecretChat$31(this.f17713c, dialogInterface);
                return;
        }
    }
}
