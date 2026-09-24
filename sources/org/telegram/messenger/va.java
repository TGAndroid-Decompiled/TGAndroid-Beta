package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17737a;
    public final BaseController f17738b;
    public final int f17739c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17737a = i11;
        this.f17738b = baseController;
        this.f17739c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17737a) {
            case 0:
                ((MessagesController) this.f17738b).lambda$convertToGigaGroup$271(this.f17739c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17738b).lambda$convertToMegaGroup$266(this.f17739c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17738b).lambda$startSecretChat$31(this.f17739c, dialogInterface);
                return;
        }
    }
}
