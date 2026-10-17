package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class y5 implements DialogInterface.OnCancelListener {
    public final int f20120a;
    public final Object f20121b;

    public y5(Object obj, int i10) {
        this.f20120a = i10;
        this.f20121b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20120a) {
            case 0:
                MediaController.lambda$saveFile$45((boolean[]) this.f20121b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$52((boolean[]) this.f20121b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f20121b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f20121b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
