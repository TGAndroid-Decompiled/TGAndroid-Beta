package org.telegram.messenger;

import android.content.DialogInterface;
public final class fb implements DialogInterface.OnCancelListener {
    public final int f18409a;
    public final BaseController f18410b;
    public final int f18411c;

    public fb(BaseController baseController, int i10, int i11) {
        this.f18409a = i11;
        this.f18410b = baseController;
        this.f18411c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18409a) {
            case 0:
                ((MessagesController) this.f18410b).lambda$convertToGigaGroup$270(this.f18411c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f18410b).lambda$convertToMegaGroup$265(this.f18411c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f18410b).lambda$startSecretChat$31(this.f18411c, dialogInterface);
                return;
        }
    }
}
