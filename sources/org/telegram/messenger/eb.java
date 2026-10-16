package org.telegram.messenger;

import android.content.DialogInterface;
public final class eb implements DialogInterface.OnCancelListener {
    public final int f16855a;
    public final BaseController f16856b;
    public final int f16857c;

    public eb(BaseController baseController, int i10, int i11) {
        this.f16855a = i11;
        this.f16856b = baseController;
        this.f16857c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f16855a) {
            case 0:
                ((MessagesController) this.f16856b).lambda$convertToGigaGroup$270(this.f16857c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f16856b).lambda$convertToMegaGroup$265(this.f16857c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f16856b).lambda$startSecretChat$31(this.f16857c, dialogInterface);
                return;
        }
    }
}
