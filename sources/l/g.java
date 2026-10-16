package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f14406a;
    public LayoutInflater f14407b;
    public k f14408c;
    public ExpandedMenuView d;
    public w e;
    public f f14409f;

    public g(ContextWrapper contextWrapper) {
        this.f14406a = contextWrapper;
        this.f14407b = LayoutInflater.from(contextWrapper);
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
        f fVar = this.f14409f;
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
        if (this.f14406a != null) {
            this.f14406a = context;
            if (this.f14407b == null) {
                this.f14407b = LayoutInflater.from(context);
            }
        }
        this.f14408c = kVar;
        f fVar = this.f14409f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f14415a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f14435a = d0Var;
        c5.c0 c0Var = new c5.c0(context);
        g.b bVar = (g.b) c0Var.f4356c;
        g gVar = new g(bVar.f9733a);
        obj.f14437c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f14437c;
        if (gVar2.f14409f == null) {
            gVar2.f14409f = new f(gVar2);
        }
        bVar.f9738i = gVar2.f14409f;
        bVar.f9739j = obj;
        View view = d0Var.f14426o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f9735c = d0Var.f14425n;
            bVar.d = d0Var.f14424m;
        }
        bVar.h = obj;
        g.f d = c0Var.d();
        obj.f14436b = d;
        d.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f14436b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f14436b.show();
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
        this.f14408c.q(this.f14409f.getItem(i10), this, 0);
    }
}
