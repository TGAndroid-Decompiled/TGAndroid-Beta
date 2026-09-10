package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f12619a;
    public LayoutInflater f12620b;
    public l f12621c;
    public ExpandedMenuView d;
    public x e;
    public g f12622f;

    public h(ContextWrapper contextWrapper) {
        this.f12619a = contextWrapper;
        this.f12620b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final void c(l lVar, boolean z10) {
        x xVar = this.e;
        if (xVar != null) {
            xVar.c(lVar, z10);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        g gVar = this.f12622f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void h(x xVar) {
        throw null;
    }

    @Override
    public final void i(Context context, l lVar) {
        if (this.f12619a != null) {
            this.f12619a = context;
            if (this.f12620b == null) {
                this.f12620b = LayoutInflater.from(context);
            }
        }
        this.f12621c = lVar;
        g gVar = this.f12622f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f12628a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f12648a = e0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f4261c;
        h hVar = new h(cVar.f8335a);
        obj.f12650c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f12650c;
        if (hVar2.f12622f == null) {
            hVar2.f12622f = new g(hVar2);
        }
        cVar.f8340i = hVar2.f12622f;
        cVar.f8341j = obj;
        View view = e0Var.f12639o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f8337c = e0Var.f12638n;
            cVar.d = e0Var.f12637m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f12649b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f12649b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f12649b.show();
        x xVar = this.e;
        if (xVar != null) {
            xVar.u(e0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(n nVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        this.f12621c.q(this.f12622f.getItem(i10), this, 0);
    }
}
