package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f17527a;
    public final BaseController f17528b;
    public final int f17529c;

    public va(BaseController baseController, int i10, int i11) {
        this.f17527a = i11;
        this.f17528b = baseController;
        this.f17529c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17527a) {
            case 0:
                ((MessagesController) this.f17528b).lambda$convertToGigaGroup$271(this.f17529c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17528b).lambda$convertToMegaGroup$266(this.f17529c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17528b).lambda$startSecretChat$31(this.f17529c, dialogInterface);
                return;
        }
    }
}
