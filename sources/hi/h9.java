package hi;

import android.content.DialogInterface;
public final class h9 implements DialogInterface.OnDismissListener {
    public final int f14734a;
    public final ta f14735b;

    public h9(ta taVar, int i7) {
        this.f14734a = i7;
        this.f14735b = taVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14734a) {
            case 0:
                ta taVar = this.f14735b;
                taVar.Y0.x(3, false);
                taVar.f15474r0 = null;
                return;
            default:
                ha haVar = this.f14735b.Y0;
                if (haVar != null) {
                    haVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
