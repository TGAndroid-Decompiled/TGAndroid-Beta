package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class y5 implements DialogInterface.OnCancelListener {
    public final int f19005a;
    public final Object f19006b;

    public y5(Object obj, int i10) {
        this.f19005a = i10;
        this.f19006b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19005a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f19006b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f19006b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f19006b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19006b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
