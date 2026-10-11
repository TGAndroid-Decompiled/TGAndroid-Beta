package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class x5 implements DialogInterface.OnCancelListener {
    public final int f19767a;
    public final Object f19768b;

    public x5(Object obj, int i10) {
        this.f19767a = i10;
        this.f19768b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19767a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f19768b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f19768b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f19768b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19768b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
