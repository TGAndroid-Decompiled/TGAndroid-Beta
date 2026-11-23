package org.telegram.messenger;

import android.content.DialogInterface;
public final class ae implements DialogInterface.OnCancelListener {
    public final int f22972a;
    public final Object f22973b;

    public ae(Object obj, int i7) {
        this.f22972a = i7;
        this.f22973b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f22972a;
        Object obj = this.f22973b;
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
                ((af) obj).f22978f = true;
                return;
        }
    }
}
