package defpackage;

import android.view.View;
public final class xyb implements View.OnClickListener {
    public final tzb a;

    public xyb(tzb tzbVar) {
        this.a = tzbVar;
    }

    @Override
    public final void onClick(View view) {
        tzb tzbVar = this.a;
        if (tzbVar.N) {
            jj.g0(tzbVar, -tzbVar.a, null, tzbVar.e(), null, false, tzbVar.K, new ze1(this, (byte) 7), tzbVar.getResourceProvider());
            return;
        }
        tzbVar.getMessagesController().k(tzbVar.a, tzbVar.getUserConfig().f(), null, tzbVar, false, new po4(tzbVar, (byte) 3), new syb(tzbVar));
        jn7.e().k(jn7.L4, new Object[0]);
        tzbVar.S0(false);
    }
}
