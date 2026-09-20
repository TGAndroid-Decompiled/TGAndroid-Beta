package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17744a;
    public final BaseController f17745b;
    public final int f17746c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17744a = i11;
        this.f17745b = baseController;
        this.f17746c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17744a) {
            case 0:
                ((MessagesController) this.f17745b).lambda$convertToGigaGroup$271(this.f17746c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17745b).lambda$convertToMegaGroup$266(this.f17746c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17745b).lambda$startSecretChat$31(this.f17746c, dialogInterface);
                return;
        }
    }
}
