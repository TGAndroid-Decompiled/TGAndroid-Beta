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
    public Context f19194a;
    public LayoutInflater f19195b;
    public k f19196c;
    public ExpandedMenuView d;
    public w f19197e;
    public f f19198f;

    public g(ContextWrapper contextWrapper) {
        this.f19194a = contextWrapper;
        this.f19195b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f19197e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f19198f;
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
        if (this.f19194a != null) {
            this.f19194a = context;
            if (this.f19195b == null) {
                this.f19195b = LayoutInflater.from(context);
            }
        }
        this.f19196c = kVar;
        f fVar = this.f19198f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f19205a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f19226a = d0Var;
        b3.j jVar = new b3.j(context);
        g.b bVar = (g.b) jVar.f2915c;
        g gVar = new g((ContextThemeWrapper) bVar.f12958c);
        obj.f19228c = gVar;
        gVar.f19197e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f19228c;
        if (gVar2.f19198f == null) {
            gVar2.f19198f = new f(gVar2);
        }
        bVar.f12965l = gVar2.f19198f;
        bVar.f12966m = obj;
        View view = d0Var.f19217o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f12959e = d0Var.f19216n;
            bVar.f12960f = d0Var.f19215m;
        }
        bVar.f12964k = obj;
        g.f g10 = jVar.g();
        obj.f19227b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f19227b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f19227b.show();
        w wVar = this.f19197e;
        if (wVar != null) {
            wVar.C(d0Var);
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
        this.f19196c.q(this.f19198f.getItem(i7), this, 0);
    }
}
