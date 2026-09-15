package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17530a;
    public final BaseController f17531b;
    public final int f17532c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17530a = i11;
        this.f17531b = baseController;
        this.f17532c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17530a) {
            case 0:
                ((MessagesController) this.f17531b).lambda$convertToGigaGroup$271(this.f17532c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17531b).lambda$convertToMegaGroup$266(this.f17532c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17531b).lambda$startSecretChat$31(this.f17532c, dialogInterface);
                return;
        }
    }
}
