package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class w5 implements DialogInterface.OnCancelListener {
    public final int f17973a;
    public final Object f17974b;

    public w5(Object obj, int i10) {
        this.f17973a = i10;
        this.f17974b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17973a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f17974b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f17974b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f17974b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f17974b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
