package org.telegram.messenger;

import android.content.DialogInterface;
public final class eb implements DialogInterface.OnCancelListener {
    public final int f17158a;
    public final BaseController f17159b;
    public final int f17160c;

    public eb(BaseController baseController, int i10, int i11) {
        this.f17158a = i11;
        this.f17159b = baseController;
        this.f17160c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17158a) {
            case 0:
                ((MessagesController) this.f17159b).lambda$convertToGigaGroup$270(this.f17160c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17159b).lambda$convertToMegaGroup$265(this.f17160c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17159b).lambda$startSecretChat$31(this.f17160c, dialogInterface);
                return;
        }
    }
}
