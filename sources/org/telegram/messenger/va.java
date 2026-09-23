package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17497a;
    public final BaseController f17498b;
    public final int f17499c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17497a = i11;
        this.f17498b = baseController;
        this.f17499c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17497a) {
            case 0:
                ((MessagesController) this.f17498b).lambda$convertToGigaGroup$271(this.f17499c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17498b).lambda$convertToMegaGroup$266(this.f17499c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17498b).lambda$startSecretChat$31(this.f17499c, dialogInterface);
                return;
        }
    }
}
