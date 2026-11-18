package org.telegram.messenger;

import android.content.DialogInterface;
public final class ae implements DialogInterface.OnCancelListener {
    public final int f22861a;
    public final Object f22862b;

    public ae(Object obj, int i7) {
        this.f22861a = i7;
        this.f22862b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f22861a;
        Object obj = this.f22862b;
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
                ((af) obj).f22867f = true;
                return;
        }
    }
}
