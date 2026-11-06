package org.telegram.messenger;

import android.content.DialogInterface;
public final class ce implements DialogInterface.OnCancelListener {
    public final int f21807a;
    public final Object f21808b;

    public ce(Object obj, int i7) {
        this.f21807a = i7;
        this.f21808b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f21807a;
        Object obj = this.f21808b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.V1;
                ((boolean[]) obj)[0] = true;
                return;
            case 1:
                String[] strArr2 = MediaController.V1;
                ((boolean[]) obj)[0] = true;
                return;
            case 2:
                ((boolean[]) obj)[0] = true;
                return;
            default:
                ((cf) obj).f21813f = true;
                return;
        }
    }
}
