package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class rq9 implements fd, nr7 {
    public final er9 a;

    public rq9(er9 er9Var) {
        this.a = er9Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        mq5 g = l2dVar.a.g(647);
        er9 er9Var = this.a;
        er9Var.R = g;
        er9Var.f.requestLayout();
        return l2d.b;
    }

    @Override
    public final void w(id idVar, int i) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        this.a.dismiss();
        jn7.e().k(jn7.v2, new Object[0]);
    }
}
