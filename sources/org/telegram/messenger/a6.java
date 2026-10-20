package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class a6 implements DialogInterface.OnCancelListener {
    public final int f17842a;
    public final Object f17843b;

    public a6(Object obj, int i10) {
        this.f17842a = i10;
        this.f17843b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17842a) {
            case 0:
                MediaController.d((boolean[]) this.f17843b, dialogInterface);
                return;
            case 1:
                MediaController.E((boolean[]) this.f17843b, dialogInterface);
                return;
            case 2:
                MessagesController.J5((boolean[]) this.f17843b, dialogInterface);
                return;
            default:
                MediaController.MediaLoader.c((MediaController.MediaLoader) this.f17843b, dialogInterface);
                return;
        }
    }
}
