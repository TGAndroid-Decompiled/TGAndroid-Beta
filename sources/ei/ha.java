package ei;

import android.content.DialogInterface;
public final class ha implements DialogInterface.OnDismissListener {
    public final int f9165a;
    public final vb f9166b;

    public ha(vb vbVar, int i10) {
        this.f9165a = i10;
        this.f9166b = vbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9165a) {
            case 0:
                vb vbVar = this.f9166b;
                vbVar.X0.x(3, false);
                vbVar.f9998q0 = null;
                return;
            default:
                jb jbVar = this.f9166b.X0;
                if (jbVar != null) {
                    jbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
