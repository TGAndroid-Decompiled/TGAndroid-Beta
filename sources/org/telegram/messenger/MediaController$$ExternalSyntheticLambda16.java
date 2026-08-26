package org.telegram.messenger;

import android.content.DialogInterface;

public final class MediaController$$ExternalSyntheticLambda16 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final Object f$0;

    public MediaController$$ExternalSyntheticLambda16(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f$0, dialogInterface);
                break;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f$0, dialogInterface);
                break;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f$0, dialogInterface);
                break;
            default:
                ((MediaController.MediaLoader) this.f$0).lambda$new$0(dialogInterface);
                break;
        }
    }
}
