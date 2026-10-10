package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15228a;
    public LayoutInflater f15229b;
    public k f15230c;
    public ExpandedMenuView d;
    public w f15231e;
    public f f15232f;

    public g(ContextWrapper contextWrapper) {
        this.f15228a = contextWrapper;
        this.f15229b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f15231e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f15232f;
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
        if (this.f15228a != null) {
            this.f15228a = context;
            if (this.f15229b == null) {
                this.f15229b = LayoutInflater.from(context);
            }
        }
        this.f15230c = kVar;
        f fVar = this.f15232f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15239a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15260a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.b bVar = (g.b) b0Var.f4204c;
        g gVar = new g(bVar.f10097a);
        obj.f15262c = gVar;
        gVar.f15231e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15262c;
        if (gVar2.f15232f == null) {
            gVar2.f15232f = new f(gVar2);
        }
        bVar.f10103i = gVar2.f15232f;
        bVar.f10104j = obj;
        View view = d0Var.f15251o;
        if (view != null) {
            bVar.f10100e = view;
        } else {
            bVar.f10099c = d0Var.f15250n;
            bVar.d = d0Var.f15249m;
        }
        bVar.h = obj;
        g.f e7 = b0Var.e();
        obj.f15261b = e7;
        e7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15261b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15261b.show();
        w wVar = this.f15231e;
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
        this.f15230c.q(this.f15232f.getItem(i10), this, 0);
    }
}
