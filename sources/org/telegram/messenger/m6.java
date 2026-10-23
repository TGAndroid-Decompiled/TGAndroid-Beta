package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class m6 implements DialogInterface.OnCancelListener {
    public final int f18942a;
    public final Object f18943b;

    public m6(Object obj, int i10) {
        this.f18942a = i10;
        this.f18943b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18942a) {
            case 0:
                MediaController.lambda$saveFile$54((boolean[]) this.f18943b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$47((boolean[]) this.f18943b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f18943b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f18943b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
