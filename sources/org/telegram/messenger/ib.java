package org.telegram.messenger;

import android.content.DialogInterface;
public final class ib implements DialogInterface.OnCancelListener {
    public final int f20328a;
    public final BaseController f20329b;
    public final int f20330c;

    public ib(BaseController baseController, int i10, int i11) {
        this.f20328a = i11;
        this.f20329b = baseController;
        this.f20330c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20328a) {
            case 0:
                ((MessagesController) this.f20329b).lambda$convertToGigaGroup$270(this.f20330c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f20329b).lambda$convertToMegaGroup$265(this.f20330c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f20329b).lambda$startSecretChat$31(this.f20330c, dialogInterface);
                return;
        }
    }
}
