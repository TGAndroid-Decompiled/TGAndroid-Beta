package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f16543a;
    public LayoutInflater f16544b;
    public k f16545c;
    public ExpandedMenuView d;
    public w f16546e;
    public f f16547f;

    public g(ContextWrapper contextWrapper) {
        this.f16543a = contextWrapper;
        this.f16544b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z10) {
        w wVar = this.f16546e;
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
        f fVar = this.f16547f;
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
        if (this.f16543a != null) {
            this.f16543a = context;
            if (this.f16544b == null) {
                this.f16544b = LayoutInflater.from(context);
            }
        }
        this.f16545c = kVar;
        f fVar = this.f16547f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f16554a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f16575a = d0Var;
        n2.w wVar = new n2.w(context);
        g.c cVar = (g.c) wVar.f18361c;
        g gVar = new g(cVar.f6946a);
        obj.f16577c = gVar;
        gVar.f16546e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f16577c;
        if (gVar2.f16547f == null) {
            gVar2.f16547f = new f(gVar2);
        }
        cVar.f6952i = gVar2.f16547f;
        cVar.f6953j = obj;
        View view = d0Var.f16566o;
        if (view != null) {
            cVar.f6949e = view;
        } else {
            cVar.f6948c = d0Var.f16565n;
            cVar.d = d0Var.f16564m;
        }
        cVar.h = obj;
        g.f d = wVar.d();
        obj.f16576b = d;
        d.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f16576b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f16576b.show();
        w wVar2 = this.f16546e;
        if (wVar2 != null) {
            wVar2.j(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j10) {
        this.f16545c.q(this.f16547f.getItem(i9), this, 0);
    }
}
