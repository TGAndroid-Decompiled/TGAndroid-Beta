package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class r5c extends cw9 {
    public final d6c f;

    public r5c(d6c d6cVar, Context context, vnb vnbVar) {
        super(context, 14.0f, vnbVar);
        this.f = d6cVar;
    }

    @Override
    public final void a(String str) {
        z4b z4bVar = this.f.w;
        y4b y4bVar = z4bVar.T;
        int i = z4bVar.c;
        if (z4bVar.O != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(z4bVar.O, true);
            z4bVar.O = 0;
        }
        if (z4bVar.P != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(z4bVar.P, true);
            z4bVar.P = 0;
        }
        if (TextUtils.isEmpty(str)) {
            z4bVar.S = null;
            z4bVar.G.clear();
            z4bVar.J.clear();
            z4bVar.F.clear();
            z4bVar.e.b(false);
            z4bVar.f();
        } else {
            z4bVar.S = str.toLowerCase();
        }
        hl.r(y4bVar);
        hl.d3(y4bVar, 300L);
    }
}
