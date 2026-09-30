package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17779a;
    public final BaseController f17780b;
    public final int f17781c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17779a = i11;
        this.f17780b = baseController;
        this.f17781c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17779a) {
            case 0:
                ((MessagesController) this.f17780b).lambda$convertToGigaGroup$271(this.f17781c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17780b).lambda$convertToMegaGroup$266(this.f17781c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17780b).lambda$startSecretChat$31(this.f17781c, dialogInterface);
                return;
        }
    }
}
