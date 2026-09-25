package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17752a;
    public final BaseController f17753b;
    public final int f17754c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17752a = i11;
        this.f17753b = baseController;
        this.f17754c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17752a) {
            case 0:
                ((MessagesController) this.f17753b).lambda$convertToGigaGroup$271(this.f17754c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17753b).lambda$convertToMegaGroup$266(this.f17754c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17753b).lambda$startSecretChat$31(this.f17754c, dialogInterface);
                return;
        }
    }
}
