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
    public Context f17660a;
    public LayoutInflater f17661b;
    public k f17662c;
    public ExpandedMenuView d;
    public w f17663e;
    public f f17664f;

    public g(ContextWrapper contextWrapper) {
        this.f17660a = contextWrapper;
        this.f17661b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z9) {
        w wVar = this.f17663e;
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
        f fVar = this.f17664f;
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
        if (this.f17660a != null) {
            this.f17660a = context;
            if (this.f17661b == null) {
                this.f17661b = LayoutInflater.from(context);
            }
        }
        this.f17662c = kVar;
        f fVar = this.f17664f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f17671a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f17692a = d0Var;
        f5.u uVar = new f5.u(context);
        g.b bVar = (g.b) uVar.f11191c;
        g gVar = new g((ContextThemeWrapper) bVar.f13265c);
        obj.f17694c = gVar;
        gVar.f17663e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f17694c;
        if (gVar2.f17664f == null) {
            gVar2.f17664f = new f(gVar2);
        }
        bVar.f13272l = gVar2.f17664f;
        bVar.f13273m = obj;
        View view = d0Var.f17683o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f13266e = d0Var.f17682n;
            bVar.f13267f = d0Var.f17681m;
        }
        bVar.f13271k = obj;
        g.f g10 = uVar.g();
        obj.f17693b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f17693b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f17693b.show();
        w wVar = this.f17663e;
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
        this.f17662c.q(this.f17664f.getItem(i7), this, 0);
    }
}
