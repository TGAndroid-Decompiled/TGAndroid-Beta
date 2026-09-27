package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17746a;
    public final BaseController f17747b;
    public final int f17748c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17746a = i11;
        this.f17747b = baseController;
        this.f17748c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17746a) {
            case 0:
                ((MessagesController) this.f17747b).lambda$convertToGigaGroup$271(this.f17748c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17747b).lambda$convertToMegaGroup$266(this.f17748c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17747b).lambda$startSecretChat$31(this.f17748c, dialogInterface);
                return;
        }
    }
}
