package org.telegram.messenger;

import android.content.DialogInterface;
public final class bb implements DialogInterface.OnCancelListener {
    public final int f17941a;
    public final BaseController f17942b;
    public final int f17943c;

    public bb(BaseController baseController, int i10, int i11) {
        this.f17941a = i11;
        this.f17942b = baseController;
        this.f17943c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17941a) {
            case 0:
                ((MessagesController) this.f17942b).lambda$convertToGigaGroup$270(this.f17943c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17942b).lambda$convertToMegaGroup$265(this.f17943c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17942b).lambda$startSecretChat$31(this.f17943c, dialogInterface);
                return;
        }
    }
}
