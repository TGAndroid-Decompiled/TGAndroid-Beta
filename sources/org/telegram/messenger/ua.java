package org.telegram.messenger;

import android.content.DialogInterface;
public final class ua implements DialogInterface.OnCancelListener {
    public final int f19178a;
    public final BaseController f19179b;
    public final int f19180c;

    public ua(BaseController baseController, int i10, int i11) {
        this.f19178a = i11;
        this.f19179b = baseController;
        this.f19180c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19178a) {
            case 0:
                ((MessagesController) this.f19179b).lambda$convertToGigaGroup$271(this.f19180c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19179b).lambda$convertToMegaGroup$266(this.f19180c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19179b).lambda$startSecretChat$31(this.f19180c, dialogInterface);
                return;
        }
    }
}
