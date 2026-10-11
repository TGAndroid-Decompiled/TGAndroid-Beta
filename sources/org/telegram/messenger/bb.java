package org.telegram.messenger;

import android.content.DialogInterface;
public final class bb implements DialogInterface.OnCancelListener {
    public final int f17453a;
    public final BaseController f17454b;
    public final int f17455c;

    public bb(BaseController baseController, int i10, int i11) {
        this.f17453a = i11;
        this.f17454b = baseController;
        this.f17455c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17453a) {
            case 0:
                ((MessagesController) this.f17454b).lambda$convertToGigaGroup$270(this.f17455c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17454b).lambda$convertToMegaGroup$265(this.f17455c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17454b).lambda$startSecretChat$31(this.f17455c, dialogInterface);
                return;
        }
    }
}
