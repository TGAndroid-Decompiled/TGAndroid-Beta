package org.telegram.messenger;

import android.content.DialogInterface;
public final class eb implements DialogInterface.OnCancelListener {
    public final int f18341a;
    public final BaseController f18342b;
    public final int f18343c;

    public eb(BaseController baseController, int i10, int i11) {
        this.f18341a = i11;
        this.f18342b = baseController;
        this.f18343c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18341a) {
            case 0:
                ((MessagesController) this.f18342b).lambda$convertToGigaGroup$270(this.f18343c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f18342b).lambda$convertToMegaGroup$265(this.f18343c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f18342b).lambda$startSecretChat$31(this.f18343c, dialogInterface);
                return;
        }
    }
}
