package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class bp9 implements ee, qq7 {
    public final pp9 a;

    public bp9(pp9 pp9Var) {
        this.a = pp9Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        iq5 g = wzcVar.a.g(647);
        pp9 pp9Var = this.a;
        pp9Var.R = g;
        pp9Var.f.requestLayout();
        return wzc.b;
    }

    @Override
    public final void r(he heVar, int i) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        this.a.dismiss();
        nm7.e().k(nm7.v2, new Object[0]);
    }
}
