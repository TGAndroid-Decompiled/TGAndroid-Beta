package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15743a;
    public LayoutInflater f15744b;
    public k f15745c;
    public ExpandedMenuView d;
    public w e;
    public f f15746f;

    public g(ContextWrapper contextWrapper) {
        this.f15743a = contextWrapper;
        this.f15744b = LayoutInflater.from(contextWrapper);
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
        f fVar = this.f15746f;
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
        if (this.f15743a != null) {
            this.f15743a = context;
            if (this.f15744b == null) {
                this.f15744b = LayoutInflater.from(context);
            }
        }
        this.f15745c = kVar;
        f fVar = this.f15746f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15752a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15772a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.b bVar = (g.b) b0Var.f4704c;
        g gVar = new g(bVar.f10639a);
        obj.f15774c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15774c;
        if (gVar2.f15746f == null) {
            gVar2.f15746f = new f(gVar2);
        }
        bVar.f10644i = gVar2.f15746f;
        bVar.f10645j = obj;
        View view = d0Var.f15763o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f10641c = d0Var.f15762n;
            bVar.d = d0Var.f15761m;
        }
        bVar.h = obj;
        g.f i10 = b0Var.i();
        obj.f15773b = i10;
        i10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15773b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15773b.show();
        w wVar = this.e;
        if (wVar != null) {
            wVar.u(d0Var);
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
        this.f15745c.q(this.f15746f.getItem(i10), this, 0);
    }
}
