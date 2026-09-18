package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17539a;
    public final BaseController f17540b;
    public final int f17541c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17539a = i11;
        this.f17540b = baseController;
        this.f17541c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17539a) {
            case 0:
                ((MessagesController) this.f17540b).lambda$convertToGigaGroup$271(this.f17541c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17540b).lambda$convertToMegaGroup$266(this.f17541c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17540b).lambda$startSecretChat$31(this.f17541c, dialogInterface);
                return;
        }
    }
}
