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
    public Context f19163a;
    public LayoutInflater f19164b;
    public k f19165c;
    public ExpandedMenuView d;
    public w f19166e;
    public f f19167f;

    public g(ContextWrapper contextWrapper) {
        this.f19163a = contextWrapper;
        this.f19164b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f19166e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f19167f;
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
        if (this.f19163a != null) {
            this.f19163a = context;
            if (this.f19164b == null) {
                this.f19164b = LayoutInflater.from(context);
            }
        }
        this.f19165c = kVar;
        f fVar = this.f19167f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f19174a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f19195a = d0Var;
        b3.j jVar = new b3.j(context);
        g.b bVar = (g.b) jVar.f2873c;
        g gVar = new g((ContextThemeWrapper) bVar.f12924c);
        obj.f19197c = gVar;
        gVar.f19166e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f19197c;
        if (gVar2.f19167f == null) {
            gVar2.f19167f = new f(gVar2);
        }
        bVar.f12931l = gVar2.f19167f;
        bVar.f12932m = obj;
        View view = d0Var.f19186o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f12925e = d0Var.f19185n;
            bVar.f12926f = d0Var.f19184m;
        }
        bVar.f12930k = obj;
        g.f g10 = jVar.g();
        obj.f19196b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f19196b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f19196b.show();
        w wVar = this.f19166e;
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
        this.f19165c.q(this.f19167f.getItem(i7), this, 0);
    }
}
