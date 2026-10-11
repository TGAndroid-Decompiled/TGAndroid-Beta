package org.telegram.messenger;

import android.content.DialogInterface;
public final class bb implements DialogInterface.OnCancelListener {
    public final int f17417a;
    public final BaseController f17418b;
    public final int f17419c;

    public bb(BaseController baseController, int i10, int i11) {
        this.f17417a = i11;
        this.f17418b = baseController;
        this.f17419c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17417a) {
            case 0:
                ((MessagesController) this.f17418b).lambda$convertToGigaGroup$270(this.f17419c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f17418b).lambda$convertToMegaGroup$265(this.f17419c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f17418b).lambda$startSecretChat$31(this.f17419c, dialogInterface);
                return;
        }
    }
}
