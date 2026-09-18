package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f13884a;
    public LayoutInflater f13885b;
    public l f13886c;
    public ExpandedMenuView d;
    public x e;
    public g f13887f;

    public h(ContextWrapper contextWrapper) {
        this.f13884a = contextWrapper;
        this.f13885b = LayoutInflater.from(contextWrapper);
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
        g gVar = this.f13887f;
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
        if (this.f13884a != null) {
            this.f13884a = context;
            if (this.f13885b == null) {
                this.f13885b = LayoutInflater.from(context);
            }
        }
        this.f13886c = lVar;
        g gVar = this.f13887f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f13893a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13913a = e0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f3847c;
        h hVar = new h(cVar.f9227a);
        obj.f13915c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f13915c;
        if (hVar2.f13887f == null) {
            hVar2.f13887f = new g(hVar2);
        }
        cVar.f9232i = hVar2.f13887f;
        cVar.f9233j = obj;
        View view = e0Var.f13904o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9229c = e0Var.f13903n;
            cVar.d = e0Var.f13902m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f13914b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13914b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13914b.show();
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
        this.f13886c.q(this.f13887f.getItem(i10), this, 0);
    }
}
