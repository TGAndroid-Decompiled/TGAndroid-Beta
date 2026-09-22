package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f13937a;
    public LayoutInflater f13938b;
    public l f13939c;
    public ExpandedMenuView d;
    public x e;
    public g f13940f;

    public h(ContextWrapper contextWrapper) {
        this.f13937a = contextWrapper;
        this.f13938b = LayoutInflater.from(contextWrapper);
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
        g gVar = this.f13940f;
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
        if (this.f13937a != null) {
            this.f13937a = context;
            if (this.f13938b == null) {
                this.f13938b = LayoutInflater.from(context);
            }
        }
        this.f13939c = lVar;
        g gVar = this.f13940f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f13946a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13966a = e0Var;
        c5.a0 a0Var = new c5.a0(context);
        g.c cVar = (g.c) a0Var.f3845c;
        h hVar = new h(cVar.f9228a);
        obj.f13968c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f13968c;
        if (hVar2.f13940f == null) {
            hVar2.f13940f = new g(hVar2);
        }
        cVar.f9233i = hVar2.f13940f;
        cVar.f9234j = obj;
        View view = e0Var.f13957o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9230c = e0Var.f13956n;
            cVar.d = e0Var.f13955m;
        }
        cVar.h = obj;
        g.g e = a0Var.e();
        obj.f13967b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13967b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13967b.show();
        x xVar = this.e;
        if (xVar != null) {
            xVar.q(e0Var);
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
        this.f13939c.q(this.f13940f.getItem(i10), this, 0);
    }
}
