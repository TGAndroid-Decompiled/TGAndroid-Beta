package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class x5 implements DialogInterface.OnCancelListener {
    public final int f19774a;
    public final Object f19775b;

    public x5(Object obj, int i10) {
        this.f19774a = i10;
        this.f19775b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19774a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f19775b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f19775b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f19775b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19775b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
