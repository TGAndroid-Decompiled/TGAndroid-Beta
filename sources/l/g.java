package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f11031a;
    public LayoutInflater f11032b;
    public k f11033c;
    public ExpandedMenuView d;
    public w e;
    public f f11034f;

    public g(ContextWrapper contextWrapper) {
        this.f11031a = contextWrapper;
        this.f11032b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z4) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.c(kVar, z4);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        f fVar = this.f11034f;
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
        if (this.f11031a != null) {
            this.f11031a = context;
            if (this.f11032b == null) {
                this.f11032b = LayoutInflater.from(context);
            }
        }
        this.f11033c = kVar;
        f fVar = this.f11034f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f11040a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f11060a = d0Var;
        p2.w wVar = new p2.w(context);
        g.c cVar = (g.c) wVar.f41030c;
        g gVar = new g(cVar.f6234a);
        obj.f11062c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f11062c;
        if (gVar2.f11034f == null) {
            gVar2.f11034f = new f(gVar2);
        }
        cVar.f6239i = gVar2.f11034f;
        cVar.f6240j = obj;
        View view = d0Var.f11051o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f6236c = d0Var.f11050n;
            cVar.d = d0Var.f11049m;
        }
        cVar.h = obj;
        g.f d = wVar.d();
        obj.f11061b = d;
        d.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f11061b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f11061b.show();
        w wVar2 = this.e;
        if (wVar2 != null) {
            wVar2.e0(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f11033c.q(this.f11034f.getItem(i10), this, 0);
    }
}
