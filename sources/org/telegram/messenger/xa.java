package org.telegram.messenger;

import android.content.DialogInterface;
public final class xa implements DialogInterface.OnCancelListener {
    public final int f22164a;
    public final BaseController f22165b;
    public final int f22166c;

    public xa(BaseController baseController, int i10, int i11) {
        this.f22164a = i11;
        this.f22165b = baseController;
        this.f22166c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22164a) {
            case 0:
                ((MessagesController) this.f22165b).lambda$convertToGigaGroup$271(this.f22166c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f22165b).lambda$convertToMegaGroup$266(this.f22166c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f22165b).lambda$startSecretChat$31(this.f22166c, dialogInterface);
                return;
        }
    }
}
