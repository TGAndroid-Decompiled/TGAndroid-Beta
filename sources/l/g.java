package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f13713a;
    public LayoutInflater f13714b;
    public k f13715c;
    public ExpandedMenuView d;
    public w e;
    public f f13716f;

    public g(ContextWrapper contextWrapper) {
        this.f13713a = contextWrapper;
        this.f13714b = LayoutInflater.from(contextWrapper);
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
    public final void d() {
        f fVar = this.f13716f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void e(w wVar) {
        throw null;
    }

    @Override
    public final void g(k kVar, boolean z10) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.g(kVar, z10);
        }
    }

    @Override
    public final void i(Context context, k kVar) {
        if (this.f13713a != null) {
            this.f13713a = context;
            if (this.f13714b == null) {
                this.f13714b = LayoutInflater.from(context);
            }
        }
        this.f13715c = kVar;
        f fVar = this.f13716f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f13722a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13742a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f3839c;
        g gVar = new g(cVar.f9211a);
        obj.f13744c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f13744c;
        if (gVar2.f13716f == null) {
            gVar2.f13716f = new f(gVar2);
        }
        cVar.f9216i = gVar2.f13716f;
        cVar.f9217j = obj;
        View view = d0Var.f13733o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9213c = d0Var.f13732n;
            cVar.d = d0Var.f13731m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f13743b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13743b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13743b.show();
        w wVar = this.e;
        if (wVar != null) {
            wVar.v(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        this.f13715c.q(this.f13716f.getItem(i10), this, 0);
    }
}
