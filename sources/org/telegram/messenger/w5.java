package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class w5 implements DialogInterface.OnCancelListener {
    public final int f18003a;
    public final Object f18004b;

    public w5(Object obj, int i10) {
        this.f18003a = i10;
        this.f18004b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18003a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f18004b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f18004b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f18004b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f18004b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
