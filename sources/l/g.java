package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15160a;
    public LayoutInflater f15161b;
    public k f15162c;
    public ExpandedMenuView d;
    public w f15163e;
    public f f15164f;

    public g(ContextWrapper contextWrapper) {
        this.f15160a = contextWrapper;
        this.f15161b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z10) {
        w wVar = this.f15163e;
        if (wVar != null) {
            wVar.c(kVar, z10);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        f fVar = this.f15164f;
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
        if (this.f15160a != null) {
            this.f15160a = context;
            if (this.f15161b == null) {
                this.f15161b = LayoutInflater.from(context);
            }
        }
        this.f15162c = kVar;
        f fVar = this.f15164f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15171a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15192a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f4154c;
        g gVar = new g(cVar.f10027a);
        obj.f15194c = gVar;
        gVar.f15163e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15194c;
        if (gVar2.f15164f == null) {
            gVar2.f15164f = new f(gVar2);
        }
        cVar.f10033i = gVar2.f15164f;
        cVar.f10034j = obj;
        View view = d0Var.f15183o;
        if (view != null) {
            cVar.f10030e = view;
        } else {
            cVar.f10029c = d0Var.f15182n;
            cVar.d = d0Var.f15181m;
        }
        cVar.h = obj;
        g.g e7 = b0Var.e();
        obj.f15193b = e7;
        e7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15193b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15193b.show();
        w wVar = this.f15163e;
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
        this.f15162c.q(this.f15164f.getItem(i10), this, 0);
    }
}
