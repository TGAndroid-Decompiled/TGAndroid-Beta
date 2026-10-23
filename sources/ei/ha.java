package ei;

import android.content.DialogInterface;
public final class ha implements DialogInterface.OnDismissListener {
    public final int f9175a;
    public final vb f9176b;

    public ha(vb vbVar, int i10) {
        this.f9175a = i10;
        this.f9176b = vbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9175a) {
            case 0:
                vb vbVar = this.f9176b;
                vbVar.X0.x(3, false);
                vbVar.f10014q0 = null;
                return;
            default:
                jb jbVar = this.f9176b.X0;
                if (jbVar != null) {
                    jbVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
