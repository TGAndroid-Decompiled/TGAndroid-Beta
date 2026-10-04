package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15158a;
    public LayoutInflater f15159b;
    public k f15160c;
    public ExpandedMenuView d;
    public w f15161e;
    public f f15162f;

    public g(ContextWrapper contextWrapper) {
        this.f15158a = contextWrapper;
        this.f15159b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z10) {
        w wVar = this.f15161e;
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
        f fVar = this.f15162f;
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
        if (this.f15158a != null) {
            this.f15158a = context;
            if (this.f15159b == null) {
                this.f15159b = LayoutInflater.from(context);
            }
        }
        this.f15160c = kVar;
        f fVar = this.f15162f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15169a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15190a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f4153c;
        g gVar = new g(cVar.f10026a);
        obj.f15192c = gVar;
        gVar.f15161e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15192c;
        if (gVar2.f15162f == null) {
            gVar2.f15162f = new f(gVar2);
        }
        cVar.f10032i = gVar2.f15162f;
        cVar.f10033j = obj;
        View view = d0Var.f15181o;
        if (view != null) {
            cVar.f10029e = view;
        } else {
            cVar.f10028c = d0Var.f15180n;
            cVar.d = d0Var.f15179m;
        }
        cVar.h = obj;
        g.g e7 = b0Var.e();
        obj.f15191b = e7;
        e7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15191b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15191b.show();
        w wVar = this.f15161e;
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
        this.f15160c.q(this.f15162f.getItem(i10), this, 0);
    }
}
