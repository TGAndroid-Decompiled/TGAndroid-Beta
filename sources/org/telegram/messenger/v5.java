package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class v5 implements DialogInterface.OnCancelListener {
    public final int f19231a;
    public final Object f19232b;

    public v5(Object obj, int i10) {
        this.f19231a = i10;
        this.f19232b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19231a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f19232b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f19232b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f19232b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19232b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
