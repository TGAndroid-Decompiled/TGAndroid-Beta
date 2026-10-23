package org.telegram.messenger;

import android.content.DialogInterface;
public final class eb implements DialogInterface.OnCancelListener {
    public final int f18276a;
    public final BaseController f18277b;
    public final int f18278c;

    public eb(BaseController baseController, int i10, int i11) {
        this.f18276a = i11;
        this.f18277b = baseController;
        this.f18278c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18276a) {
            case 0:
                ((MessagesController) this.f18277b).lambda$convertToGigaGroup$270(this.f18278c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f18277b).lambda$convertToMegaGroup$265(this.f18278c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f18277b).lambda$startSecretChat$31(this.f18278c, dialogInterface);
                return;
        }
    }
}
