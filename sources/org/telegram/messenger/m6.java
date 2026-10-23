package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class m6 implements DialogInterface.OnCancelListener {
    public final int f19006a;
    public final Object f19007b;

    public m6(Object obj, int i10) {
        this.f19006a = i10;
        this.f19007b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19006a) {
            case 0:
                MediaController.lambda$saveFile$54((boolean[]) this.f19007b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$47((boolean[]) this.f19007b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f19007b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19007b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
