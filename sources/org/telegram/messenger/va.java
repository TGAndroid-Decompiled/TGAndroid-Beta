package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f19225a;
    public final BaseController f19226b;
    public final int f19227c;

    public va(BaseController baseController, int i10, int i11) {
        this.f19225a = i11;
        this.f19226b = baseController;
        this.f19227c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19225a) {
            case 0:
                ((MessagesController) this.f19226b).lambda$convertToGigaGroup$271(this.f19227c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19226b).lambda$convertToMegaGroup$266(this.f19227c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19226b).lambda$startSecretChat$31(this.f19227c, dialogInterface);
                return;
        }
    }
}
