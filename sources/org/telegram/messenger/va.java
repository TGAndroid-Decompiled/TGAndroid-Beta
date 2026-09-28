package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17763a;
    public final BaseController f17764b;
    public final int f17765c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17763a = i11;
        this.f17764b = baseController;
        this.f17765c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17763a) {
            case 0:
                ((MessagesController) this.f17764b).lambda$convertToGigaGroup$271(this.f17765c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17764b).lambda$convertToMegaGroup$266(this.f17765c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17764b).lambda$startSecretChat$31(this.f17765c, dialogInterface);
                return;
        }
    }
}
