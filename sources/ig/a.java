package ig;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
public final class a {
    public final ng.a f11128a;
    public xd.b f11129b;
    public xd.b f11130c;
    public pg.i d;
    public ViewGroup f11131e;
    public boolean f11132f;

    public a(ng.a aVar) {
        this.f11128a = aVar;
    }

    public final kg.d a(View view) {
        return c(view, null, false);
    }

    public final kg.d b(View view, lg.a aVar) {
        return c(view, aVar, false);
    }

    public final kg.d c(View view, lg.a aVar, boolean z10) {
        ViewGroup viewGroup;
        kg.d y10 = this.f11128a.y();
        if (this.f11132f && Build.VERSION.SDK_INT >= 33 && (y10 instanceof kg.e)) {
            kg.e eVar = (kg.e) y10;
            eVar.N = new f(eVar.I);
        }
        y10.n(aVar);
        xd.b bVar = this.f11130c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        pg.i iVar = this.d;
        if (iVar != null && (viewGroup = this.f11131e) != null && view != null) {
            iVar.d(view, viewGroup, new b5.d(28, y10, view), z10);
        }
        xd.b bVar2 = this.f11129b;
        if (bVar2 != null) {
            bVar2.add(y10);
        }
        return y10;
    }

    public final void d() {
        xd.b bVar = this.f11130c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(xd.b bVar) {
        this.f11130c = bVar;
    }

    public final void f(pg.i iVar, ViewGroup viewGroup) {
        this.d = iVar;
        this.f11131e = viewGroup;
    }
}
