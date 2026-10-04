package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f19403a;
    public final BaseController f19404b;
    public final int f19405c;

    public va(BaseController baseController, int i10, int i11) {
        this.f19403a = i11;
        this.f19404b = baseController;
        this.f19405c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19403a) {
            case 0:
                ((MessagesController) this.f19404b).lambda$convertToGigaGroup$271(this.f19405c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19404b).lambda$convertToMegaGroup$266(this.f19405c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19404b).lambda$startSecretChat$31(this.f19405c, dialogInterface);
                return;
        }
    }
}
