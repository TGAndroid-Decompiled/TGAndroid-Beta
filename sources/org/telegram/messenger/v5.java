package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class v5 implements DialogInterface.OnCancelListener {
    public final int f21727a;
    public final Object f21728b;

    public v5(Object obj, int i9) {
        this.f21727a = i9;
        this.f21728b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f21727a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f21728b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f21728b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f21728b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f21728b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
