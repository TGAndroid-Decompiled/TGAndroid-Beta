package org.telegram.messenger;

import android.content.DialogInterface;
public final class fb implements DialogInterface.OnCancelListener {
    public final int f18344a;
    public final BaseController f18345b;
    public final int f18346c;

    public fb(BaseController baseController, int i10, int i11) {
        this.f18344a = i11;
        this.f18345b = baseController;
        this.f18346c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18344a) {
            case 0:
                ((MessagesController) this.f18345b).lambda$convertToGigaGroup$270(this.f18346c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f18345b).lambda$convertToMegaGroup$265(this.f18346c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f18345b).lambda$startSecretChat$31(this.f18346c, dialogInterface);
                return;
        }
    }
}
