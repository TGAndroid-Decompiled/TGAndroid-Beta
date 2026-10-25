package org.telegram.messenger;

import android.content.DialogInterface;
public final class bb implements DialogInterface.OnCancelListener {
    public final int f19701a;
    public final BaseController f19702b;
    public final int f19703c;

    public bb(BaseController baseController, int i10, int i11) {
        this.f19701a = i11;
        this.f19702b = baseController;
        this.f19703c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19701a) {
            case 0:
                ((MessagesController) this.f19702b).lambda$convertToGigaGroup$270(this.f19703c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19702b).lambda$convertToMegaGroup$265(this.f19703c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19702b).lambda$startSecretChat$31(this.f19703c, dialogInterface);
                return;
        }
    }
}
