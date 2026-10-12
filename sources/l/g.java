package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f14973a;
    public LayoutInflater f14974b;
    public k f14975c;
    public ExpandedMenuView d;
    public w f14976e;
    public f f14977f;

    public g(ContextWrapper contextWrapper) {
        this.f14973a = contextWrapper;
        this.f14974b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f14976e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f14977f;
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
        if (this.f14973a != null) {
            this.f14973a = context;
            if (this.f14974b == null) {
                this.f14974b = LayoutInflater.from(context);
            }
        }
        this.f14975c = kVar;
        f fVar = this.f14977f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f14984a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15005a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.b bVar = (g.b) b0Var.f4202c;
        g gVar = new g(bVar.f10095a);
        obj.f15007c = gVar;
        gVar.f14976e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15007c;
        if (gVar2.f14977f == null) {
            gVar2.f14977f = new f(gVar2);
        }
        bVar.f10101i = gVar2.f14977f;
        bVar.f10102j = obj;
        View view = d0Var.f14996o;
        if (view != null) {
            bVar.f10098e = view;
        } else {
            bVar.f10097c = d0Var.f14995n;
            bVar.d = d0Var.f14994m;
        }
        bVar.h = obj;
        g.f f7 = b0Var.f();
        obj.f15006b = f7;
        f7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15006b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15006b.show();
        w wVar = this.f14976e;
        if (wVar != null) {
            wVar.x(d0Var);
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
        this.f14975c.q(this.f14977f.getItem(i10), this, 0);
    }
}
