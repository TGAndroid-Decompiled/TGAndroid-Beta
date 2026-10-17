package org.telegram.messenger;

import android.content.DialogInterface;
public final class ab implements DialogInterface.OnCancelListener {
    public final int f17852a;
    public final BaseController f17853b;
    public final int f17854c;

    public ab(BaseController baseController, int i10, int i11) {
        this.f17852a = i11;
        this.f17853b = baseController;
        this.f17854c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17852a) {
            case 0:
                ((MessagesController) this.f17853b).lambda$convertToGigaGroup$270(this.f17854c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17853b).lambda$convertToMegaGroup$265(this.f17854c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17853b).lambda$startSecretChat$31(this.f17854c, dialogInterface);
                return;
        }
    }
}
