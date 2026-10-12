package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f14404a;
    public LayoutInflater f14405b;
    public k f14406c;
    public ExpandedMenuView d;
    public w e;
    public f f14407f;

    public g(ContextWrapper contextWrapper) {
        this.f14404a = contextWrapper;
        this.f14405b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(k kVar, boolean z10) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f14407f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void h(w wVar) {
        throw null;
    }

    @Override
    public final void i(Context context, k kVar) {
        if (this.f14404a != null) {
            this.f14404a = context;
            if (this.f14405b == null) {
                this.f14405b = LayoutInflater.from(context);
            }
        }
        this.f14406c = kVar;
        f fVar = this.f14407f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f14413a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f14433a = d0Var;
        c5.c0 c0Var = new c5.c0(context);
        g.b bVar = (g.b) c0Var.f4353c;
        g gVar = new g(bVar.f9730a);
        obj.f14435c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f14435c;
        if (gVar2.f14407f == null) {
            gVar2.f14407f = new f(gVar2);
        }
        bVar.f9735i = gVar2.f14407f;
        bVar.f9736j = obj;
        View view = d0Var.f14424o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f9732c = d0Var.f14423n;
            bVar.d = d0Var.f14422m;
        }
        bVar.h = obj;
        g.f g10 = c0Var.g();
        obj.f14434b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f14434b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f14434b.show();
        w wVar = this.e;
        if (wVar != null) {
            wVar.q(d0Var);
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
        this.f14406c.q(this.f14407f.getItem(i10), this, 0);
    }
}
