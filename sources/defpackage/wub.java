package defpackage;

import android.view.View;
public final class wub implements View.OnClickListener {
    public final qvb a;

    public wub(qvb qvbVar) {
        this.a = qvbVar;
    }

    @Override
    public final void onClick(View view) {
        qvb qvbVar = this.a;
        if (qvbVar.N) {
            ij.g0(qvbVar, -qvbVar.a, null, qvbVar.f(), null, false, qvbVar.K, new re1(this, (byte) 7), qvbVar.getResourceProvider());
            return;
        }
        qvbVar.getMessagesController().j(qvbVar.a, qvbVar.getUserConfig().f(), 0, null, qvbVar, false, new km4(qvbVar, (byte) 3), new rub(qvbVar), null);
        kk7.e().k(kk7.K4, new Object[0]);
        qvbVar.R0(false);
    }
}
