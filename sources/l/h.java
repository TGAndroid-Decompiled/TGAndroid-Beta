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
    public Context f11489a;
    public LayoutInflater f11490b;
    public l f11491c;
    public ExpandedMenuView d;
    public x e;
    public g f11492f;

    public h(ContextWrapper contextWrapper) {
        this.f11489a = contextWrapper;
        this.f11490b = LayoutInflater.from(contextWrapper);
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
        g gVar = this.f11492f;
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
        if (this.f11489a != null) {
            this.f11489a = context;
            if (this.f11490b == null) {
                this.f11490b = LayoutInflater.from(context);
            }
        }
        this.f11491c = lVar;
        g gVar = this.f11492f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f11498a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f11518a = e0Var;
        c5.x xVar = new c5.x(context);
        g.b bVar = (g.b) xVar.f3828c;
        h hVar = new h((ContextThemeWrapper) bVar.f7140c);
        obj.f11520c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f11520c;
        if (hVar2.f11492f == null) {
            hVar2.f11492f = new g(hVar2);
        }
        bVar.f7146l = hVar2.f11492f;
        bVar.f7147m = obj;
        View view = e0Var.f11509o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.e = e0Var.f11508n;
            bVar.f7141f = e0Var.f11507m;
        }
        bVar.f7145k = obj;
        g.f g10 = xVar.g();
        obj.f11519b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f11519b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f11519b.show();
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
        this.f11491c.q(this.f11492f.getItem(i10), this, 0);
    }
}
