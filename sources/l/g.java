package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f13971a;
    public LayoutInflater f13972b;
    public k f13973c;
    public ExpandedMenuView d;
    public w f13974e;
    public f f13975f;

    public g(ContextWrapper contextWrapper) {
        this.f13971a = contextWrapper;
        this.f13972b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final void b(k kVar, boolean z10) {
        w wVar = this.f13974e;
        if (wVar != null) {
            wVar.b(kVar, z10);
        }
    }

    @Override
    public final boolean c(m mVar) {
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        f fVar = this.f13975f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void g(w wVar) {
        throw null;
    }

    @Override
    public final void i(Context context, k kVar) {
        if (this.f13971a != null) {
            this.f13971a = context;
            if (this.f13972b == null) {
                this.f13972b = LayoutInflater.from(context);
            }
        }
        this.f13973c = kVar;
        f fVar = this.f13975f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f13982a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f14003a = d0Var;
        p2.u uVar = new p2.u(context);
        g.c cVar = (g.c) uVar.f45495c;
        g gVar = new g(cVar.f6856a);
        obj.f14005c = gVar;
        gVar.f13974e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f14005c;
        if (gVar2.f13975f == null) {
            gVar2.f13975f = new f(gVar2);
        }
        cVar.f6862i = gVar2.f13975f;
        cVar.f6863j = obj;
        View view = d0Var.f13994o;
        if (view != null) {
            cVar.f6859e = view;
        } else {
            cVar.f6858c = d0Var.f13993n;
            cVar.d = d0Var.f13992m;
        }
        cVar.h = obj;
        g.f d = uVar.d();
        obj.f14004b = d;
        d.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f14004b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f14004b.show();
        w wVar = this.f13974e;
        if (wVar != null) {
            wVar.h(d0Var);
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
        this.f13973c.q(this.f13975f.getItem(i10), this, 0);
    }
}
