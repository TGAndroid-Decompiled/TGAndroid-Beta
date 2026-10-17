package ei;

import android.content.DialogInterface;
public final class ha implements DialogInterface.OnDismissListener {
    public final int f9166a;
    public final vb f9167b;

    public ha(vb vbVar, int i10) {
        this.f9166a = i10;
        this.f9167b = vbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9166a) {
            case 0:
                vb vbVar = this.f9167b;
                vbVar.X0.x(3, false);
                vbVar.f9998q0 = null;
                return;
            default:
                jb jbVar = this.f9167b.X0;
                if (jbVar != null) {
                    jbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
