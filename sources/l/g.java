package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15744a;
    public LayoutInflater f15745b;
    public k f15746c;
    public ExpandedMenuView d;
    public w e;
    public f f15747f;

    public g(ContextWrapper contextWrapper) {
        this.f15744a = contextWrapper;
        this.f15745b = LayoutInflater.from(contextWrapper);
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
        f fVar = this.f15747f;
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
        if (this.f15744a != null) {
            this.f15744a = context;
            if (this.f15745b == null) {
                this.f15745b = LayoutInflater.from(context);
            }
        }
        this.f15746c = kVar;
        f fVar = this.f15747f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15753a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15773a = d0Var;
        c5.c0 c0Var = new c5.c0(context);
        g.b bVar = (g.b) c0Var.f4724c;
        g gVar = new g(bVar.f10638a);
        obj.f15775c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15775c;
        if (gVar2.f15747f == null) {
            gVar2.f15747f = new f(gVar2);
        }
        bVar.f10643i = gVar2.f15747f;
        bVar.f10644j = obj;
        View view = d0Var.f15764o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f10640c = d0Var.f15763n;
            bVar.d = d0Var.f15762m;
        }
        bVar.h = obj;
        g.f i10 = c0Var.i();
        obj.f15774b = i10;
        i10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15774b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15774b.show();
        w wVar = this.e;
        if (wVar != null) {
            wVar.r(d0Var);
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
        this.f15746c.q(this.f15747f.getItem(i10), this, 0);
    }
}
