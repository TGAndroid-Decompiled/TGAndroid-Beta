package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15263a;
    public LayoutInflater f15264b;
    public k f15265c;
    public ExpandedMenuView d;
    public w f15266e;
    public f f15267f;

    public g(ContextWrapper contextWrapper) {
        this.f15263a = contextWrapper;
        this.f15264b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f15266e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f15267f;
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
        if (this.f15263a != null) {
            this.f15263a = context;
            if (this.f15264b == null) {
                this.f15264b = LayoutInflater.from(context);
            }
        }
        this.f15265c = kVar;
        f fVar = this.f15267f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15274a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15295a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.b bVar = (g.b) b0Var.f4203c;
        g gVar = new g(bVar.f10096a);
        obj.f15297c = gVar;
        gVar.f15266e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15297c;
        if (gVar2.f15267f == null) {
            gVar2.f15267f = new f(gVar2);
        }
        bVar.f10102i = gVar2.f15267f;
        bVar.f10103j = obj;
        View view = d0Var.f15286o;
        if (view != null) {
            bVar.f10099e = view;
        } else {
            bVar.f10098c = d0Var.f15285n;
            bVar.d = d0Var.f15284m;
        }
        bVar.h = obj;
        g.f e7 = b0Var.e();
        obj.f15296b = e7;
        e7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15296b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15296b.show();
        w wVar = this.f15266e;
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
        this.f15265c.q(this.f15267f.getItem(i10), this, 0);
    }
}
