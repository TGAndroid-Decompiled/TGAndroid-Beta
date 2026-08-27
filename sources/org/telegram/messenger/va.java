package org.telegram.messenger;

import android.content.DialogInterface;

public final class va implements DialogInterface.OnCancelListener {

    public final int f21789a;

    public final BaseController f21790b;

    public final int f21791c;

    public va(BaseController baseController, int i10, int i11) {
        this.f21789a = i11;
        this.f21790b = baseController;
        this.f21791c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f21789a) {
            case 0:
                ((MessagesController) this.f21790b).lambda$convertToGigaGroup$271(this.f21791c, dialogInterface);
                break;
            case 1:
                ((MessagesController) this.f21790b).lambda$convertToMegaGroup$266(this.f21791c, dialogInterface);
                break;
            default:
                ((SecretChatHelper) this.f21790b).lambda$startSecretChat$31(this.f21791c, dialogInterface);
                break;
        }
    }
}
