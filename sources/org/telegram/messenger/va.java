package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f19404a;
    public final BaseController f19405b;
    public final int f19406c;

    public va(BaseController baseController, int i10, int i11) {
        this.f19404a = i11;
        this.f19405b = baseController;
        this.f19406c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19404a) {
            case 0:
                ((MessagesController) this.f19405b).lambda$convertToGigaGroup$271(this.f19406c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19405b).lambda$convertToMegaGroup$266(this.f19406c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19405b).lambda$startSecretChat$31(this.f19406c, dialogInterface);
                return;
        }
    }
}
