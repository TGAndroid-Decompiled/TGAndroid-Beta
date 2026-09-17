package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f13737a;
    public LayoutInflater f13738b;
    public k f13739c;
    public ExpandedMenuView d;
    public w e;
    public f f13740f;

    public g(ContextWrapper contextWrapper) {
        this.f13737a = contextWrapper;
        this.f13738b = LayoutInflater.from(contextWrapper);
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
        f fVar = this.f13740f;
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
        if (this.f13737a != null) {
            this.f13737a = context;
            if (this.f13738b == null) {
                this.f13738b = LayoutInflater.from(context);
            }
        }
        this.f13739c = kVar;
        f fVar = this.f13740f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f13746a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13766a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f3847c;
        g gVar = new g(cVar.f9228a);
        obj.f13768c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f13768c;
        if (gVar2.f13740f == null) {
            gVar2.f13740f = new f(gVar2);
        }
        cVar.f9233i = gVar2.f13740f;
        cVar.f9234j = obj;
        View view = d0Var.f13757o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9230c = d0Var.f13756n;
            cVar.d = d0Var.f13755m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f13767b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13767b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13767b.show();
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
        this.f13739c.q(this.f13740f.getItem(i10), this, 0);
    }
}
