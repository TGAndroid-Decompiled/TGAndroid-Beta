package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class p6 implements DialogInterface.OnCancelListener {
    public final int f20919a;
    public final Object f20920b;

    public p6(Object obj, int i10) {
        this.f20919a = i10;
        this.f20920b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20919a) {
            case 0:
                MediaController.lambda$saveFile$54((boolean[]) this.f20920b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$47((boolean[]) this.f20920b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$463((boolean[]) this.f20920b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f20920b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
