package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15745a;
    public LayoutInflater f15746b;
    public k f15747c;
    public ExpandedMenuView d;
    public w e;
    public f f15748f;

    public g(ContextWrapper contextWrapper) {
        this.f15745a = contextWrapper;
        this.f15746b = LayoutInflater.from(contextWrapper);
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
        f fVar = this.f15748f;
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
        if (this.f15745a != null) {
            this.f15745a = context;
            if (this.f15746b == null) {
                this.f15746b = LayoutInflater.from(context);
            }
        }
        this.f15747c = kVar;
        f fVar = this.f15748f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15754a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15774a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.b bVar = (g.b) b0Var.f4704c;
        g gVar = new g(bVar.f10641a);
        obj.f15776c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15776c;
        if (gVar2.f15748f == null) {
            gVar2.f15748f = new f(gVar2);
        }
        bVar.f10646i = gVar2.f15748f;
        bVar.f10647j = obj;
        View view = d0Var.f15765o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f10643c = d0Var.f15764n;
            bVar.d = d0Var.f15763m;
        }
        bVar.h = obj;
        g.f g10 = b0Var.g();
        obj.f15775b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15775b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15775b.show();
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
        this.f15747c.q(this.f15748f.getItem(i10), this, 0);
    }
}
