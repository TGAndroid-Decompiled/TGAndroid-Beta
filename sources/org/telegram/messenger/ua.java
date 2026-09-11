package org.telegram.messenger;

import android.content.DialogInterface;
public final class ua implements DialogInterface.OnCancelListener {
    public final int f19151a;
    public final BaseController f19152b;
    public final int f19153c;

    public ua(BaseController baseController, int i10, int i11) {
        this.f19151a = i11;
        this.f19152b = baseController;
        this.f19153c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19151a) {
            case 0:
                ((MessagesController) this.f19152b).lambda$convertToGigaGroup$271(this.f19153c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19152b).lambda$convertToMegaGroup$266(this.f19153c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19152b).lambda$startSecretChat$31(this.f19153c, dialogInterface);
                return;
        }
    }
}
