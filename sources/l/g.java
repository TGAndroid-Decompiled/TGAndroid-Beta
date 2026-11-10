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
    public Context f17663a;
    public LayoutInflater f17664b;
    public k f17665c;
    public ExpandedMenuView d;
    public w f17666e;
    public f f17667f;

    public g(ContextWrapper contextWrapper) {
        this.f17663a = contextWrapper;
        this.f17664b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z9) {
        w wVar = this.f17666e;
        if (wVar != null) {
            wVar.c(kVar, z9);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        f fVar = this.f17667f;
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
        if (this.f17663a != null) {
            this.f17663a = context;
            if (this.f17664b == null) {
                this.f17664b = LayoutInflater.from(context);
            }
        }
        this.f17665c = kVar;
        f fVar = this.f17667f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f17674a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f17695a = d0Var;
        f5.u uVar = new f5.u(context);
        g.b bVar = (g.b) uVar.f11196c;
        g gVar = new g((ContextThemeWrapper) bVar.f13267c);
        obj.f17697c = gVar;
        gVar.f17666e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f17697c;
        if (gVar2.f17667f == null) {
            gVar2.f17667f = new f(gVar2);
        }
        bVar.f13274l = gVar2.f17667f;
        bVar.f13275m = obj;
        View view = d0Var.f17686o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f13268e = d0Var.f17685n;
            bVar.f13269f = d0Var.f17684m;
        }
        bVar.f13273k = obj;
        g.f g10 = uVar.g();
        obj.f17696b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f17696b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f17696b.show();
        w wVar = this.f17666e;
        if (wVar != null) {
            wVar.A(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        this.f17665c.q(this.f17667f.getItem(i7), this, 0);
    }
}
