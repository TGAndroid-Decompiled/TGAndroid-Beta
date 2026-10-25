package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class o6 implements DialogInterface.OnCancelListener {
    public final int f20831a;
    public final Object f20832b;

    public o6(Object obj, int i10) {
        this.f20831a = i10;
        this.f20832b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20831a) {
            case 0:
                MediaController.lambda$saveFile$54((boolean[]) this.f20832b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$47((boolean[]) this.f20832b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$462((boolean[]) this.f20832b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f20832b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
