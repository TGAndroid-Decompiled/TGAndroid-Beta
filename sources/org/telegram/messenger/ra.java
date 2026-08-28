package org.telegram.messenger;

import android.content.DialogInterface;
public final class ra implements DialogInterface.OnCancelListener {
    public final int f21394a;
    public final BaseController f21395b;
    public final int f21396c;

    public ra(BaseController baseController, int i9, int i10) {
        this.f21394a = i10;
        this.f21395b = baseController;
        this.f21396c = i9;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f21394a) {
            case 0:
                ((MessagesController) this.f21395b).lambda$convertToGigaGroup$271(this.f21396c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f21395b).lambda$convertToMegaGroup$266(this.f21396c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f21395b).lambda$startSecretChat$31(this.f21396c, dialogInterface);
                return;
        }
    }
}
