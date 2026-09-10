package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class c6 implements DialogInterface.OnCancelListener {
    public final int f14841a;
    public final Object f14842b;

    public c6(Object obj, int i10) {
        this.f14841a = i10;
        this.f14842b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f14841a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f14842b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f14842b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f14842b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f14842b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
