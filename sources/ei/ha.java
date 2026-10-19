package ei;

import android.content.DialogInterface;
public final class ha implements DialogInterface.OnDismissListener {
    public final int f9164a;
    public final vb f9165b;

    public ha(vb vbVar, int i10) {
        this.f9164a = i10;
        this.f9165b = vbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9164a) {
            case 0:
                vb vbVar = this.f9165b;
                vbVar.X0.x(3, false);
                vbVar.f9997q0 = null;
                return;
            default:
                jb jbVar = this.f9165b.X0;
                if (jbVar != null) {
                    jbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
