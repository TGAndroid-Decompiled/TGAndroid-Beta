package org.telegram.messenger;

import android.content.DialogInterface;
public final class va implements DialogInterface.OnCancelListener {
    public final int f19252a;
    public final BaseController f19253b;
    public final int f19254c;

    public va(BaseController baseController, int i10, int i11) {
        this.f19252a = i11;
        this.f19253b = baseController;
        this.f19254c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19252a) {
            case 0:
                ((MessagesController) this.f19253b).lambda$convertToGigaGroup$271(this.f19254c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19253b).lambda$convertToMegaGroup$266(this.f19254c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19253b).lambda$startSecretChat$31(this.f19254c, dialogInterface);
                return;
        }
    }
}
