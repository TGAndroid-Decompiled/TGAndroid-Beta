package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f13725a;
    public LayoutInflater f13726b;
    public k f13727c;
    public ExpandedMenuView d;
    public w e;
    public f f13728f;

    public g(ContextWrapper contextWrapper) {
        this.f13725a = contextWrapper;
        this.f13726b = LayoutInflater.from(contextWrapper);
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
        f fVar = this.f13728f;
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
        if (this.f13725a != null) {
            this.f13725a = context;
            if (this.f13726b == null) {
                this.f13726b = LayoutInflater.from(context);
            }
        }
        this.f13727c = kVar;
        f fVar = this.f13728f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f13734a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13754a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f3844c;
        g gVar = new g(cVar.f9225a);
        obj.f13756c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f13756c;
        if (gVar2.f13728f == null) {
            gVar2.f13728f = new f(gVar2);
        }
        cVar.f9230i = gVar2.f13728f;
        cVar.f9231j = obj;
        View view = d0Var.f13745o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9227c = d0Var.f13744n;
            cVar.d = d0Var.f13743m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f13755b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13755b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13755b.show();
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
        this.f13727c.q(this.f13728f.getItem(i10), this, 0);
    }
}
