package org.telegram.messenger;

import android.content.DialogInterface;
public final class bb implements DialogInterface.OnCancelListener {
    public final int f17420a;
    public final BaseController f17421b;
    public final int f17422c;

    public bb(BaseController baseController, int i10, int i11) {
        this.f17420a = i11;
        this.f17421b = baseController;
        this.f17422c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17420a) {
            case 0:
                ((MessagesController) this.f17421b).lambda$convertToGigaGroup$270(this.f17422c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17421b).lambda$convertToMegaGroup$265(this.f17422c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17421b).lambda$startSecretChat$31(this.f17422c, dialogInterface);
                return;
        }
    }
}
