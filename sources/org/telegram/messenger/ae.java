package org.telegram.messenger;

import android.content.DialogInterface;
public final class ae implements DialogInterface.OnCancelListener {
    public final int f22889a;
    public final Object f22890b;

    public ae(Object obj, int i7) {
        this.f22889a = i7;
        this.f22890b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f22889a;
        Object obj = this.f22890b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                ((boolean[]) obj)[0] = true;
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                ((boolean[]) obj)[0] = true;
                return;
            case 2:
                ((boolean[]) obj)[0] = true;
                return;
            default:
                ((af) obj).f22895f = true;
                return;
        }
    }
}
