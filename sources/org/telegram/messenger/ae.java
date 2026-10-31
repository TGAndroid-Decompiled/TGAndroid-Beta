package org.telegram.messenger;

import android.content.DialogInterface;
public final class ae implements DialogInterface.OnCancelListener {
    public final int f14602a;
    public final Object f14603b;

    public ae(Object obj, int i10) {
        this.f14602a = i10;
        this.f14603b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f14602a;
        Object obj = this.f14603b;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                ((boolean[]) obj)[0] = true;
                return;
            case 1:
                String[] strArr2 = MediaController.U1;
                ((boolean[]) obj)[0] = true;
                return;
            case 2:
                ((boolean[]) obj)[0] = true;
                return;
            default:
                ((cf) obj).f15014f = true;
                return;
        }
    }
}
