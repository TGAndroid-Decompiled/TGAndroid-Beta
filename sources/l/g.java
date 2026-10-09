package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15224a;
    public LayoutInflater f15225b;
    public k f15226c;
    public ExpandedMenuView d;
    public w f15227e;
    public f f15228f;

    public g(ContextWrapper contextWrapper) {
        this.f15224a = contextWrapper;
        this.f15225b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f15227e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f15228f;
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
        if (this.f15224a != null) {
            this.f15224a = context;
            if (this.f15225b == null) {
                this.f15225b = LayoutInflater.from(context);
            }
        }
        this.f15226c = kVar;
        f fVar = this.f15228f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15235a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15256a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.b bVar = (g.b) b0Var.f4204c;
        g gVar = new g(bVar.f10097a);
        obj.f15258c = gVar;
        gVar.f15227e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15258c;
        if (gVar2.f15228f == null) {
            gVar2.f15228f = new f(gVar2);
        }
        bVar.f10103i = gVar2.f15228f;
        bVar.f10104j = obj;
        View view = d0Var.f15247o;
        if (view != null) {
            bVar.f10100e = view;
        } else {
            bVar.f10099c = d0Var.f15246n;
            bVar.d = d0Var.f15245m;
        }
        bVar.h = obj;
        g.f e7 = b0Var.e();
        obj.f15257b = e7;
        e7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15257b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15257b.show();
        w wVar = this.f15227e;
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
        this.f15226c.q(this.f15228f.getItem(i10), this, 0);
    }
}
