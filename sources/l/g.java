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
    public Context f19169a;
    public LayoutInflater f19170b;
    public k f19171c;
    public ExpandedMenuView d;
    public w f19172e;
    public f f19173f;

    public g(ContextWrapper contextWrapper) {
        this.f19169a = contextWrapper;
        this.f19170b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f19172e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f19173f;
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
        if (this.f19169a != null) {
            this.f19169a = context;
            if (this.f19170b == null) {
                this.f19170b = LayoutInflater.from(context);
            }
        }
        this.f19171c = kVar;
        f fVar = this.f19173f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f19180a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f19201a = d0Var;
        b3.j jVar = new b3.j(context);
        g.b bVar = (g.b) jVar.f2902c;
        g gVar = new g((ContextThemeWrapper) bVar.f12932c);
        obj.f19203c = gVar;
        gVar.f19172e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f19203c;
        if (gVar2.f19173f == null) {
            gVar2.f19173f = new f(gVar2);
        }
        bVar.f12939l = gVar2.f19173f;
        bVar.f12940m = obj;
        View view = d0Var.f19192o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f12933e = d0Var.f19191n;
            bVar.f12934f = d0Var.f19190m;
        }
        bVar.f12938k = obj;
        g.f g10 = jVar.g();
        obj.f19202b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f19202b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f19202b.show();
        w wVar = this.f19172e;
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
        this.f19171c.q(this.f19173f.getItem(i7), this, 0);
    }
}
