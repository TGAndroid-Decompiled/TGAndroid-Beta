package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f13949a;
    public LayoutInflater f13950b;
    public l f13951c;
    public ExpandedMenuView d;
    public x e;
    public g f13952f;

    public h(ContextWrapper contextWrapper) {
        this.f13949a = contextWrapper;
        this.f13950b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d() {
        g gVar = this.f13952f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void e(x xVar) {
        throw null;
    }

    @Override
    public final void g(l lVar, boolean z10) {
        x xVar = this.e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
    }

    @Override
    public final void i(Context context, l lVar) {
        if (this.f13949a != null) {
            this.f13949a = context;
            if (this.f13950b == null) {
                this.f13950b = LayoutInflater.from(context);
            }
        }
        this.f13951c = lVar;
        g gVar = this.f13952f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f13958a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13978a = e0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f3839c;
        h hVar = new h(cVar.f9210a);
        obj.f13980c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f13980c;
        if (hVar2.f13952f == null) {
            hVar2.f13952f = new g(hVar2);
        }
        cVar.f9215i = hVar2.f13952f;
        cVar.f9216j = obj;
        View view = e0Var.f13969o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9212c = e0Var.f13968n;
            cVar.d = e0Var.f13967m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f13979b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13979b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13979b.show();
        x xVar = this.e;
        if (xVar != null) {
            xVar.v(e0Var);
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
        this.f13951c.q(this.f13952f.getItem(i10), this, 0);
    }
}
