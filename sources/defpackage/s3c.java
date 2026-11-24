package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class s3c extends lu9 {
    public final d4c f;

    public s3c(d4c d4cVar, Context context, ylb ylbVar) {
        super(context, 14.0f, ylbVar);
        this.f = d4cVar;
    }

    @Override
    public final void a(String str) {
        e3b e3bVar = this.f.w;
        d3b d3bVar = e3bVar.T;
        int i = e3bVar.c;
        if (e3bVar.O != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(e3bVar.O, true);
            e3bVar.O = 0;
        }
        if (e3bVar.P != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(e3bVar.P, true);
            e3bVar.P = 0;
        }
        if (TextUtils.isEmpty(str)) {
            e3bVar.S = null;
            e3bVar.G.clear();
            e3bVar.J.clear();
            e3bVar.F.clear();
            e3bVar.e.b(false);
            e3bVar.f();
        } else {
            e3bVar.S = str.toLowerCase();
        }
        gm.r(d3bVar);
        gm.d3(d3bVar, 300L);
    }
}
