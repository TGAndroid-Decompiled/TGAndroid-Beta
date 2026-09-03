package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class y5 implements DialogInterface.OnCancelListener {
    public final int f20678a;
    public final Object f20679b;

    public y5(Object obj, int i10) {
        this.f20678a = i10;
        this.f20679b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20678a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f20679b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f20679b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f20679b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f20679b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
