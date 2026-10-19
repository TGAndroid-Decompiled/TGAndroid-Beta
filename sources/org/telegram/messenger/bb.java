package org.telegram.messenger;

import android.content.DialogInterface;
public final class bb implements DialogInterface.OnCancelListener {
    public final int f17944a;
    public final BaseController f17945b;
    public final int f17946c;

    public bb(BaseController baseController, int i10, int i11) {
        this.f17944a = i11;
        this.f17945b = baseController;
        this.f17946c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17944a) {
            case 0:
                ((MessagesController) this.f17945b).lambda$convertToGigaGroup$270(this.f17946c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17945b).lambda$convertToMegaGroup$265(this.f17946c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17945b).lambda$startSecretChat$31(this.f17946c, dialogInterface);
                return;
        }
    }
}
