package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f17406a;
    public LayoutInflater f17407b;
    public k f17408c;
    public ExpandedMenuView d;
    public w f17409e;
    public f f17410f;

    public g(ContextWrapper contextWrapper) {
        this.f17406a = contextWrapper;
        this.f17407b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final void b(k kVar, boolean z10) {
        w wVar = this.f17409e;
        if (wVar != null) {
            wVar.b(kVar, z10);
        }
    }

    @Override
    public final boolean c(m mVar) {
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        f fVar = this.f17410f;
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
        if (this.f17406a != null) {
            this.f17406a = context;
            if (this.f17407b == null) {
                this.f17407b = LayoutInflater.from(context);
            }
        }
        this.f17408c = kVar;
        f fVar = this.f17410f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f17417a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f17438a = d0Var;
        e5.u uVar = new e5.u(context);
        g.b bVar = (g.b) uVar.f9634c;
        g gVar = new g((ContextThemeWrapper) bVar.f11649c);
        obj.f17440c = gVar;
        gVar.f17409e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f17440c;
        if (gVar2.f17410f == null) {
            gVar2.f17410f = new f(gVar2);
        }
        bVar.f11656l = gVar2.f17410f;
        bVar.f11657m = obj;
        View view = d0Var.f17429o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f11650e = d0Var.f17428n;
            bVar.f11651f = d0Var.f17427m;
        }
        bVar.f11655k = obj;
        g.f e10 = uVar.e();
        obj.f17439b = e10;
        e10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f17439b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f17439b.show();
        w wVar = this.f17409e;
        if (wVar != null) {
            wVar.E(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j10) {
        this.f17408c.q(this.f17410f.getItem(i3), this, 0);
    }
}
