package org.telegram.messenger;

import android.content.DialogInterface;
public final class eb implements DialogInterface.OnCancelListener {
    public final int f17502a;
    public final BaseController f17503b;
    public final int f17504c;

    public eb(BaseController baseController, int i10, int i11) {
        this.f17502a = i11;
        this.f17503b = baseController;
        this.f17504c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17502a) {
            case 0:
                ((MessagesController) this.f17503b).lambda$convertToGigaGroup$270(this.f17504c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17503b).lambda$convertToMegaGroup$265(this.f17504c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17503b).lambda$startSecretChat$31(this.f17504c, dialogInterface);
                return;
        }
    }
}
