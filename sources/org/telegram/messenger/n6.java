package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class n6 implements DialogInterface.OnCancelListener {
    public final int f19014a;
    public final Object f19015b;

    public n6(Object obj, int i10) {
        this.f19014a = i10;
        this.f19015b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19014a) {
            case 0:
                MediaController.lambda$saveFile$54((boolean[]) this.f19015b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$47((boolean[]) this.f19015b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f19015b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19015b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
