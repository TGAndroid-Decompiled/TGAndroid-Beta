package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class x5 implements DialogInterface.OnCancelListener {
    public final int f22146a;
    public final Object f22147b;

    public x5(Object obj, int i10) {
        this.f22146a = i10;
        this.f22147b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22146a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f22147b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f22147b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f22147b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f22147b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
