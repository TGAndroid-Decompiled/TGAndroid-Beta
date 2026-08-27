package org.telegram.messenger;

import android.content.DialogInterface;

public final class x5 implements DialogInterface.OnCancelListener {

    public final int f22104a;

    public final Object f22105b;

    public x5(Object obj, int i10) {
        this.f22104a = i10;
        this.f22105b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22104a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.f22105b, dialogInterface);
                break;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.f22105b, dialogInterface);
                break;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.f22105b, dialogInterface);
                break;
            default:
                ((MediaController.MediaLoader) this.f22105b).lambda$new$0(dialogInterface);
                break;
        }
    }
}
