package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f19405a;
    public final BaseController f19406b;
    public final int f19407c;

    public va(BaseController baseController, int i10, int i11) {
        this.f19405a = i11;
        this.f19406b = baseController;
        this.f19407c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19405a) {
            case 0:
                ((MessagesController) this.f19406b).lambda$convertToGigaGroup$271(this.f19407c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19406b).lambda$convertToMegaGroup$266(this.f19407c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19406b).lambda$startSecretChat$31(this.f19407c, dialogInterface);
                return;
        }
    }
}
