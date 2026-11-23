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
    public Context f19262a;
    public LayoutInflater f19263b;
    public k f19264c;
    public ExpandedMenuView d;
    public w f19265e;
    public f f19266f;

    public g(ContextWrapper contextWrapper) {
        this.f19262a = contextWrapper;
        this.f19263b = LayoutInflater.from(contextWrapper);
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
    public final void d() {
        f fVar = this.f19266f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void f(k kVar, boolean z10) {
        w wVar = this.f19265e;
        if (wVar != null) {
            wVar.f(kVar, z10);
        }
    }

    @Override
    public final void h(w wVar) {
        throw null;
    }

    @Override
    public final void i(Context context, k kVar) {
        if (this.f19262a != null) {
            this.f19262a = context;
            if (this.f19263b == null) {
                this.f19263b = LayoutInflater.from(context);
            }
        }
        this.f19264c = kVar;
        f fVar = this.f19266f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f19273a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f19294a = d0Var;
        b3.j jVar = new b3.j(context);
        g.b bVar = (g.b) jVar.f2874c;
        g gVar = new g((ContextThemeWrapper) bVar.f12923c);
        obj.f19296c = gVar;
        gVar.f19265e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f19296c;
        if (gVar2.f19266f == null) {
            gVar2.f19266f = new f(gVar2);
        }
        bVar.f12930l = gVar2.f19266f;
        bVar.f12931m = obj;
        View view = d0Var.f19285o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f12924e = d0Var.f19284n;
            bVar.f12925f = d0Var.f19283m;
        }
        bVar.f12929k = obj;
        g.f f10 = jVar.f();
        obj.f19295b = f10;
        f10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f19295b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f19295b.show();
        w wVar = this.f19265e;
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
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        this.f19264c.q(this.f19266f.getItem(i7), this, 0);
    }
}
