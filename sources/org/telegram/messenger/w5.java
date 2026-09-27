package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class w5 implements DialogInterface.OnCancelListener {
    public final int f17986a;
    public final Object f17987b;

    public w5(Object obj, int i10) {
        this.f17986a = i10;
        this.f17987b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17986a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f17987b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f17987b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f17987b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f17987b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
