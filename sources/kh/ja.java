package kh;

import android.content.DialogInterface;
public final class ja implements DialogInterface.OnDismissListener {
    public final int f15485a;
    public final wb f15486b;

    public ja(wb wbVar, int i9) {
        this.f15485a = i9;
        this.f15486b = wbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15485a) {
            case 0:
                wb wbVar = this.f15486b;
                wbVar.T0.x(3, false);
                wbVar.m0 = null;
                return;
            default:
                kb kbVar = this.f15486b.T0;
                if (kbVar != null) {
                    kbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
