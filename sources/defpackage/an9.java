package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class an9 implements ed, no7 {
    public final on9 a;

    public an9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        io5 g = vxcVar.a.g(647);
        on9 on9Var = this.a;
        on9Var.R = g;
        on9Var.f.requestLayout();
        return vxc.b;
    }

    @Override
    public final void u(hd hdVar, int i) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        this.a.dismiss();
        kk7.e().k(kk7.u2, new Object[0]);
    }
}
