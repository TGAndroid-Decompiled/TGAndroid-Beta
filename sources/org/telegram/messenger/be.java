package org.telegram.messenger;

import android.content.DialogInterface;
public final class be implements DialogInterface.OnCancelListener {
    public final int f23040a;
    public final Object f23041b;

    public be(Object obj, int i7) {
        this.f23040a = i7;
        this.f23041b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f23040a;
        Object obj = this.f23041b;
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
                ((bf) obj).f23046f = true;
                return;
        }
    }
}
