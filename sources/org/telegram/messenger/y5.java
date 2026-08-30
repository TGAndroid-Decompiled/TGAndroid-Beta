package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class y5 implements DialogInterface.OnCancelListener {
    public final int f19021a;
    public final Object f19022b;

    public y5(Object obj, int i10) {
        this.f19021a = i10;
        this.f19022b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19021a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f19022b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f19022b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f19022b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19022b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
