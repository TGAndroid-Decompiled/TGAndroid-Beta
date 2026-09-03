package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f11141a;
    public LayoutInflater f11142b;
    public k f11143c;
    public ExpandedMenuView d;
    public w e;
    public f f11144f;

    public g(ContextWrapper contextWrapper) {
        this.f11141a = contextWrapper;
        this.f11142b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z4) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.c(kVar, z4);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        f fVar = this.f11144f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void h(w wVar) {
        throw null;
    }

    @Override
    public final void i(Context context, k kVar) {
        if (this.f11141a != null) {
            this.f11141a = context;
            if (this.f11142b == null) {
                this.f11142b = LayoutInflater.from(context);
            }
        }
        this.f11143c = kVar;
        f fVar = this.f11144f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f11150a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f11170a = d0Var;
        p2.w wVar = new p2.w(context);
        g.c cVar = (g.c) wVar.f41052c;
        g gVar = new g(cVar.f6234a);
        obj.f11172c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f11172c;
        if (gVar2.f11144f == null) {
            gVar2.f11144f = new f(gVar2);
        }
        cVar.f6239i = gVar2.f11144f;
        cVar.f6240j = obj;
        View view = d0Var.f11161o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f6236c = d0Var.f11160n;
            cVar.d = d0Var.f11159m;
        }
        cVar.h = obj;
        g.f f10 = wVar.f();
        obj.f11171b = f10;
        f10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f11171b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f11171b.show();
        w wVar2 = this.e;
        if (wVar2 != null) {
            wVar2.p(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f11143c.q(this.f11144f.getItem(i10), this, 0);
    }
}
