package bi;

import android.content.DialogInterface;
public final class ic implements DialogInterface.OnDismissListener {
    public final int f2892a;
    public final ce f2893b;

    public ic(ce ceVar, int i10) {
        this.f2892a = i10;
        this.f2893b = ceVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2892a) {
            case 0:
                ce ceVar = this.f2893b;
                ceVar.X0.x(3, false);
                ceVar.f2480q0 = null;
                return;
            default:
                nd ndVar = this.f2893b.X0;
                if (ndVar != null) {
                    ndVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
