package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f13950a;
    public LayoutInflater f13951b;
    public l f13952c;
    public ExpandedMenuView d;
    public x e;
    public g f13953f;

    public h(ContextWrapper contextWrapper) {
        this.f13950a = contextWrapper;
        this.f13951b = LayoutInflater.from(contextWrapper);
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
        g gVar = this.f13953f;
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
        if (this.f13950a != null) {
            this.f13950a = context;
            if (this.f13951b == null) {
                this.f13951b = LayoutInflater.from(context);
            }
        }
        this.f13952c = lVar;
        g gVar = this.f13953f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f13959a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13979a = e0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f3839c;
        h hVar = new h(cVar.f9210a);
        obj.f13981c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f13981c;
        if (hVar2.f13953f == null) {
            hVar2.f13953f = new g(hVar2);
        }
        cVar.f9215i = hVar2.f13953f;
        cVar.f9216j = obj;
        View view = e0Var.f13970o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9212c = e0Var.f13969n;
            cVar.d = e0Var.f13968m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f13980b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13980b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13980b.show();
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
        this.f13952c.q(this.f13953f.getItem(i10), this, 0);
    }
}
