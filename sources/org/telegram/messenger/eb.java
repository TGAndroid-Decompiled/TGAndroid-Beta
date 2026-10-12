package org.telegram.messenger;

import android.content.DialogInterface;
public final class eb implements DialogInterface.OnCancelListener {
    public final int f17501a;
    public final BaseController f17502b;
    public final int f17503c;

    public eb(BaseController baseController, int i10, int i11) {
        this.f17501a = i11;
        this.f17502b = baseController;
        this.f17503c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17501a) {
            case 0:
                ((MessagesController) this.f17502b).lambda$convertToGigaGroup$270(this.f17503c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17502b).lambda$convertToMegaGroup$265(this.f17503c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17502b).lambda$startSecretChat$31(this.f17503c, dialogInterface);
                return;
        }
    }
}
