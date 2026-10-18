package ei;

import android.content.DialogInterface;
public final class ha implements DialogInterface.OnDismissListener {
    public final int f9167a;
    public final vb f9168b;

    public ha(vb vbVar, int i10) {
        this.f9167a = i10;
        this.f9168b = vbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9167a) {
            case 0:
                vb vbVar = this.f9168b;
                vbVar.X0.x(3, false);
                vbVar.f10000q0 = null;
                return;
            default:
                jb jbVar = this.f9168b.X0;
                if (jbVar != null) {
                    jbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
