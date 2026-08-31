package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f11384a;
    public LayoutInflater f11385b;
    public l f11386c;
    public ExpandedMenuView d;
    public x f11387e;
    public g f11388f;

    public h(ContextWrapper contextWrapper) {
        this.f11384a = contextWrapper;
        this.f11385b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final void c(l lVar, boolean z4) {
        x xVar = this.f11387e;
        if (xVar != null) {
            xVar.c(lVar, z4);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        g gVar = this.f11388f;
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
        if (this.f11384a != null) {
            this.f11384a = context;
            if (this.f11385b == null) {
                this.f11385b = LayoutInflater.from(context);
            }
        }
        this.f11386c = lVar;
        g gVar = this.f11388f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f11395a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f11416a = e0Var;
        p2.v vVar = new p2.v(context);
        g.c cVar = (g.c) vVar.f44183c;
        h hVar = new h(cVar.f6699a);
        obj.f11418c = hVar;
        hVar.f11387e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f11418c;
        if (hVar2.f11388f == null) {
            hVar2.f11388f = new g(hVar2);
        }
        cVar.f6705i = hVar2.f11388f;
        cVar.f6706j = obj;
        View view = e0Var.f11407o;
        if (view != null) {
            cVar.f6702e = view;
        } else {
            cVar.f6701c = e0Var.f11406n;
            cVar.d = e0Var.f11405m;
        }
        cVar.h = obj;
        g.f d = vVar.d();
        obj.f11417b = d;
        d.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f11417b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f11417b.show();
        x xVar = this.f11387e;
        if (xVar != null) {
            xVar.d0(e0Var);
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
        this.f11386c.q(this.f11388f.getItem(i10), this, 0);
    }
}
