package org.telegram.messenger;

import android.content.DialogInterface;

public final class SecretChatHelper$$ExternalSyntheticLambda10 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final BaseController f$0;
    public final int f$1;

    public SecretChatHelper$$ExternalSyntheticLambda10(BaseController baseController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((SecretChatHelper) this.f$0).lambda$startSecretChat$31(this.f$1, dialogInterface);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$convertToGigaGroup$271(this.f$1, dialogInterface);
                break;
            default:
                ((MessagesController) this.f$0).lambda$convertToMegaGroup$266(this.f$1, dialogInterface);
                break;
        }
    }
}
