package defpackage;

import android.view.View;
public final class xwb implements View.OnClickListener {
    public final sxb a;

    public xwb(sxb sxbVar) {
        this.a = sxbVar;
    }

    @Override
    public final void onClick(View view) {
        sxb sxbVar = this.a;
        if (sxbVar.N) {
            ik.g0(sxbVar, -sxbVar.a, null, sxbVar.f(), null, false, sxbVar.K, new zf1(this, (byte) 7), sxbVar.getResourceProvider());
            return;
        }
        sxbVar.getMessagesController().k(sxbVar.a, sxbVar.getUserConfig().f(), null, sxbVar, false, new lo4(sxbVar, (byte) 3), new swb(sxbVar));
        nm7.e().k(nm7.M4, new Object[0]);
        sxbVar.S0(false);
    }
}
