package hi;

import android.content.DialogInterface;
public final class h9 implements DialogInterface.OnDismissListener {
    public final int f14693a;
    public final ta f14694b;

    public h9(ta taVar, int i7) {
        this.f14693a = i7;
        this.f14694b = taVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14693a) {
            case 0:
                ta taVar = this.f14694b;
                taVar.Y0.x(3, false);
                taVar.f15441r0 = null;
                return;
            default:
                ha haVar = this.f14694b.Y0;
                if (haVar != null) {
                    haVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
