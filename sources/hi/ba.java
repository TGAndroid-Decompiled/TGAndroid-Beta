package hi;

import android.content.DialogInterface;
public final class ba implements DialogInterface.OnDismissListener {
    public final int f14238a;
    public final nb f14239b;

    public ba(nb nbVar, int i7) {
        this.f14238a = i7;
        this.f14239b = nbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14238a) {
            case 0:
                nb nbVar = this.f14239b;
                nbVar.Y0.x(3, false);
                nbVar.f15108r0 = null;
                return;
            default:
                bb bbVar = this.f14239b.Y0;
                if (bbVar != null) {
                    bbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
