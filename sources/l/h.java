package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f11488a;
    public LayoutInflater f11489b;
    public l f11490c;
    public ExpandedMenuView d;
    public x e;
    public g f11491f;

    public h(ContextWrapper contextWrapper) {
        this.f11488a = contextWrapper;
        this.f11489b = LayoutInflater.from(contextWrapper);
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
        g gVar = this.f11491f;
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
        if (this.f11488a != null) {
            this.f11488a = context;
            if (this.f11489b == null) {
                this.f11489b = LayoutInflater.from(context);
            }
        }
        this.f11490c = lVar;
        g gVar = this.f11491f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f11497a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f11517a = e0Var;
        c5.x xVar = new c5.x(context);
        g.b bVar = (g.b) xVar.f3828c;
        h hVar = new h((ContextThemeWrapper) bVar.f7139c);
        obj.f11519c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f11519c;
        if (hVar2.f11491f == null) {
            hVar2.f11491f = new g(hVar2);
        }
        bVar.f7145l = hVar2.f11491f;
        bVar.f7146m = obj;
        View view = e0Var.f11508o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.e = e0Var.f11507n;
            bVar.f7140f = e0Var.f11506m;
        }
        bVar.f7144k = obj;
        g.f g10 = xVar.g();
        obj.f11518b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f11518b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f11518b.show();
        x xVar2 = this.e;
        if (xVar2 != null) {
            xVar2.B(e0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(n nVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f11490c.q(this.f11491f.getItem(i10), this, 0);
    }
}
