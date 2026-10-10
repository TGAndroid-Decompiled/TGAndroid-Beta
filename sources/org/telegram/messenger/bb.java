package org.telegram.messenger;

import android.content.DialogInterface;
public final class bb implements DialogInterface.OnCancelListener {
    public final int f17424a;
    public final BaseController f17425b;
    public final int f17426c;

    public bb(BaseController baseController, int i10, int i11) {
        this.f17424a = i11;
        this.f17425b = baseController;
        this.f17426c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17424a) {
            case 0:
                ((MessagesController) this.f17425b).lambda$convertToGigaGroup$270(this.f17426c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17425b).lambda$convertToMegaGroup$265(this.f17426c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17425b).lambda$startSecretChat$31(this.f17426c, dialogInterface);
                return;
        }
    }
}
