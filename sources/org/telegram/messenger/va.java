package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f19410a;
    public final BaseController f19411b;
    public final int f19412c;

    public va(BaseController baseController, int i10, int i11) {
        this.f19410a = i11;
        this.f19411b = baseController;
        this.f19412c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19410a) {
            case 0:
                ((MessagesController) this.f19411b).lambda$convertToGigaGroup$271(this.f19412c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19411b).lambda$convertToMegaGroup$266(this.f19412c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19411b).lambda$startSecretChat$31(this.f19412c, dialogInterface);
                return;
        }
    }
}
