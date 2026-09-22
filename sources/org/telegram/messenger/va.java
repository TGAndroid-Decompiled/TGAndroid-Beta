package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17759a;
    public final BaseController f17760b;
    public final int f17761c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17759a = i11;
        this.f17760b = baseController;
        this.f17761c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17759a) {
            case 0:
                ((MessagesController) this.f17760b).lambda$convertToGigaGroup$271(this.f17761c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17760b).lambda$convertToMegaGroup$266(this.f17761c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17760b).lambda$startSecretChat$31(this.f17761c, dialogInterface);
                return;
        }
    }
}
