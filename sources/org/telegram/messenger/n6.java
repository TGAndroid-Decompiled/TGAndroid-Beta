package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class n6 implements DialogInterface.OnCancelListener {
    public final int f19080a;
    public final Object f19081b;

    public n6(Object obj, int i10) {
        this.f19080a = i10;
        this.f19081b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19080a) {
            case 0:
                MediaController.lambda$saveFile$54((boolean[]) this.f19081b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$47((boolean[]) this.f19081b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f19081b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19081b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
