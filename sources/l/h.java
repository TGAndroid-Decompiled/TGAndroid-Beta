package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f13923a;
    public LayoutInflater f13924b;
    public l f13925c;
    public ExpandedMenuView d;
    public x e;
    public g f13926f;

    public h(ContextWrapper contextWrapper) {
        this.f13923a = contextWrapper;
        this.f13924b = LayoutInflater.from(contextWrapper);
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
        g gVar = this.f13926f;
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
        if (this.f13923a != null) {
            this.f13923a = context;
            if (this.f13924b == null) {
                this.f13924b = LayoutInflater.from(context);
            }
        }
        this.f13925c = lVar;
        g gVar = this.f13926f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f13932a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13952a = e0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f3848c;
        h hVar = new h(cVar.f9228a);
        obj.f13954c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f13954c;
        if (hVar2.f13926f == null) {
            hVar2.f13926f = new g(hVar2);
        }
        cVar.f9233i = hVar2.f13926f;
        cVar.f9234j = obj;
        View view = e0Var.f13943o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9230c = e0Var.f13942n;
            cVar.d = e0Var.f13941m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f13953b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13953b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13953b.show();
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
        this.f13925c.q(this.f13926f.getItem(i10), this, 0);
    }
}
