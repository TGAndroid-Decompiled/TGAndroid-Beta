package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class s1c extends js9 {
    public final d2c f;

    public s1c(d2c d2cVar, Context context, wjb wjbVar) {
        super(context, 14.0f, wjbVar);
        this.f = d2cVar;
    }

    @Override
    public final void a(String str) {
        c1b c1bVar = this.f.w;
        b1b b1bVar = c1bVar.T;
        int i = c1bVar.c;
        if (c1bVar.O != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(c1bVar.O, true);
            c1bVar.O = 0;
        }
        if (c1bVar.P != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(c1bVar.P, true);
            c1bVar.P = 0;
        }
        if (TextUtils.isEmpty(str)) {
            c1bVar.S = null;
            c1bVar.G.clear();
            c1bVar.J.clear();
            c1bVar.F.clear();
            c1bVar.e.b(false);
            c1bVar.f();
        } else {
            c1bVar.S = str.toLowerCase();
        }
        gl.r(b1bVar);
        gl.e3(b1bVar, 300L);
    }
}
