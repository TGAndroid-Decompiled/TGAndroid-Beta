package org.telegram.messenger;

import android.content.DialogInterface;
public final class be implements DialogInterface.OnCancelListener {
    public final int f14957a;
    public final Object f14958b;

    public be(Object obj, int i10) {
        this.f14957a = i10;
        this.f14958b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f14957a;
        Object obj = this.f14958b;
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
                ((df) obj).f15376f = true;
                return;
        }
    }
}
